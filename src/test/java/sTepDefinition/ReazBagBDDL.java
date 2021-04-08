package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReazBagBDDL {

	public static WebDriver driver;

	@Given("I open BDDL Reaz Bag flat page")
	public void i_open_bddl_reaz_bag_flat_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get(
				"https://buyrentbd.com/property/bddl-gold-palace-%e0%a6%ac%e0%a6%bf%e0%a6%a1%e0%a6%bf%e0%a6%a1%e0%a6%bf%e0%a6%8f%e0%a6%b2-%e0%a6%97%e0%a7%8b%e0%a6%b2%e0%a7%8d%e0%a6%a1-%e0%a6%aa%e0%a7%8d%e0%a6%af%e0%a6%be%e0%a6%b2%e0%a7%87/");

	}

	@Given("change the picture for BDDL Reaz Bag flat")
	public void change_the_picture_for_bddl_reaz_bag_flat() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text for BDDL Reaz Bag flat")
	public void i_verify_text_for_bddl_reaz_bag_flat() {

		WebElement element = driver.findElement(By.xpath("//div[@class='content clearfix']"));

		System.out.println(element.getText());

	}

	@When("I verify monthly mortgage payment for BDDL Reaz Bag flat")
	public void i_verify_monthly_mortgage_payment_for_bddl_reaz_bag_flat() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("500000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("7.5");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("18");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("close the browser for BDDL Reaz Bag flat")
	public void close_the_browser_for_bddl_reaz_bag_flat() {

		driver.quit();

	}

}
