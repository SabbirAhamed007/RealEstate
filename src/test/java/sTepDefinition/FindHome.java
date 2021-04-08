package sTepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindHome {

	public static WebDriver driver;

	@Given("I open buyrentbd website")
	public void i_open_buyrentbd_website() {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://buyrentbd.com");

	}

	@When("I validate all the find your home option")
	public void i_validate_all_the_find_your_home_option() {

		driver.findElement(
				By.xpath("html/body/div[6]/div[1]/div/div/div/section/div/form/div[1]/div[1]/span/div/button")).click();

		driver.findElement(By.xpath(".//*[@id='bs-select-1-1']/span[2]")).click();

		driver.findElement(
				By.xpath("html/body/div[6]/div[1]/div/div/div/section/div/form/div[1]/div[2]/span/div/button")).click();

		driver.findElement(By.xpath(".//*[@id='bs-select-2-2']/span[2]")).click();

		driver.findElement(
				By.xpath("html/body/div[6]/div[1]/div/div/div/section/div/form/div[1]/div[3]/span/div/button")).click();

		driver.findElement(By.xpath(".//*[@id='bs-select-3-5']/span[2]")).click();

		driver.findElement(
				By.xpath("html/body/div[6]/div[1]/div/div/div/section/div/form/div[1]/div[4]/span/div/button")).click();

		driver.findElement(By.xpath(".//*[@id='bs-select-4-4']/span[2]")).click();

		driver.findElement(
				By.xpath("html/body/div[6]/div[1]/div/div/div/section/div/form/div[1]/div[5]/span/div/button")).click();

		driver.findElement(By.xpath(".//*[@id='bs-select-5-20']/span[2]")).click();

		driver.findElement(
				By.xpath("html/body/div[6]/div[1]/div/div/div/section/div/form/div[1]/div[8]/span/div/button")).click();

		driver.findElement(By.xpath(".//*[@id='bs-select-8-2']")).click();

		driver.findElement(
				By.xpath("html/body/div[6]/div[1]/div/div/div/section/div/form/div[1]/div[9]/span/div/button")).click();

		driver.findElement(By.xpath(".//*[@id='bs-select-9-2']")).click();

	}

	@Then("I close the browser")
	public void i_close_the_browser() {

		driver.quit();

	}

}
