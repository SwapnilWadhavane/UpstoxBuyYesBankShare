package pom.Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnAll {
	@FindBy (xpath ="//a[@id='nav-hamburger-menu']")
	private WebElement all;
	
	@FindBy (xpath ="//div[text() ='Mobiles, Computers']")
	private WebElement mobiles;
	
	@FindBy (xpath ="//a[text() ='All Mobile Phones']")
	private WebElement allmobile;
	
	@FindBy (xpath ="//span[text() ='Electronics']")
	private WebElement electronics;
	
	@FindBy (xpath ="//span[text() ='Headphones']")
	private WebElement headphones;
	
	
	public ClickOnAll(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void actionOnAll() {
		all.click();
		mobiles.click();
		allmobile.click();
		electronics.click();
		headphones.click();
		
	}
}
