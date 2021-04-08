package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Al_Kaif {

	public static WebDriver driver;

	@Given("I open Al Kaif flat page")
	public void i_open_al_kaif_flat_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com/property/al-kaif-dokhinbari-baitul-aman-housing-society-adabor-dhaka/");

	}

	@Given("change the picture for Al Kaif flat")
	public void change_the_picture_for_al_kaif_flat() {

		driver.findElement(By.xpath("//a[@class='flex-next']")).click();

		driver.findElement(By.xpath("//a[@class='flex-prev']")).click();

	}

	@When("I verify text for Al Kaif flat")
	public void i_verify_text_for_al_kaif_flat() {

		WebElement element = driver.findElement(By.xpath("//div[@class='sec-title']"));

		System.out.println(element.getText());

		WebElement element1 = driver.findElement(By.xpath("//div/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]"));

		System.out.println(element1.getText());

	}

	@When("I verify monthly mortgage payment for Al Kaif flat")
	public void i_verify_monthly_mortgage_payment_for_al_kaif_flat() {

		driver.findElement(By.id("mc-down-payment")).sendKeys("100000");

		driver.findElement(By.id("mc-interest-rate")).sendKeys("14.6");

		driver.findElement(By.id("mc-mortgage-period")).sendKeys("10");

		driver.findElement(By.id("mc-submit")).click();

	}

	@Then("close the browser for Al Kaif flat")
	public void close_the_browser_for_al_kaif_flat() {

		driver.quit();

	}

}
