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

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/010d5ca1-ea08-4564-8351-6154ba11c4ed
@TestModellerModule(guid = "010d5ca1-ea08-4564-8351-6154ba11c4ed")
public class Login_and_next extends BasePage
{
	public Login_and_next (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier NextElem = new WebIdentifier(By.xpath("//INPUT[@id='idSIButton9']"), 100023l);;

	private WebIdentifier loginfmtElem = new WebIdentifier(By.xpath("//INPUT[@id='i0116']"), 100022l);;


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://login.microsoftonline.com/itfandango.onmicrosoft.com/wsfed?wa=wsignin1.0&wtrealm=spn%3a00000015-0000-0000-c000-000000000000&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f%253fcmp%253dUSMF%2526mi%253dDefaultDashboard&wct=2024-01-18T12%3a46%3a54Z&wreply=https%3a%2f%2fitf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com%2f";

        if (!currentUrl.equals("https://login.microsoftonline.com/itfandango.onmicrosoft.com/wsfed?wa=wsignin1.0&wtrealm=spn%3a00000015-0000-0000-c000-000000000000&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f%253fcmp%253dUSMF%2526mi%253dDefaultDashboard&wct=2024-01-18T12%3a46%3a54Z&wreply=https%3a%2f%2fitf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com%2f")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Click Next
     * @name Click Next
     */
    public void Click_Next()
    {
         
        WebElement elem = getWebElement(NextElem);

        if (elem == null) {
            failStep("Click_Next", "Click_Next failed. Identifier Error: Unable to locate object: " + NextElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.click();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) m_Driver;
                executor.executeScript("arguments[0].click();", elem);
            }

            passStepWithScreenshot("Click_Next");    
        }

        m_Driver.switchTo().defaultContent();
    }
      
	/**
 	 * Enter loginfmt
     * @name Enter loginfmt
     */
 	public void Enter_loginfmt(String loginfmt)
 	{
 	    
 		WebElement elem = getWebElement(loginfmtElem);

 		if (elem == null) {
            failStep("Enter_loginfmt", "Enter_loginfmt failed. Identifier Error: Unable to locate object: " + loginfmtElem + " For guidance, visit: https://knowledge.curiositysoftware.ie/docs/xpaths-101 + ");
        } else {
            try {
                elem.clear();
                elem.sendKeys(loginfmt);
            } catch (Exception e) {
    		    JavascriptExecutor jse = (JavascriptExecutor) m_Driver;
    		    jse.executeScript("arguments[0].value='" + loginfmt + "';", elem);
            }
    
      		passStep("Enter_loginfmt " + loginfmt);    
        }

 		m_Driver.switchTo().defaultContent();
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://login.microsoftonline.com/itfandango.onmicrosoft.com/wsfed?wa=wsignin1.0&wtrealm=spn%3a00000015-0000-0000-c000-000000000000&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f%253fcmp%253dUSMF%2526mi%253dDefaultDashboard&wct=2024-01-18T12%3a46%3a54Z&wreply=https%3a%2f%2fitf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com%2f");

		passStepWithScreenshot("Go to URL - https://login.microsoftonline.com/itfandango.onmicrosoft.com/wsfed?wa=wsignin1.0&wtrealm=spn%3a00000015-0000-0000-c000-000000000000&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f%253fcmp%253dUSMF%2526mi%253dDefaultDashboard&wct=2024-01-18T12%3a46%3a54Z&wreply=https%3a%2f%2fitf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com%2f");
	}
}