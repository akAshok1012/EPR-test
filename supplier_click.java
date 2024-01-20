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

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/21ad1133-46c4-4d4a-8e94-be4df47459cf
@TestModellerModule(guid = "21ad1133-46c4-4d4a-8e94-be4df47459cf")
public class supplier_click extends BasePage
{
	public supplier_click (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Supplier_clickElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Supplier account']/../input"), 100038l);;


	
     
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
 	 * Enter Supplier click
     * @name Enter Supplier click
     */
 	public void Enter_Supplier_click(String Supplier_click)
 	{
 	    
 		WebElement elem = getWebElement(Supplier_clickElem);

 		if (elem == null) {
            failStep("Enter_Supplier_click", "Enter_Supplier_click failed. Identifier Error: Unable to locate object: " + Supplier_clickElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.clear();
                elem.sendKeys(Supplier_click);
            } catch (Exception e) {
    		    JavascriptExecutor jse = (JavascriptExecutor) m_Driver;
    		    jse.executeScript("arguments[0].value='" + Supplier_click + "';", elem);
            }
    
      		passStep("Enter_Supplier_click " + Supplier_click);    
        }

 		m_Driver.switchTo().defaultContent();
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}