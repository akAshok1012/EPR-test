package pages;
import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilities.selenium.WebIdentifier;

import com.jayway.jsonpath.JsonPath;

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/d487b4a1-8480-4b34-8f03-0e83caaac96e
@TestModellerModule(guid = "d487b4a1-8480-4b34-8f03-0e83caaac96e")
public class All_purchase_orders_Finance_and_Operations extends BasePage
{
	public All_purchase_orders_Finance_and_Operations (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Supplier_accountElem = new WebIdentifier(By.xpath("//INPUT[@id='VendTable_AccountNum_11811_0_19_input']"), 100035l);;


	
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage";

        if (!currentUrl.equals("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Supplier account
     * @name Select Supplier account
     */
    public void Select_Supplier_account(String Supplier_account)
 	{
 	    
 		WebElement elem = getWebElement(Supplier_accountElem);

 		if (elem == null) {
            failStep(m_Driver, "Select_Supplier_account", "Select_Supplier_account failed. Identifier Error: Unable to locate object: " + Supplier_accountElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
     		Select dropdown = new Select(elem);
    
     		dropdown.selectByVisibleText(Supplier_account);

     		passStep("Select_Supplier_account " + Supplier_account);    
        }

 		m_Driver.switchTo().defaultContent();
 	}
}