package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwanMostofa {

	public static WebDriver driver;

	@Given("I open Swan Mostofa apartment page")
	public void i_open_swan_mostofa_apartment_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com/property/swan-mostofa-mention/");

	}

	@Given("change the picture for Swan Mostofa apartment")
	public void change_the_picture_for_swan_mostofa_apartment() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text for Swan Mostofa apartment")
	public void i_verify_text_for_swan_mostofa_apartment() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']"));

		System.out.println(element.getText());

	}

	@When("I verify monthly mortgage payment for Swan Mostofa apartment")
	public void i_verify_monthly_mortgage_payment_for_swan_mostofa_apartment() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("450000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("8.8");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("14");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("close the browser for Swan Mostofa apartment")
	public void close_the_browser_for_swan_mostofa_apartment() {

		driver.quit();

	}

}
