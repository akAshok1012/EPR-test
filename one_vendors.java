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

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/67c554c2-c8ef-4fdf-8869-2e59270cbdc5
@TestModellerModule(guid = "67c554c2-c8ef-4fdf-8869-2e59270cbdc5")
public class one_vendors extends BasePage
{
	public one_vendors (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier vendor_selectionElem = new WebIdentifier(By.xpath("/html/body/form/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/input"), 100046l);;


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T10%3A23%3A00.3477300Z&cmp=USMF&mi=PurchTableListPage";

        if (!currentUrl.equals("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T10%3A23%3A00.3477300Z&cmp=USMF&mi=PurchTableListPage")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * DoubleClick vendor selection
     * @name DoubleClick vendor selection
     */
	public void DoubleClick_vendor_selection()
	{
	    (new pages.WebGeneralActionsFunctions(m_Driver)).DoubleClick(vendor_selectionElem);
	}
	
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T10%3A23%3A00.3477300Z&cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T10%3A23%3A00.3477300Z&cmp=USMF&mi=PurchTableListPage");
	}
}