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

// https://aws.cloud.testinsights.io/app/#!/module-collection/guid/f861a803-0a17-4427-a3fd-298cf610a1e5
@TestModellerModule(guid = "f861a803-0a17-4427-a3fd-298cf610a1e5")
public class site_drop_list_select extends BasePage
{
	public site_drop_list_select (WebDriver driver)
	{
		super(driver);
	}


	
	private WebIdentifier SItes_list_selectElem = new WebIdentifier(By.xpath("/html/body/form/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/div/div/input"), 100054l);;


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T10%3A56%3A18.0183105Z&cmp=USMF&mi=PurchTableListPage";

        if (!currentUrl.equals("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T10%3A56%3A18.0183105Z&cmp=USMF&mi=PurchTableListPage")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * DoubleClick SItes  list select
     * @name DoubleClick SItes  list select
     */
	public void DoubleClick_SItes_list_select()
	{
	    (new pages.WebGeneralActionsFunctions(m_Driver)).DoubleClick(SItes_list_selectElem);
	}
	
	public void GoToUrl()
	{
		m_Driver.get("https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T10%3A56%3A18.0183105Z&cmp=USMF&mi=PurchTableListPage");

		passStepWithScreenshot("Go to URL - https://itf02-trn8e2694b95fc6b036aos.axcloud.dynamics.com/?t=2024-01-19T10%3A56%3A18.0183105Z&cmp=USMF&mi=PurchTableListPage");
	}
}