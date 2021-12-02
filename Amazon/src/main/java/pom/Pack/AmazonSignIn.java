package pom.Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignIn {
private WebDriver driver;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signin;
	
	public AmazonSignIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void sendEmail() {
	email.sendKeys("swapnil.wadhavane@gmail.com");
		
	}
	public void clickOnContinue(){
		Continue.click();	
	}
	public void sendPassword() {
		password.sendKeys("Swapnil@1998");
	}
	public void clickOnSignIN() {
		signin.click();
	}
}
