package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LetUsCallYou {

	public static WebDriver driver;

	@Given("I open website")
	public void i_open_website() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@When("I enter name")
	public void i_enter_name() {

		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("cfos-name")).clear();
		driver.findElement(By.id("cfos-name")).sendKeys("Juliana Rios" + currentTime);

	}

	@When("email")
	public void email() {

		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("cfos-email")).clear();
		driver.findElement(By.id("cfos-email")).sendKeys("sabbirahamedcs@gmail.com" + currentTime);

	}

	@When("phone number")
	public void phone_number() {

		driver.findElement(By.id("cfos-number")).sendKeys("8622324967");

	}

	@When("type message")
	public void type_message() {

		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("cfos-message")).clear();
		driver.findElement(By.id("cfos-message"))
				.sendKeys("Hi world!!! Welcome to my automation testing world." + currentTime);

	}

	@Then("I validate the submit button")
	public void i_validate_the_submit_button() {

		boolean isDisplayed = driver.findElement(By.id("submit-button")).isDisplayed();

		boolean isEnbled = driver.findElement(By.id("submit-button")).isEnabled();

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

	@Then("close the webpage")
	public void close_the_webpage() {

		driver.quit();

	}

}
