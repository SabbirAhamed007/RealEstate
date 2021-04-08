/**
 * 
 */
package Testcases;

import java.util.concurrent.TimeUnit;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import buyrentbdPages.LetUsCallYou;

/**
 * @author ubox0
 *
 */
public class VerifyLetUsCallYou {

	@Test
	public void verifyLetUSCallYou() {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\ChromeSetup.exe");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
		
		driver.get("https://buyrentbd.com/");
		
		
		LetUsCallYou letuscallyou = new LetUsCallYou(driver);
		
		letuscallyou.typeYourname();
		letuscallyou.typeEmail();
		letuscallyou.typeNumber();
		letuscallyou.typeMessage();
		letuscallyou.typeClickOnButton();
		
		
		driver.quit();
		
		
	}

}
