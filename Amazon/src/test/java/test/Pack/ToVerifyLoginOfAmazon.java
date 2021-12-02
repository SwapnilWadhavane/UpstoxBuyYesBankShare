package test.Pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Pack.BaseOrRojo;

import pom.Pack.AmazonSignIn;
import pom.Pack.AmzonLogOut;
import pom.Pack.ClickOnAll;


public class ToVerifyLoginOfAmazon extends BaseOrRojo  {

	WebDriver driver;
	AmazonSignIn AmazonSignIn;
	ClickOnAll ClickOnAll;
	AmzonLogOut amzonLogOut;
 @BeforeTest	
 @Parameters("browser")
	public void launchBrowser(String browser) {
		if (browser.equals("Chrome")) {
			driver = openChromeBrowser();
		}
		if (browser.equals("Edge")) {
			driver = openMicrosoftEdge();
		}
		if (browser.equals("FireFOx")) {
			driver = openFireFoxDriver();
		}
		
		
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 }
	
	@BeforeClass
	public void launchApplication() {
		 
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		AmazonSignIn = new AmazonSignIn(driver);
		ClickOnAll = new ClickOnAll(driver);
		amzonLogOut = new AmzonLogOut(driver);
	}
	@BeforeMethod
	public void loginToAmazon() {
	
		AmazonSignIn.sendEmail();
		AmazonSignIn.clickOnContinue();
		AmazonSignIn.sendPassword();
		AmazonSignIn.clickOnSignIN();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
				
	}
	@Test
	public void clickOnAll() {
			ClickOnAll.actionOnAll();
		}
	
	@AfterMethod
	public void LogoutAmazon() {
		
		amzonLogOut.LogOut();
		}
	
  @AfterClass
  public void clear() {
	  AmazonSignIn = null;
	  ClickOnAll = null;
	  amzonLogOut = null;
  }
  
  @AfterTest
  public void closedBrowser() {
	  driver.quit();
	  driver = null;
	  System.gc();
  }
	
}
