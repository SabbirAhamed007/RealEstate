package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UttarBadda {

	public static WebDriver driver;

	@Given("I open Uttar Badda page")
	public void i_open_uttar_badda_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get(
				"https://buyrentbd.com/property/%e0%a6%89%e0%a6%a4%e0%a7%8d%e0%a6%a4%e0%a6%b0-%e0%a6%ac%e0%a6%be%e0%a6%a1%e0%a7%8d%e0%a6%a1%e0%a6%be%e0%a7%9f-%e0%a7%a7%e0%a7%a8%e0%a7%a7%e0%a7%a6-%e0%a6%b8%e0%a7%8d%e0%a6%95%e0%a7%9f%e0%a6%be/");

	}

	@Given("change the picture for Uttar Badda")
	public void change_the_picture_for_uttar_badda() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text in Uttar Badda")
	public void i_verify_text_in_uttar_badda() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']/p[1]"));

		System.out.println(element.getText());

		WebElement element1 = driver.findElement(By.xpath("//div[@class='content clearfix']/p[2]"));

		System.out.println(element1.getText());

	}

	@When("I verify monthly mortgage payment for Uttar Badda")
	public void i_verify_monthly_mortgage_payment_for_uttar_badda() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("150000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("8");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("12");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("I validate leave a reply for Uttar Badda")
	public void i_validate_leave_a_reply_for_uttar_badda() {

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

	@Then("close the browser for Uttar Badda")
	public void close_the_browser_for_uttar_badda() {

		driver.quit();

	}

}
