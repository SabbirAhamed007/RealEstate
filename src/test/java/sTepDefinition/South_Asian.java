package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class South_Asian {

	public static WebDriver driver;

	@Given("I open south asian flat page")
	public void i_open_south_asian_flat_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com/property/south-asian-holdings-ltd/");

	}

	@When("I verify text for south asian flat")
	public void i_verify_text_for_south_asian_flat() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']/p[1]"));

		System.out.println(element.getText());

	}

	@When("I verify monthly mortgage payment for south asian flat")
	public void i_verify_monthly_mortgage_payment_for_south_asian_flat() {

		driver.findElement(By.id("mc-total-amount")).sendKeys("50000000");

		driver.findElement(By.id("mc-down-payment")).sendKeys("100000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("5.4");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("20");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("close the browser for south asian flat")
	public void close_the_browser_for_south_asian_flat() {

		driver.quit();

	}

}
