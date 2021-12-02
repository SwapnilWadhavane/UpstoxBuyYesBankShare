package test.Pack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Pack.BaseOrRojo;
import pom.Pack.BuyShare;
import pom.Pack.UpstoxFavourites;
import pom.Pack.UpstoxLogout;
import pom.Pack.UpstoxsignIN;

public class BuyYesBankShare extends BaseOrRojo {
	
	private WebDriver driver;
	UpstoxsignIN upstox;
	UpstoxFavourites favourtes;
	BuyShare buy;
	UpstoxLogout logout;
	
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
	}
	@BeforeClass
	public void launchApplication() {
		
		driver.get("https://login-v2.upstox.com/?client_id=PW3-6Agd37PB52Q6B6DDpYWLuT7b&platform_id=PW3&redirect_path=%2Forder&redirect_uri=https%3A%2F%2Fpro.upstox.com");
	    driver.manage().window().maximize();
	    upstox = new UpstoxsignIN(driver);
	    favourtes = new UpstoxFavourites(driver);
	    buy = new BuyShare(driver);
	   logout = new UpstoxLogout(driver);
	}
	@BeforeMethod
	public void loginToUpstox() {
		upstox.sendUserID();
		upstox.sendPassword();
		upstox.clickOnSignIn();
		upstox.sendYearOfBirth();
	}
	
	@Test
	public void clickOnFavourite() {
		favourtes.clickOnDropbox();
		favourtes.clickOnFavourites();
	}
	
	@Test
	public void BuyYesBankShare() {
		buy.clickOnYesbank();
		
	}
	@AfterMethod
	public void logoutUpstox() {
		logout.upstoxLogout();
	}
	@AfterClass
	public void clear() {
		upstox = null;
		favourtes =null;
		buy=null;
		logout =null;
		
	}
	@AfterTest
	public void close() {
		  driver.quit();
		  driver = null;
		  System.gc();
	}
	
	
	}

