package pom.Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyShare {
  Actions act;
	private WebDriver driver;
	
	@FindBy(xpath="//div[@id='NSE_EQ-11915']")
	private WebElement yesBank;
	
	@FindBy(xpath="//*[contains(@viewBox,'0 0 24 24')]")
	private WebElement clickOnBuy;
	
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement selectQuantity;
	
	public BuyShare (WebDriver driver) {
		this.driver=driver;
		act= new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnYesbank() {
		act.moveToElement(yesBank).click().moveToElement(clickOnBuy).click().moveToElement(selectQuantity).click().build().perform();
	}
}
