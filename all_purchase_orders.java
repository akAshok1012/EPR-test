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

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/ed0ae263-e12c-4fbb-b5f2-2002df88ee73
@TestModellerModule(guid = "ed0ae263-e12c-4fbb-b5f2-2002df88ee73")
public class all_purchase_orders extends BasePage
{
	public all_purchase_orders (WebDriver driver)
	{
		super(driver);
	}


	
	private By All_purchase_ordersElem = By.cssSelector("DIV[aria-posinset='\\31 ']");
	private WebIdentifier Collapse_the_navigation_paneElem = new WebIdentifier(By.xpath("//DIV[@id='modulesPaneOpener']"), 100028l);;


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=DefaultDashboard";

        if (!currentUrl.equals("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=DefaultDashboard")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click All purchase orders
     * @name Click All purchase orders
     */
    public void Click_All_purchase_orders()
    {
         
        WebElement elem = getWebElement(All_purchase_ordersElem);

        if (elem == null) {
            failStep("Click_All_purchase_orders", "Click_All_purchase_orders failed. Identifier Error: Unable to locate object: " + All_purchase_ordersElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_All_purchase_orders");    
        }

        m_Driver.switchTo().defaultContent();
    }
      
	/**
 	 * Click Collapse the navigation pane
     * @name Click Collapse the navigation pane
     */
    public void Click_Collapse_the_navigation_pane()
    {
         
        WebElement elem = getWebElement(Collapse_the_navigation_paneElem);

        if (elem == null) {
            failStep("Click_Collapse_the_navigation_pane", "Click_Collapse_the_navigation_pane failed. Identifier Error: Unable to locate object: " + Collapse_the_navigation_paneElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Collapse_the_navigation_pane");    
        }

        m_Driver.switchTo().defaultContent();
    }
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=DefaultDashboard");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=DefaultDashboard");
	}
}