package genericScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basepage 
{
	public WebDriver driver;
	@BeforeMethod
	public void Browserlaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
