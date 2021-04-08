/**
 * 
 */
package buyrentbdPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author ubox0
 * 
 *         This class will store all the locator and method of Let us call you
 *
 */
public class LetUsCallYou {

	WebDriver driver;

	By yourName = By.id("cfos-name");

	By email = By.id("cfos-email");

	By Number = By.id("cfos-number");

	By message = By.id("cfos-message");

	By submit = By.id("submit-button");

	// now i am taking constructor and constructor having the same name as class
	// name
	// will paramiterized this constructor

	public LetUsCallYou(WebDriver driver) {

		this.driver = driver;

	}

	public void typeYourname() {

		driver.findElement(yourName).sendKeys("Sabbir Ahamed");

	}

	public void typeEmail() {

		driver.findElement(email).sendKeys("sabbirahamedcs@gmail.com");

	}

	public void typeNumber() {

		driver.findElement(Number).sendKeys("8622324967");

	}

	public void typeMessage() {

		driver.findElement(message).sendKeys("Hi ! Sabbir");

	}

	public void typeClickOnButton() {

		driver.findElement(submit).click();

	}

}
