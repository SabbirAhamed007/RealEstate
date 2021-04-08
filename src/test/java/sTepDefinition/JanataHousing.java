package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JanataHousing {

	public static WebDriver driver;

	@Given("I open Janata Housing")
	public void i_open_janata_housing() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get(
				"https://buyrentbd.com/property/%e0%a6%ae%e0%a6%bf%e0%a6%b0%e0%a6%aa%e0%a7%81%e0%a6%b0-%e0%a7%a8-%e0%a6%8f%e0%a6%b0-%e0%a6%9c%e0%a6%a8%e0%a6%a4%e0%a6%be-%e0%a6%b9%e0%a6%be%e0%a6%89%e0%a6%9c%e0%a6%bf%e0%a6%82-%e0%a6%86%e0%a6%ac/");

	}

	@Given("change the picture for Janata Housing")
	public void change_the_picture_for_janata_housing() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text in Janata Housing")
	public void i_verify_text_in_janata_housing() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']"));

		System.out.println(element.getText());

		WebElement element1 = driver.findElement(By.xpath("//p[11]"));

		System.out.println(element1.getText());

	}

	@When("I verify monthly mortgage payment for Janata Housing")
	public void i_verify_monthly_mortgage_payment_for_janata_housing() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("105000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("8.9");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("18");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("I validate leave a reply for Janata Housing")
	public void i_validate_leave_a_reply_for_janata_housing() {

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

	@Then("close the browser for Janata Housing")
	public void close_the_browser_for_janata_housing() {

		driver.quit();

	}

}
