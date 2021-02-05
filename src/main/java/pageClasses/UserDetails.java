package pageClasses;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.UserDetailsRepo;

public class UserDetails extends BaseClass {

	UserDetailsRepo userDetailsRepo;

	// Parameterized constructor
	public UserDetails(WebDriver driver) {
		BaseClass.driver = driver;
		userDetailsRepo = new UserDetailsRepo(driver);
	}

	// To close the pop-up
	public void okThanksPopUp() {
		userDetailsRepo.getOkThanks().click();
	}

	// Sets First Name
	public void setFirstName(String name) {
		userDetailsRepo.getFirstNameElement().sendKeys(name);
	}

	// Sets Last Name
	public void setLastName(String name) {
		userDetailsRepo.getLastNameElement().sendKeys(name);
	}

	// Sets DOB
	public void setDOB(String dob) {
		userDetailsRepo.getDOB().sendKeys(dob);
	}

	// Clicks on next
	public void clickNextPersonalDetails() {
		userDetailsRepo.getNextPersonalDetails().click();
	}

	// Sets Address1 details
	public void setAddress1(String address) {
		userDetailsRepo.getAddress1().sendKeys(address);
	}

	// Sets Address2 details
	public void setAddress2(String address) {
		userDetailsRepo.getAddress2().sendKeys(address);
	}

	// Sets Zip code
	public void setZipCode(String zip) {
		userDetailsRepo.getZipCode().sendKeys(zip);
	}

	// Clicks on next
	public void clickNextAddressDetails() {
		userDetailsRepo.getNextAddressDetails().click();
	}

	// Selects radio button whether stayed for last three month or not
	public void lastThreeMonths(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			userDetailsRepo.getYesElement().click();
		} else {
			userDetailsRepo.getNoElement().click();
		}
	}

	// *********************************functions for no option********************

	// Sets address details if user is not staying for 3 months
	public void whereDidYouLiveBefore(String address1, String address2, String zipcode) {
		userDetailsRepo.getAddress1_before().sendKeys(address1);
		userDetailsRepo.getAddress2_before().sendKeys(address2);
		userDetailsRepo.getZipcode_before().sendKeys(zipcode);
	}

	// Clicks on next
	public void next() {
		userDetailsRepo.getNext().click();
	}

	// Sets email address
	public void setEmail(String email) {
		userDetailsRepo.getEmailElement().sendKeys(email);
	}

	// Prints errors
	public void printErrors() throws Exception {
		printErrors(userDetailsRepo.getErrorList());
	}

	// redirects to VehicleDetails page and returns VehicleDetails object

	public VehicleDetails clickContinue() {
		userDetailsRepo.getSaveAndContinue().click();

		return PageFactory.initElements(driver, VehicleDetails.class);

	}

	public String returnErrors() {
		try {
			System.out.print("inside try");
			return returnErrors(userDetailsRepo.getErrorList());
		} catch (Exception e) {

			return "";
		}

	}

}