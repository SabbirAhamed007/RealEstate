package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArsiNagarBosila {

	public static WebDriver driver;

	@Given("I open Arsi Nagar Bosila")
	public void i_open_arsi_nagar_bosila() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get(
				"https://buyrentbd.com/property/exclusive-1230-sft-1250-sft-apartment-sale-at-arshi-nagar-bosila-near-mohammadpur/");

	}

	@When("I verify text in Arsi Nagar Bosila")
	public void i_verify_text_in_arsi_nagar_bosila() {

		driver.findElement(By.xpath("//div[@class='content clearfix']/p[1]")).click();

		driver.findElement(By.xpath("//div[@class='text_exposed_show']/p[1]")).click();

	}

	@When("I verify monthly mortgage payment for Arsi Nagar Bosila")
	public void i_verify_monthly_mortgage_payment_for_arsi_nagar_bosila() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("106000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("9.9");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("9");

		driver.findElement(By.id("mc-submit")).click();
	}

	@Then("I validate leave a reply for Arsi Nagar Bosila")
	public void i_validate_leave_a_reply_for_arsi_nagar_bosila() {

		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("comment")).clear();
		driver.findElement(By.id("comment")).sendKeys("This is my testing comment" + currentTime);

		driver.findElement(By.id("author")).clear();
		driver.findElement(By.id("author")).sendKeys("Sabbir Ahamed" + currentTime);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("sabbirahamedcs@gmail.com" + currentTime);

		driver.findElement(By.id("url")).clear();
		driver.findElement(By.id("url")).sendKeys("https://buyrentbd.com" + currentTime);

		boolean isDisplayed = driver.findElement(By.id("submit")).isDisplayed();

		boolean isEnbled = driver.findElement(By.id("submit")).isEnabled();

		if (isDisplayed) {
			System.out.println("Button is Displayed");

		} else {
			System.out.println("Button is not Displayed");

		}

		if (isEnbled) {
			System.out.println("Button is Enbled");

		} else {
			System.out.println("Button is not Enbled");

		}

	}

	@Then("close the browser for Arsi Nagar Bosila")
	public void close_the_browser_for_arsi_nagar_bosila() {

		driver.quit();

	}

}
