package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LatestNews {

	public static WebDriver driver;

	@Given("I open the buyrebtbd homepage news")
	public void i_open_the_buyrebtbd_homepage_news() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@When("I verify latest news text")
	public void i_verify_latest_news_text() {

		WebElement element = driver.findElement(By.xpath("//div[@class='section-title']/h3[1]"));

		System.out.println(element.getText());

	}

	@When("verify text for realestate housing association")
	public void verify_text_for_realestate_housing_association() {

		WebElement element = driver.findElement(By.xpath("//article[1]/h4[@class='post-title' and 1]/a[1]"));

		System.out.println(element.getText());

	}

	@When("The ultimate real estate")
	public void the_ultimate_real_estate() {

		WebElement element = driver.findElement(By.xpath("//article[2]/h4[@class='post-title' and 1]/a[1]"));

		System.out.println(element.getText());

	}

	@Then("I verify rent vs buy")
	public void i_verify_rent_vs_buy() {

		WebElement element = driver.findElement(By.xpath("//article[3]/h4[@class='post-title' and 1]/a[1]"));

		System.out.println(element.getText());

	}

	@Then("close the website after latest verification done")
	public void close_the_website_after_latest_verification_done() {

		driver.quit();

	}

}
