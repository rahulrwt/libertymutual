package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BaseClass;

public class StepSix extends BaseClass {

	public StepSix(WebDriver driver) {
		BaseClass.driver = driver;
	}
	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/button")
	WebElement finalize;
	
	public void finalizePrice()
	{
		finalize.click();
	}
	
	@FindBy(xpath = "//*[@id=\"alphaNumericInput0-input\"]")
	WebElement VIN;
	
	public void setVIN(String vin)
	{
		VIN.sendKeys(vin);
	}
	
	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div/div[2]/div/form/button")
	WebElement drivers;
	
	public void continueToDrivers()
	{
		drivers.click();
	}
}
