package pageClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class StepTwo extends BaseClass {

	public StepTwo(WebDriver driver) {
		BaseClass.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"licensePlateLookup\"]/div[4]/button")
	WebElement dontHavePlate;

	public void dontHavePlate() {
		dontHavePlate.click();
		// return PageFactory.initElements(driver,stepThree.class);
	}

	@FindBy(xpath = "//*[@id=\"year-select-select\"]")
	WebElement vehicleYear;

	public void setVehicleYear(String year) {
		vehicleYear.sendKeys(year);
	}

	@FindBy(xpath = "//*[@id=\"make-visualRadioGroup\"]/div/div/div/div[1]/label")
	WebElement chevrolet;

	public void selectChevrolet() {
		chevrolet.click();
	}

	@FindBy(xpath = "//*[@id=\"vehicleSpecs-model-select\"]")
	WebElement vehicleModel;

	@FindBy(xpath = "//*[@id=\"vehicleSpecs-trim-select\"]")
	WebElement vehicleTrim;

	@FindBy(xpath = "//*[@id=\"vehicleSpecs-bodyStyle-select\"]")
	WebElement vehicleStyle;

	public void setVehicleSpecs(String vehicleModel, String vehicleTrim, String vehicleStyle) {
		this.vehicleModel.sendKeys(vehicleModel);
		this.vehicleModel.sendKeys(Keys.ENTER);

		this.vehicleTrim.sendKeys(vehicleTrim);
		this.vehicleTrim.sendKeys(Keys.ENTER);

		this.vehicleStyle.sendKeys(vehicleStyle);
		this.vehicleStyle.sendKeys(Keys.ENTER);
	}

	@FindBy(xpath = "//*[@id=\"vehicleSpecs\"]/button")
	WebElement next;

	public void clickNext() {
		next.click();

	}

	@FindBy(xpath = "//*[@id=\"ownership-radio\"]/div/div/label[1]/span")
	WebElement fullPaid;

	@FindBy(xpath = "//*[@id=\"ownership-radio\"]/div/div/label[2]/span")
	WebElement finance;

	@FindBy(xpath = "//*[@id=\"ownership-radio\"]/div/div/label[3]/span")
	WebElement lease;

	public void owenerShip(String type) {
		if (type.toLowerCase().equals("fullPaid")) {
			fullPaid.click();
		} else if (type.toLowerCase().equals("finance")) {
			finance.click();
		} else {
			lease.click();
		}

	}

	@FindBy(xpath = "//*[@id=\"garagingAddressIndicator-radio\"]/div/div/label[1]/span")
	WebElement yes;

	@FindBy(xpath = "//*[@id=\"garagingAddressIndicator-radio\"]/div/div/label[2]/span")
	WebElement no;

	public void CarKeptAtGivenAddress(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			yes.click();
		} else {
			no.click();
		}
	}

	@FindBy(xpath = "//*[@id=\"purchaseYear-input-input\"]")
	WebElement purchaseYear;

	public void purchaseYear(String year) {
		purchaseYear.sendKeys(year);

	}

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/form/button")
	WebElement saveAndContinue;

	public StepThree saveAndContinue() {
		saveAndContinue.click();
		return PageFactory.initElements(driver, StepThree.class);
	}



}
