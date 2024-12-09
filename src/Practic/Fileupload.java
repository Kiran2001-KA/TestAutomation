package Practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
    public static void main(String[] args) throws InterruptedException
    {
       
        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        
       
        WebDriver driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
        
        
        driver.get("file:///C:/Users/DELL/Desktop/Html/filrupload.html"); Thread.sleep(2000);
        
        
        WebElement uploadElement = driver.findElement(By.id("file"));
        
      
        uploadElement.sendKeys("C:\\Users\\DELL\\OneDrive\\Me\\Kiran-Kumar-QA_Tester_Sample1.pdf");
        Thread.sleep(2000);
       
        Thread.sleep(2000);
        
      
        driver.quit();
    }
}
