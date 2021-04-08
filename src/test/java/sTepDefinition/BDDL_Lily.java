package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDL_Lily {

	public static WebDriver driver;

	@Given("I open BDDL Lily flat page")
	public void i_open_bddl_lily_flat_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com/property/bddl-lily-bashundhara-k-block-dhaka-bangladesh/");

	}

	@Given("change the picture for BDDL Lily flat")
	public void change_the_picture_for_bddl_lily_flat() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text for BDDL Lily flat")
	public void i_verify_text_for_bddl_lily_flat() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']"));

		System.out.println(element.getText());

	}

	@When("I verify monthly mortgage payment for BDDL Lily flat")
	public void i_verify_monthly_mortgage_payment_for_bddl_lily_flat() {
		
		driver.findElement(By.id("mc-total-amount")).sendKeys("30000000");

		driver.findElement(By.id("mc-down-payment")).sendKeys("640000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("9.9");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("16");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("close the browser for BDDL Lily flat")
	public void close_the_browser_for_bddl_lily_flat() {
		
		driver.quit();

	}

}
