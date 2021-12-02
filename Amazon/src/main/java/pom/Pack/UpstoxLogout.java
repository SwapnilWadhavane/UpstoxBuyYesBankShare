package pom.Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogout {

	private WebDriver driver;
	Actions act;
	
	@FindBy (xpath="//div[@class='_12UhW4HH2gtq9ECNp6EuO- _2EpF-08pQxhylQ_9WdU5Ps']")
	private WebElement myaccount;
	
	@FindBy (xpath="//div[text()='Logout']")
	private WebElement logout;
	
	
	public UpstoxLogout(WebDriver driver) {
		this.driver=driver;
		act=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void upstoxLogout() {
		act.moveToElement(myaccount).click().moveToElement(logout).click().build().perform();
	}
}
