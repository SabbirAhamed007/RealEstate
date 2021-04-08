package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TriplexHouse {

	public static WebDriver driver;

	@Given("I open Triplex house page")
	public void i_open_triplex_house_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com/property/triplex-house/");

	}

	@Given("change the picture for Triplex house")
	public void change_the_picture_for_triplex_house() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text for Triplex house")
	public void i_verify_text_for_triplex_house() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']/div[1]"));

		System.out.println(element.getText());

	}

	@When("I verify monthly mortgage payment for Triplex house")
	public void i_verify_monthly_mortgage_payment_for_triplex_house() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("276000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("10.8");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("5");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("close the browser for Triplex house")
	public void close_the_browser_for_triplex_house() {

		driver.quit();

	}

}
