package repository;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class VehicleDetailsRepo extends BaseClass {

	WebDriver driver;

	public WebElement getDontHavePlate() {
		return driver.findElement(By.xpath("//*[@id=\"licensePlateLookup\"]/div[4]/button"));

	}

	public WebElement getVIN() {
		return driver.findElement(By.xpath("//*[@id=\"licensePlateLookup-input-input\"]"));

	}

	public WebElement getVIN1() {
		return driver.findElement(By.xpath("//input[@id  ='vin-input-input']"));

	}

	public WebElement getVINInstead() {
		return driver.findElement(By.xpath("//button[text() = 'Use VIN instead']"));

	}

	public WebElement getVINNext() {
		return driver.findElement(By.xpath("//button[text()='Next']"));

	}

	public WebElement getVehicleYear() {
		return driver.findElement(By.xpath("//*[@id=\"year-select-select\"]"));

	}

	public WebElement getChevrolet() {
		return driver.findElement(By.xpath("//*[@id=\"make-visualRadioGroup\"]/div/div/div/div[1]/label"));
	}

	public WebElement getVehicleModel() {
		return driver.findElement(By.xpath("//*[@id=\"vehicleSpecs-model-select\"]"));

	}

	public WebElement getVehicleTrim() {
		return driver.findElement(By.xpath("//*[@id=\"vehicleSpecs-trim-select\"]"));

	}

	public WebElement getVehicleStyle() {
		return driver.findElement(By.xpath("//*[@id=\"vehicleSpecs-bodyStyle-select\"]"));

	}

	public WebElement getNext1() {
		return driver.findElement(By.xpath("//*[@id=\"vehicleSpecs\"]/button"));

	}

	public WebElement getFullPaid() {
		return driver.findElement(By.xpath("//span[text()='Own (fully paid off)']"));

	}

	public WebElement getFinance() {
		return driver.findElement(By.xpath("//*[@id=\"ownership-radio\"]/div/div/label[2]/span"));

	}

	public WebElement getLease() {
		return driver.findElement(By.xpath("//*[@id=\"ownership-radio\"]/div/div/label[3]/span"));

	}

	public WebElement getYes() {
		return driver.findElement(By.xpath("//span[text() ='Yes']"));

	}

	public WebElement getNo() {
		return driver.findElement(By.xpath("//span[text() ='No']"));

	}

	public WebElement getPurchaseYear() {
		return driver.findElement(By.xpath("//*[@name='purchase-year']"));

	}

	public WebElement getAddress1_parking() {
		return driver.findElement(By.xpath("//*[@id=\"garagingAddress-streetAddress-input\"]"));

	}

	public WebElement getAddress2_parking() {
		return driver.findElement(By.xpath("//*[@id=\"garagingAddress-additionalStreetAddress-input\"]"));

	}

	public WebElement getZipcode_parking() {
		return driver.findElement(By.xpath("//*[@id=\"garagingAddress-zipCode-input\"]"));

	}

	public WebElement getNext() {
		return driver.findElement(By.xpath("//*[@id=\"garagingAddress\"]/button"));

	}

	public WebElement getSaveAndContinue() {

		return driver.findElement(By.xpath("//button[text() = 'Save and continue']"));

	}

	public VehicleDetailsRepo(WebDriver driver) {
		this.driver = driver;
	}

	public ArrayList<WebElement> getErrorList() throws Exception {
		return (ArrayList<WebElement>) driver
				.findElements(By.xpath("//ul[@class='lm-FieldGroupMessage is-error']/li/span"));

	}

	public WebElement getHaveOtherVehicle() {
		return driver.findElement(By.xpath("//span[text()='I have other vehicles to add']"));

	}

}