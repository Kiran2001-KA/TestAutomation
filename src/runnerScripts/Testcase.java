package runnerScripts;

import org.testng.annotations.Test;

import genericScripts.Basepage;
import pageObject.Login_page;

public class Testcase extends Basepage
{
	@Test
	public void Login() throws InterruptedException
	{
		Login_page lp = new Login_page(driver);
		lp.Enterusn(); Thread.sleep(2000);
		lp.Enterpsw();Thread.sleep(2000);
		lp.Clicklogin();Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		lp.Enterusn();Thread.sleep(2000);
		lp.Enterpsw();Thread.sleep(2000);
		lp.Clicklogin();Thread.sleep(2000);
		
	}

}
