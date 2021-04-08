package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NorthBreeze {

	public static WebDriver driver;

	@Given("I open North Breeze page")
	public void i_open_north_breeze_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com/property/north-breeze-tower/");

	}

	@When("I verify text in North Breeze")
	public void i_verify_text_in_north_breeze() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']"));

		System.out.println(element.getText());

		WebElement element1 = driver.findElement(By.xpath("//div[@class='left-box']/h3[1]"));

		System.out.println(element1.getText());

	}

	@When("I verify monthly mortgage payment for North Breeze")
	public void i_verify_monthly_mortgage_payment_for_north_breeze() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("250000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("6.5");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("18");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("I validate leave a reply for North Breeze")
	public void i_validate_leave_a_reply_for_north_breeze() {

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

	@Then("close the browser for North Breeze")
	public void close_the_browser_for_north_breeze() {

		driver.quit();

	}

}
