package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BananiReadyFlat {
	public static WebDriver driver;

	@Given("I open Banani Ready flat page")
	public void i_open_banani_ready_flat_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com/property/100-ready-flat-at-banani/");

	}

	@Given("change the picture for Banani Ready flat")
	public void change_the_picture_for_banani_ready_flat() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text for Banani Ready flat")
	public void i_verify_text_for_banani_ready_flat() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']"));

		System.out.println(element.getText());

		WebElement element1 = driver.findElement(By.xpath("//p[13]/a[1]"));

		System.out.println(element1.getText());

	}

	@When("I verify monthly mortgage payment for Banani Ready flat")
	public void i_verify_monthly_mortgage_payment_for_banani_ready_flat() {

		driver.findElement(By.id("mc-total-amount")).sendKeys("1160000");

		driver.findElement(By.id("mc-down-payment")).sendKeys("160000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("8.4");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("14");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("close the browser for Banani Ready flat")
	public void close_the_browser_for_banani_ready_flat() {

		driver.quit();

	}

}
