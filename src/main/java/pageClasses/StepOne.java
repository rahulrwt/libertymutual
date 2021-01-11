package pageClasses;

import java.security.DrbgParameters.NextBytes;
import java.util.concurrent.TimeUnit;
import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.beust.jcommander.ResourceBundle;

import baseClass.BaseClass;

public class StepOne extends BaseClass {
//***************************dynamic xpath*****************
	@FindBy(xpath = "//button[@class='lm-Button--icon lms-ButtonClose']")

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
		BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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

//	@FindBy(xpath = "//*[@id=\"residentialAddress-city-input\"]")
//	WebElement city;

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

//	public void setCity(String city) {
//		this.city.sendKeys(city);
//	}

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

//*********************************functions for no option********************
	@FindBy(xpath = "//*[@id=\"priorAddress-streetAddress-input\"]")
	WebElement address11;

	@FindBy(xpath = "//*[@id=\"priorAddress-additionalStreetAddress-input\"]")
	WebElement address22;

	@FindBy(xpath = "//*[@id=\"priorAddress-zipCode-input\"]")
	WebElement zipcode;

	
	
	
	public void whereDidYouLiveBefore(String address1,String address2,String zipcode)
	{
		address11.sendKeys(address1);
		address22.sendKeys(address2);
		this.zipcode.sendKeys(zipcode);
	}
	
	@FindBy(xpath = "//*[@id=\"priorAddress\"]/button")
	WebElement next;
	
	public void next()
	{
		next.click();
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