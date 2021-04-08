package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gold_Place {

	public static WebDriver driver;

	@Given("I open BDDL gold place flat page")
	public void i_open_bddl_gold_place_flat_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get(
				"https://buyrentbd.com/property/bddl-gold-palace-building-no-4-type-a-%e0%a6%ac%e0%a6%bf%e0%a6%a1%e0%a6%bf%e0%a6%a1%e0%a6%bf%e0%a6%8f%e0%a6%b2-%e0%a6%97%e0%a7%8b%e0%a6%b2%e0%a7%8d%e0%a6%a1-%e0%a6%aa%e0%a7%8d%e0%a6%af/");

	}

	@Given("change the picture for BDDL gold place flat")
	public void change_the_picture_for_bddl_gold_place_flat() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text for BDDL gold place flat")
	public void i_verify_text_for_bddl_gold_place_flat() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']"));

		System.out.println(element.getText());

	}

	@When("I verify monthly mortgage payment for BDDL gold place flat")
	public void i_verify_monthly_mortgage_payment_for_bddl_gold_place_flat() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("100000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("10.4");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("12");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("close the browser for BDDL gold place flat")
	public void close_the_browser_for_bddl_gold_place_flat() {

		driver.quit();

	}

}
