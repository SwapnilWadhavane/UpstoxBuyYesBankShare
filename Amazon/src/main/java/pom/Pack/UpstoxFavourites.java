package pom.Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxFavourites {

	private WebDriver driver;
	
	@FindBy(xpath="//*[contains(@viewBox,'0 0 24 24')]")
	private WebElement clickOnDropbox;
	
	@FindBy(xpath="//div[contains(@class,'JzsJv85TiZnTNf1LvgT0y')]")
	private WebElement selectfavourites;
	
	public UpstoxFavourites(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDropbox() {
		clickOnDropbox.click();
	}
	public void clickOnFavourites() {
		selectfavourites.click();
	}
}
