package base.Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseOrRojo {
	

	public WebDriver openChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Videos\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
   public WebDriver openFireFoxDriver() {
	   
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Videos\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
   }
   
   public WebDriver openMicrosoftEdge() {
	   System.setProperty("webdriver.edge.driver","C:\\Users\\Dell\\Videos\\msedgedriver.exe");
	   WebDriver driver = new EdgeDriver();
	   return driver;
   }
   
  
   
}
