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

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/1d477d54-5d89-4fcb-bdd3-a60fc1e30e03
@TestModellerModule(guid = "1d477d54-5d89-4fcb-bdd3-a60fc1e30e03")
public class askmelater extends BasePage
{
	public askmelater (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier ask_later_microsoftElem = new WebIdentifier(By.xpath("//INPUT[@id='btnAskLater']"), 100062l);;


	
	public void GoToUrl()
	{
		m_Driver.get("https://login.microsoftonline.com/itfandango.onmicrosoft.com/login");

		passStepWithScreenshot("Go to URL - https://login.microsoftonline.com/itfandango.onmicrosoft.com/login");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://login.microsoftonline.com/itfandango.onmicrosoft.com/login";

        if (!currentUrl.equals("https://login.microsoftonline.com/itfandango.onmicrosoft.com/login")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click ask later microsoft
     * @name Click ask later microsoft
     */
    public void Click_ask_later_microsoft()
    {
         
        WebElement elem = getWebElement(ask_later_microsoftElem);

        if (elem == null) {
            failStep("Click_ask_later_microsoft", "Click_ask_later_microsoft failed. Identifier Error: Unable to locate object: " + ask_later_microsoftElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_ask_later_microsoft");    
        }

        m_Driver.switchTo().defaultContent();
    }}