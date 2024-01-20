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

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/93876de0-5a45-41a1-9550-eeaf6cd2b824
@TestModellerModule(guid = "93876de0-5a45-41a1-9550-eeaf6cd2b824")
public class Warehouse extends BasePage
{
	public Warehouse (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier Warehouse_drop_navElem = new WebIdentifier(By.xpath("//label[normalize-space()= 'Warehouse']/../div/div"), 100057l);;

	private WebIdentifier warehouse_drop_GITElem = new WebIdentifier(By.xpath("/html/body/form/div[2]/div[1]/div/div/div/div[1]/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/input"), 100058l);;


	
     
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
 	 * Click Warehouse drop nav
     * @name Click Warehouse drop nav
     */
    public void Click_Warehouse_drop_nav()
    {
         
        WebElement elem = getWebElement(Warehouse_drop_navElem);

        if (elem == null) {
            failStep("Click_Warehouse_drop_nav", "Click_Warehouse_drop_nav failed. Identifier Error: Unable to locate object: " + Warehouse_drop_navElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Warehouse_drop_nav");    
        }

        m_Driver.switchTo().defaultContent();
    }
    
	/**
 	 * DoubleClick warehouse drop GIT
     * @name DoubleClick warehouse drop GIT
     */
	public void DoubleClick_warehouse_drop_GIT()
	{
	    (new pages.WebGeneralActionsFunctions(m_Driver)).DoubleClick(warehouse_drop_GITElem);
	}
	
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?cmp=USMF&mi=PurchTableListPage");
	}
}