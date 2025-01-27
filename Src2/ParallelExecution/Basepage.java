package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Basepage
{
	WebDriver driver;
	@Parameters("BrowserName")
	@BeforeMethod
	public void Browsersetup(String BrowserName)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		if(BrowserName.equals("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(BrowserName.equals("fire"))
		{
			driver = new FirefoxDriver();
		}
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}

}
