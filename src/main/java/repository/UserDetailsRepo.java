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
		WebElement okThanks = driver.findElement(By.xpath("//button[@class='lm-Button--icon lms-ButtonClose']"));

		return okThanks;
	}

	public WebElement getFirstNameElement() {
		WebElement firstNameElement = driver.findElement(By.xpath("//*[@id=\"nameAndBirthDate-firstName-input\"]"));

		return firstNameElement;
	}

	public WebElement getLastNameElement() {
		WebElement lastNameElement = driver.findElement(By.xpath("//*[@id=\"nameAndBirthDate-lastName-input\"]"));

		return lastNameElement;
	}

	public WebElement getDOB() {
		WebElement DOB = driver.findElement(By.xpath("//*[@id=\"nameAndBirthDate-birthDate-input\"]"));

		return DOB;
	}

	public WebElement getNextPersonalDetails() {
		WebElement nextPersonalDetails = driver.findElement(By.xpath("//button[text() = 'Next']"));

		return nextPersonalDetails;
	}

	public WebElement getAddress1() {

		WebElement address1 = driver.findElement(By.xpath("//*[@id=\"residentialAddress-streetAddress-input\"]"));

		return address1;
	}

	public WebElement getAddress2() {

		WebElement address2 = driver
				.findElement(By.xpath("//*[@id=\"residentialAddress-additionalStreetAddress-input\"]"));

		return address2;
	}

	public WebElement getZipCode1() {

		WebElement zipCode1 = driver.findElement(By.xpath("//*[@id=\"residentialAddress-zipCode-input\"]"));

		return zipCode1;
	}

	public WebElement getNextAddressDetails() {
		WebElement nextAddressDetails = driver.findElement(By.xpath("//*[@id=\"residentialAddress\"]/button"));

		return nextAddressDetails;
	}

	public WebElement getYesElement() {
		WebElement yesElement = driver
				.findElement(By.xpath("//*[@id=\"priorAddressIndicator-radio\"]/div/div/label[1]/span"));

		return yesElement;
	}

	public WebElement getNoElement() {

		WebElement noElement = driver
				.findElement(By.xpath("//*[@id=\"priorAddressIndicator-radio\"]/div/div/label[2]/span"));

		return noElement;
	}

	public WebElement getAddress11() {
		WebElement address11 = driver.findElement(By.xpath("//*[@id=\"priorAddress-streetAddress-input\"]"));

		return address11;
	}

	public WebElement getAddress22() {
		WebElement address22 = driver.findElement(By.xpath("//*[@id=\"priorAddress-additionalStreetAddress-input\"]"));

		return address22;
	}

	public WebElement getZipcode2() {
		WebElement zipCode2 = driver.findElement(By.xpath("//*[@id=\"priorAddress-zipCode-input\"]"));

		return zipCode2;
	}

	public WebElement getNext() {
		WebElement next = driver.findElement(By.xpath("//*[@id=\"priorAddress\"]/button"));

		return next;
	}

	public WebElement getEmailElement() {
		WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"emailAddress-input-input\"]"));

		return emailElement;
	}

	public WebElement getSaveAndContinue() {

		WebElement saveAndContinue = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/form/button"));

		return saveAndContinue;
	}

	public ArrayList<WebElement> getErrorList() throws Exception {
		ArrayList<WebElement> errors = (ArrayList<WebElement>) driver
				.findElements(By.xpath("//ul[@class='lm-FieldGroupMessage is-error']/li/span"));
		return errors;
	}

}
