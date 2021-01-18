package pageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.UserDetailsRepo;

public class UserDetails extends BaseClass {

	UserDetailsRepo userDetailsRepo;

	public WebDriver getDriver() {
		return driver;
	}

	public UserDetails(WebDriver driver) {
		BaseClass.driver = driver;
		userDetailsRepo = new UserDetailsRepo(driver);
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void okThanksPopUp() {
		userDetailsRepo.getOkThanks().click();
	}

	public void setFirstName(String name) {
		userDetailsRepo.getFirstNameElement().sendKeys(name);
	}

	public void setLastName(String name) {
		userDetailsRepo.getLastNameElement().sendKeys(name);
	}

	public void setDOB(String dob) {
		userDetailsRepo.getDOB().sendKeys(dob);
	}

	public void clickNextPersonalDetails() {
		userDetailsRepo.getNextPersonalDetails().click();
	}

//	@FindBy(xpath = "//*[@id=\"residentialAddress-city-input\"]")
//	WebElement city;

	public void setAddress1(String address) {
		userDetailsRepo.getAddress1().sendKeys(address);
	}

	public void setAddress2(String address) {
		userDetailsRepo.getAddress2().sendKeys(address);
	}

	public void setZipCode(String zip) {
		userDetailsRepo.getZipCode1().sendKeys(zip);
	}

//	public void setCity(String city) {
//		this.city.sendKeys(city);
//	}

	public void clickNextAddressDetails() {
		userDetailsRepo.getNextAddressDetails().click();
	}

	public void lastThreeMonths(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			userDetailsRepo.getYesElement().click();
		} else {
			userDetailsRepo.getNoElement().click();
		}
	}

//*********************************functions for no option********************

	public void whereDidYouLiveBefore(String address1, String address2, String zipcode) {
		userDetailsRepo.getAddress11().sendKeys(address1);
		userDetailsRepo.getAddress22().sendKeys(address2);
		userDetailsRepo.getZipcode2().sendKeys(zipcode);
	}

	public void next() {
		userDetailsRepo.getNext().click();
	}

	public void setEmail(String email) {
		userDetailsRepo.getEmailElement().sendKeys(email);
	}

	public VehicleDetails clickContinue() {
		userDetailsRepo.getSaveAndContinue().click();

		return PageFactory.initElements(driver, VehicleDetails.class);

	}
}