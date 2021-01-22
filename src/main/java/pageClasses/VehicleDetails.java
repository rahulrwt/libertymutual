package pageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.VehicleDetailsRepo;

public class VehicleDetails extends BaseClass {

	VehicleDetailsRepo vehicleDetailsRepo;

	public VehicleDetails(WebDriver driver) {
		BaseClass.driver = driver;
		this.vehicleDetailsRepo = new VehicleDetailsRepo(driver);
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void dontHavePlate() {
		vehicleDetailsRepo.getDontHavePlate().click();
	}

	public void setVIN(String VIN) {
		vehicleDetailsRepo.getVIN().sendKeys(VIN);
	}

	public void setVIN1(String VIN) {
		vehicleDetailsRepo.getVIN1().sendKeys(VIN);

	}

	public void useVINInstead() {
		vehicleDetailsRepo.getVINInstead().click();

	}

	public void VINNext() {

		vehicleDetailsRepo.getVINNext().click();

	}

	// ****************Common functions for both branch******************

	public void ownerShip(String type) {
		if (type.toLowerCase().equals("own")) {
			vehicleDetailsRepo.getFullPaid().click();
		} else if (type.toLowerCase().equals("finance")) {
			vehicleDetailsRepo.getFinance().click();
		} else {
			vehicleDetailsRepo.getLease().click();
		}

	}

	public void CarKeptAtGivenAddress(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			vehicleDetailsRepo.getYes().click();
		} else {
			vehicleDetailsRepo.getNo().click();
		}
	}
	// ***********************Yes Branch*******************

	public void purchaseYear(String year) {

		vehicleDetailsRepo.getPurchaseYear().sendKeys(year);

	}

	// **********************No Branch*******************

	public void whereDoYouKeepIt(String address1, String address2, String zipcode) {
		vehicleDetailsRepo.getAddress11().sendKeys(address1);
		vehicleDetailsRepo.getAddress22().sendKeys(address2);
		vehicleDetailsRepo.getZipcode().sendKeys(zipcode);
	}

	public void next() {
		vehicleDetailsRepo.getNext().click();

	}

	public DriverDetails saveAndContinue() {

		vehicleDetailsRepo.getSaveAndContinue().click();

		return PageFactory.initElements(driver, DriverDetails.class);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void printErrors() throws Exception {
		printErrors(vehicleDetailsRepo.getErrorList());
	}
}
