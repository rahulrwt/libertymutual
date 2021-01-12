package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDetailsRepo {

	
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
	
	@FindBy(xpath = "//*[@id=\"residentialAddress-streetAddress-input\"]")
	WebElement address1;

	@FindBy(xpath = "//*[@id=\"residentialAddress-additionalStreetAddress-input\"]")
	WebElement address2;

	@FindBy(xpath = "//*[@id=\"residentialAddress-zipCode-input\"]")
	WebElement zipCode1;
	
	@FindBy(xpath = "//*[@id=\"residentialAddress\"]/button")
	WebElement nextAddressDetails;
	

	@FindBy(xpath = "//*[@id=\"priorAddressIndicator-radio\"]/div/div/label[1]/span")
	WebElement yesElement;

	@FindBy(xpath = "//*[@id=\"priorAddressIndicator-radio\"]/div/div/label[2]/span")
	WebElement noElement;
	
	@FindBy(xpath = "//*[@id=\"priorAddress-streetAddress-input\"]")
	WebElement address11;

	@FindBy(xpath = "//*[@id=\"priorAddress-additionalStreetAddress-input\"]")
	WebElement address22;

	@FindBy(xpath = "//*[@id=\"priorAddress-zipCode-input\"]")
	WebElement zipCode2;
	
	@FindBy(xpath = "//*[@id=\"priorAddress\"]/button")
	WebElement next;
	
	@FindBy(xpath = "//*[@id=\"emailAddress-input-input\"]")
	WebElement emailElement;
	
	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/form/button")
	WebElement saveAndContinue;

	public WebElement getOkThanks() {
		return okThanks;
	}

	public WebElement getFirstNameElement() {
		return firstNameElement;
	}

	public WebElement getLastNameElement() {
		return lastNameElement;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getNextPersonalDetails() {
		return nextPersonalDetails;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getZipCode1() {
		return zipCode1;
	}

	public WebElement getNextAddressDetails() {
		return nextAddressDetails;
	}

	public WebElement getYesElement() {
		return yesElement;
	}

	public WebElement getNoElement() {
		return noElement;
	}

	public WebElement getAddress11() {
		return address11;
	}

	public WebElement getAddress22() {
		return address22;
	}

	public WebElement getZipcode2() {
		return zipCode2;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getEmailElement() {
		return emailElement;
	}

	public WebElement getSaveAndContinue() {
		return saveAndContinue;
	}

	
}
