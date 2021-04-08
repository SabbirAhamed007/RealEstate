package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DreamwayIcon {

	public static WebDriver driver;

	@Given("I open dreamway Icon tower page")
	public void i_open_dreamway_icon_tower_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com/property/dreamway-icon-tower/");

	}

	@Given("change the picture for dreamway Icon tower")
	public void change_the_picture_for_dreamway_icon_tower() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text for dreamway Icon tower")
	public void i_verify_text_for_dreamway_icon_tower() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']"));

		System.out.println(element.getText());

	}

	@When("I verify monthly mortgage payment for dreamway Icon tower")
	public void i_verify_monthly_mortgage_payment_for_dreamway_icon_tower() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("740000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("11.0");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("25");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("close the browser for dreamway Icon tower")
	public void close_the_browser_for_dreamway_icon_tower() {

		driver.quit();

	}

}
