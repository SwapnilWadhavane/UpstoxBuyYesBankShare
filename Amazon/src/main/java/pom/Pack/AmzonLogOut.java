package pom.Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzonLogOut {
	Actions act ;
 private WebDriver driver;
	@FindBy (xpath = "//a[contains(@href,'https://www.amazon.in/gp/css/homepa')]")
	private WebElement accountsAndList;

	@FindBy (xpath = "//span[text()='Sign Out']")
	private WebElement signout;
	
	public AmzonLogOut(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void LogOut() {
		act.moveToElement(accountsAndList).moveToElement(signout).click().build().perform();
	}
}
