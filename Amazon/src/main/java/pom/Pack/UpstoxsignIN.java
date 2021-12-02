package pom.Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxsignIN {

	private WebDriver driver;
	
	@FindBy (xpath="//input[@id='userCode']")
	private WebElement UserID;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath="//div[text()='Sign into Upstox'")
	private WebElement SignIN;
	
	@FindBy (xpath ="//input[@id='yob']")
	private WebElement yob;
	
	public UpstoxsignIN( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserID() {
		UserID.sendKeys("JF0725");
	}
	public void sendPassword() {
		password.sendKeys("Swap@1998");
	}
	
	public void clickOnSignIn() {
		SignIN.click();
	}
	public void sendYearOfBirth() {
		yob.sendKeys("1998");
	}
	
}
