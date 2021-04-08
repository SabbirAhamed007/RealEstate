package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageText {

	public static WebDriver driver;

	@Given("I open buyrentd homepage")
	public void i_open_buyrentd_homepage() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@When("I verify vission text")
	public void i_verify_vission_text() {
		
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Where Dreams Come Home']"));

		System.out.println(element.getText());


	}

	@When("mission text")
	public void mission_text() {
		
		WebElement element = driver.findElement(By.xpath("//div[@class='home-slogan-text']/p[1]"));

		System.out.println(element.getText());

	}

	@Then("I close the website")
	public void i_close_the_website() {
		
		driver.quit();

	}

}
