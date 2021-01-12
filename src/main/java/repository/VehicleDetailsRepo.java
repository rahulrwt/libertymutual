package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleDetailsRepo {

	@FindBy(xpath = "//*[@id=\"licensePlateLookup\"]/div[4]/button")
	WebElement dontHavePlate;

	@FindBy(xpath = "//*[@id=\"licensePlateLookup-input-input\"]")
	WebElement VIN;

	@FindBy(xpath = "//input[@id  = 'vin-input-input']")
	WebElement VIN1;

	@FindBy(xpath = "//button[text() = 'Use VIN instead']")
	WebElement VINInstead;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement VINNext;

	@FindBy(xpath = "//*[@id=\"year-select-select\"]")
	WebElement vehicleYear;

	@FindBy(xpath = "//*[@id=\"make-visualRadioGroup\"]/div/div/div/div[1]/label")
	WebElement chevrolet;

	@FindBy(xpath = "//*[@id=\"vehicleSpecs-model-select\"]")
	WebElement vehicleModel;

	@FindBy(xpath = "//*[@id=\"vehicleSpecs-trim-select\"]")
	WebElement vehicleTrim;

	@FindBy(xpath = "//*[@id=\"vehicleSpecs-bodyStyle-select\"]")
	WebElement vehicleStyle;

	@FindBy(xpath = "//*[@id=\"vehicleSpecs\"]/button")
	WebElement next1;

	@FindBy(xpath = "//span[text()='Own (fully paid off)']")
	WebElement fullPaid;

	@FindBy(xpath = "//*[@id=\"ownership-radio\"]/div/div/label[2]/span")
	WebElement finance;

	@FindBy(xpath = "//*[@id=\"ownership-radio\"]/div/div/label[3]/span")
	WebElement lease;

	@FindBy(xpath = "//span[text() = 'Yes']")
	WebElement yes;
	@FindBy(xpath = "//span[text() = 'No']")
	WebElement no;

	@FindBy(xpath = "//*[@name='purchase-year']")
	WebElement purchaseYear;

	// ------------------------------no branch
	@FindBy(xpath = "//*[@id=\"garagingAddress-streetAddress-input\"]")
	WebElement address11;

	@FindBy(xpath = "//*[@id=\"garagingAddress-additionalStreetAddress-input\"]")
	WebElement address22;

	@FindBy(xpath = "//*[@id=\"garagingAddress-zipCode-input\"]")
	WebElement zipcode;

	@FindBy(xpath = "//*[@id=\"garagingAddress\"]/button")
	WebElement next;

	@FindBy(xpath = "//button[text() = 'Save and continue']")
	WebElement saveAndContinue;

	public WebElement getDontHavePlate() {
		return dontHavePlate;
	}

	public WebElement getVIN() {
		return VIN;
	}

	public WebElement getVIN1() {
		return VIN1;
	}

	public WebElement getVINInstead() {
		return VINInstead;
	}

	public WebElement getVINNext() {
		return VINNext;
	}

	public WebElement getVehicleYear() {
		return vehicleYear;
	}

	public WebElement getChevrolet() {
		return chevrolet;
	}

	public WebElement getVehicleModel() {
		return vehicleModel;
	}

	public WebElement getVehicleTrim() {
		return vehicleTrim;
	}

	public WebElement getVehicleStyle() {
		return vehicleStyle;
	}

	public WebElement getNext1() {
		return next1;
	}

	public WebElement getFullPaid() {
		return fullPaid;
	}

	public WebElement getFinance() {
		return finance;
	}

	public WebElement getLease() {
		return lease;
	}

	public WebElement getYes() {
		return yes;
	}

	public WebElement getNo() {
		return no;
	}

	public WebElement getPurchaseYear() {
		return purchaseYear;
	}

	public WebElement getAddress11() {
		return address11;
	}

	public WebElement getAddress22() {
		return address22;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getSaveAndContinue() {
		return saveAndContinue;
	}

	

}
