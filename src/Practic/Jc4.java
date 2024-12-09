package Practic;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Jc4
{
	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://offer.alibaba.com/cps/9ajj29e6?bm=cps&src=saf&gclid=EAIaIQobChMIqcP6k4qMigMVAGQPAh1gjzsbEAAYASAAEgKpP_D_BwE");
	      
	        Thread.sleep(1000);
	        JavascriptExecutor jp = (JavascriptExecutor) driver;
	        jp.executeScript("document.body.style.zoom='60%'");
		
	}

}
