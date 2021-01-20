package repository;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 

import baseClass.BaseClass;

public class VehicleDetailsRepo extends BaseClass {

	WebDriver driver;

	public WebElement getDontHavePlate() {
		WebElement dontHavePlate = driver.findElement(By.xpath("//*[@id=\"licensePlateLookup\"]/div[4]/button"));
		return dontHavePlate;
	}

	public WebElement getVIN() {
		WebElement VIN = driver.findElement(By.xpath("//*[@id=\"licensePlateLookup-input-input\"]"));
		return VIN;
	}

	public WebElement getVIN1() {
		WebElement VIN1 = driver.findElement(By.xpath("//input[@id  ='vin-input-input']"));
		return VIN1;
	}

	public WebElement getVINInstead() {
		WebElement VINInstead = driver.findElement(By.xpath("//button[text() = 'Use VIN instead']"));
		return VINInstead;
	}

	public WebElement getVINNext() {
		WebElement VINNext = driver.findElement(By.xpath("//button[text()='Next']"));
		return VINNext;
	}

	public WebElement getVehicleYear() {
		WebElement vehicleYear = driver.findElement(By.xpath("//*[@id=\"year-select-select\"]"));
		return vehicleYear;
	}

	public WebElement getChevrolet() {
		WebElement chevrolet = driver
				.findElement(By.xpath("//*[@id=\"make-visualRadioGroup\"]/div/div/div/div[1]/label"));
		return chevrolet;
	}

	public WebElement getVehicleModel() {
		WebElement vehicleModel = driver.findElement(By.xpath("//*[@id=\"vehicleSpecs-model-select\"]"));
		return vehicleModel;
	}

	public WebElement getVehicleTrim() {
		WebElement vehicleTrim = driver.findElement(By.xpath("//*[@id=\"vehicleSpecs-trim-select\"]"));
		return vehicleTrim;
	}

	public WebElement getVehicleStyle() {
		WebElement vehicleStyle = driver.findElement(By.xpath("//*[@id=\"vehicleSpecs-bodyStyle-select\"]"));
		return vehicleStyle;
	}

	public WebElement getNext1() {
		WebElement next1 = driver.findElement(By.xpath("//*[@id=\"vehicleSpecs\"]/button"));
		return next1;
	}

	public WebElement getFullPaid() {
		WebElement fullPaid = driver.findElement(By.xpath("//span[text()='Own (fully paid off)']"));
		return fullPaid;
	}

	public WebElement getFinance() {
		WebElement finance = driver.findElement(By.xpath("//*[@id=\"ownership-radio\"]/div/div/label[2]/span"));
		return finance;
	}

	public WebElement getLease() {
		WebElement lease = driver.findElement(By.xpath("//*[@id=\"ownership-radio\"]/div/div/label[3]/span"));
		return lease;
	}

	public WebElement getYes() {
		WebElement yes = driver.findElement(By.xpath("//span[text() ='Yes']"));
		return yes;
	}

	public WebElement getNo() {
		WebElement no = driver.findElement(By.xpath("//span[text() ='No']"));
		return no;
	}

	public WebElement getPurchaseYear() {
		WebElement purchaseYear = driver.findElement(By.xpath("//*[@name='purchase-year']"));
		return purchaseYear;
	}

	public WebElement getAddress11() {
		WebElement address11 = driver.findElement(By.xpath("//*[@id=\"garagingAddress-streetAddress-input\"]"));
		return address11;
	}

	public WebElement getAddress22() {
		WebElement address22 = driver
				.findElement(By.xpath("//*[@id=\"garagingAddress-additionalStreetAddress-input\"]"));
		return address22;
	}

	public WebElement getZipcode() {
		WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"garagingAddress-zipCode-input\"]"));
		return zipcode;
	}

	public WebElement getNext() {
		WebElement next = driver.findElement(By.xpath("//*[@id=\"garagingAddress\"]/button"));
		return next;
	}

	public WebElement getSaveAndContinue() {
		System.out.println("Before  xpath");
		WebElement saveAndContinue = driver.findElement(By.xpath("//button[text() = 'Save and continue']"));
		System.out.println("After  xpath");
		return saveAndContinue;
	}

	public VehicleDetailsRepo(WebDriver driver) {
		this.driver = driver;
	}

	public ArrayList<WebElement> getErrorList() throws Exception {
		ArrayList<WebElement> errors = (ArrayList<WebElement>) driver
				.findElements(By.xpath("//ul[@class='lm-FieldGroupMessage is-error']/li/span"));
		return errors;
	}
}