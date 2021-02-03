package repository;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDetailsRepo {

	WebDriver driver;

	public UserDetailsRepo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getOkThanks() {
		return driver.findElement(By.xpath("//button[@class='lm-Button--icon lms-ButtonClose']"));

	}

	public WebElement getFirstNameElement() {
		return driver.findElement(By.xpath("//*[@id=\"nameAndBirthDate-firstName-input\"]"));

	}

	public WebElement getLastNameElement() {
		return driver.findElement(By.xpath("//*[@id=\"nameAndBirthDate-lastName-input\"]"));

	}

	public WebElement getDOB() {
		return driver.findElement(By.xpath("//*[@id=\"nameAndBirthDate-birthDate-input\"]"));

	}

	public WebElement getNextPersonalDetails() {
		return driver.findElement(By.xpath("//button[text() = 'Next']"));

	}

	public WebElement getAddress1() {

		return driver.findElement(By.xpath("//*[@id=\"residentialAddress-streetAddress-input\"]"));

	}

	public WebElement getAddress2() {

		return driver.findElement(By.xpath("//*[@id=\"residentialAddress-additionalStreetAddress-input\"]"));

	}

	public WebElement getZipCode() {

		return driver.findElement(By.xpath("//*[@id=\"residentialAddress-zipCode-input\"]"));

	}

	public WebElement getNextAddressDetails() {
		return driver.findElement(By.xpath("//*[@id=\"residentialAddress\"]/button"));

	}

	public WebElement getYesElement() {
		return driver.findElement(By.xpath("//*[@id=\"priorAddressIndicator-radio\"]/div/div/label[1]/span"));

	}

	public WebElement getNoElement() {

		return driver.findElement(By.xpath("//*[@id=\"priorAddressIndicator-radio\"]/div/div/label[2]/span"));

	}

	public WebElement getAddress1_before() {
		return driver.findElement(By.xpath("//*[@id=\"priorAddress-streetAddress-input\"]"));

	}

	public WebElement getAddress2_before() {
		return driver.findElement(By.xpath("//*[@id=\"priorAddress-additionalStreetAddress-input\"]"));

	}

	public WebElement getZipcode_before() {
		return driver.findElement(By.xpath("//*[@id=\"priorAddress-zipCode-input\"]"));

	}

	public WebElement getNext() {
		return driver.findElement(By.xpath("//*[@id=\"priorAddress\"]/button"));

	}

	public WebElement getEmailElement() {
		return driver.findElement(By.xpath("//*[@id=\"emailAddress-input-input\"]"));

	}

	public WebElement getSaveAndContinue() {

		return driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/form/button"));

	}

	public ArrayList<WebElement> getErrorList() throws Exception {
		return (ArrayList<WebElement>) driver
				.findElements(By.xpath("//ul[@class='lm-FieldGroupMessage is-error']/li/span"));

	}
}
