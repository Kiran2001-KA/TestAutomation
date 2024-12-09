package Practic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jc2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://offer.alibaba.com/cps/9ajj29e6?bm=cps&src=saf&gclid=EAIaIQobChMIqcP6k4qMigMVAGQPAh1gjzsbEAAYASAAEgKpP_D_BwE");
		Thread.sleep(2000);
		WebElement sc = driver.findElement(By.xpath("//div[@title=\"Search for matches\"]"));
		JavascriptExecutor jc = (JavascriptExecutor)driver;
		jc.executeScript("arguments[0].scrollIntoView()", sc);
		
	}

}
