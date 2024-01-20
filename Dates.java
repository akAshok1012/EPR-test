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

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/aefd4290-1b71-46ea-936d-23fc6575d4c2
@TestModellerModule(guid = "aefd4290-1b71-46ea-936d-23fc6575d4c2")
public class Dates extends BasePage
{
	public Dates (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Calender_iconElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Accounting date']/../div/div[2]/div"), 100068l);;

	private WebIdentifier select_dateElem = new WebIdentifier(By.xpath("//A[@id='idDay-20']"), 100069l);;


	
     
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
 	 * Click Calender_icon
     * @name Click Calender_icon
     */
    public void Click_Calender_icon()
    {
         
        WebElement elem = getWebElement(Calender_iconElem);

        if (elem == null) {
            failStep("Click_Calender_icon", "Click_Calender_icon failed. Identifier Error: Unable to locate object: " + Calender_iconElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Calender_icon");    
        }

        m_Driver.switchTo().defaultContent();
    }
      
	/**
 	 * Click select date
     * @name Click select date
     */
    public void Click_select_date()
    {
         
        WebElement elem = getWebElement(select_dateElem);

        if (elem == null) {
            failStep("Click_select_date", "Click_select_date failed. Identifier Error: Unable to locate object: " + select_dateElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_select_date");    
        }

        m_Driver.switchTo().defaultContent();
    }
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}