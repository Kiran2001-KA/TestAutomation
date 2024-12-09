package Practic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jc1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Html/jse.html");
		WebElement usn = driver.findElement(By.xpath("//input[@id='a1']"));
		JavascriptExecutor jc = (JavascriptExecutor)driver;
		jc.executeScript("arguments[0].value=''", usn);
		
	}

}
