package pageClasses;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.beust.jcommander.ResourceBundle;

import baseClass.BaseClass;

public class StepOne extends BaseClass {
//***************************dynamic xpath*****************
	@FindBy(xpath = "//*[@id=\"discount-marketing-modal\"]/footer/button")

	WebElement okThanks;

	@FindBy(xpath = "//*[@id=\"nameAndBirthDate-firstName-input\"]")
	WebElement firstNameElement;

	@FindBy(xpath = "//*[@id=\"nameAndBirthDate-lastName-input\"]")
	WebElement lastNameElement;

	@FindBy(xpath = "//*[@id=\"nameAndBirthDate-birthDate-input\"]")
	WebElement DOB;

	@FindBy(xpath = "//*[@id=\"nameAndBirthDate\"]/button")
	WebElement nextPersonalDetails;

	public WebDriver getDriver() {
		return driver;
	}

	public StepOne(WebDriver driver) {
		BaseClass.driver = driver;
	}

	public void okThanksPopUp() {
		okThanks.click();
	}

	public void setFirstName(String name) {
		firstNameElement.sendKeys(name);
	}

	public void setLastName(String name) {
		lastNameElement.sendKeys(name);
	}

	public void setDOB(String dob) {
		DOB.sendKeys(dob);
	}

	public void clickNextPersonalDetails() {
		nextPersonalDetails.click();
	}

	@FindBy(xpath = "//*[@id=\"residentialAddress-streetAddress-input\"]")
	WebElement address1;

	@FindBy(xpath = "//*[@id=\"residentialAddress-additionalStreetAddress-input\"]")
	WebElement address2;

	@FindBy(xpath = "//*[@id=\"residentialAddress-zipCode-input\"]")
	WebElement zipCode;

	@FindBy(xpath = "//*[@id=\"residentialAddress-city-input\"]")
	WebElement city;

	@FindBy(xpath = "//*[@id=\"residentialAddress\"]/button")
	WebElement nextAddressDetails;

	public void setAddress1(String address) {
		address1.sendKeys(address);
	}

	public void setAddress2(String address) {
		address2.sendKeys(address);
	}

	public void setZipCode(String zip) {
		zipCode.sendKeys(zip);
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public void clickNextAddressDetails() {
		nextAddressDetails.click();
	}

	@FindBy(xpath = "//*[@id=\"priorAddressIndicator-radio\"]/div/div/label[1]/span")
	WebElement yesElement;

	@FindBy(xpath = "//*[@id=\"priorAddressIndicator-radio\"]/div/div/label[2]/span")
	WebElement noElement;

	public void lastThreeMonths(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			yesElement.click();
		} else {
			noElement.click();
		}
	}

	@FindBy(xpath = "//*[@id=\"emailAddress-input-input\"]")
	WebElement emailElement;

	public void setEmail(String email) {
		emailElement.sendKeys(email);
	}

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/form/button")
	WebElement saveAndContinue;

	public StepTwo clickContinue() {
		saveAndContinue.click();

		return PageFactory.initElements(driver, StepTwo.class);

	}
}