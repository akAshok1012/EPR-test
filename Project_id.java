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

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/dd537000-9775-40c9-b203-8bc6977d2c24
@TestModellerModule(guid = "dd537000-9775-40c9-b203-8bc6977d2c24")
public class Project_id extends BasePage
{
	public Project_id (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Project_drop_navElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Project ID']/../div/div"), 100059l);;

	private WebIdentifier Project_nameElem = new WebIdentifier(By.xpath("//INPUT[@id='ProjTable_Name_6630_0_0_input']"), 100060l);;


	
     
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
 	 * Click Project drop nav
     * @name Click Project drop nav
     */
    public void Click_Project_drop_nav()
    {
         
        WebElement elem = getWebElement(Project_drop_navElem);

        if (elem == null) {
            failStep("Click_Project_drop_nav", "Click_Project_drop_nav failed. Identifier Error: Unable to locate object: " + Project_drop_navElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Project_drop_nav");    
        }

        m_Driver.switchTo().defaultContent();
    }
    
	/**
 	 * DoubleClick Project name
     * @name DoubleClick Project name
     */
	public void DoubleClick_Project_name()
	{
	    (new pages.WebGeneralActionsFunctions(m_Driver)).DoubleClick(Project_nameElem);
	}
	
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}