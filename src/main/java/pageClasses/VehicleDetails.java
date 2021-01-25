package pageClasses;

 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.VehicleDetailsRepo;

public class VehicleDetails extends BaseClass {

	VehicleDetailsRepo vehicleDetailsRepo;

	// Parameterized constructor
	public VehicleDetails(WebDriver driver) {
		BaseClass.driver = driver;
		this.vehicleDetailsRepo = new VehicleDetailsRepo(driver);
	}

	//Click on "don't have plate" if user not having plate info
	public void dontHavePlate() {
		vehicleDetailsRepo.getDontHavePlate().click();
	}

	//Sets VIN
	public void setVIN(String VIN) {
		vehicleDetailsRepo.getVIN().sendKeys(VIN);
	}

	//Sets VIN
	public void setVIN1(String VIN) {
		vehicleDetailsRepo.getVIN1().sendKeys(VIN);

	}

	//Clicks "use VIN instead" if user is having VIN info
	public void useVINInstead() {
		vehicleDetailsRepo.getVINInstead().click();

	}

	//Clicks on next
	public void VINNext() {

		vehicleDetailsRepo.getVINNext().click();

	}

	// ****************Common functions for both branch******************

	//Selects radio button for ownership
	public void ownerShip(String type) {
		if (type.toLowerCase().equals("own")) {
			vehicleDetailsRepo.getFullPaid().click();
		} else if (type.toLowerCase().equals("finance")) {
			vehicleDetailsRepo.getFinance().click();
		} else {
			vehicleDetailsRepo.getLease().click();
		}

	}

	//Selects radio button whether car is parked at given address or not
	public void CarKeptAtGivenAddress(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			vehicleDetailsRepo.getYes().click();
		} else {
			vehicleDetailsRepo.getNo().click();
		}
	}
	// ***********************Yes Branch*******************

	//If car is kept at given address then user has to set vehicle purchase year
	public void purchaseYear(String year) {

		vehicleDetailsRepo.getPurchaseYear().sendKeys(year);

	}

	// **********************No Branch*******************

	//If car is not kept at given address then user has to set current address
	public void whereDoYouKeepIt(String address1, String address2, String zipcode) {
		vehicleDetailsRepo.getAddress11().sendKeys(address1);
		vehicleDetailsRepo.getAddress22().sendKeys(address2);
		vehicleDetailsRepo.getZipcode().sendKeys(zipcode);
	}

	// Clicks on next
	public void next() {
		vehicleDetailsRepo.getNext().click();

	}
	// redirects to DriverDetails page and returns DriverDetails object

	public DriverDetails saveAndContinue() {

		vehicleDetailsRepo.getSaveAndContinue().click();

		return PageFactory.initElements(driver, DriverDetails.class);
	}

	// Print errors, if any on page
	public void printErrors() throws Exception {
		printErrors(vehicleDetailsRepo.getErrorList());
	}
}
