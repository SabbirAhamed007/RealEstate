package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer {

	public static WebDriver driver;

	@Given("I open website for footer")
	public void i_open_website_for_footer() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@When("I verify property type")
	public void i_verify_property_type() {

		WebElement element = driver
				.findElement(By.xpath("//section[@id='property_types_widget-2']/h3[@class='title' and 1]"));

		System.out.println(element.getText());

	}

	@When("recent posts")
	public void recent_posts() {

		WebElement element = driver.findElement(By.xpath("//section[@id='recent-posts-3']/h3[@class='title' and 1]"));

		System.out.println(element.getText());

	}

	@When("categories")
	public void categories() {

		WebElement element = driver.findElement(By.xpath("//section[@id='categories-6']/h3[@class='title' and 1]"));

		System.out.println(element.getText());

	}

	@Then("contract info")
	public void contract_info() {

		WebElement element = driver.findElement(By.xpath("//section[@id='text-1']/h3[@class='title' and 1]"));

		System.out.println(element.getText());

	}

	@Then("close website for footer check")
	public void close_website_for_footer_check() {

		driver.quit();

	}

}
