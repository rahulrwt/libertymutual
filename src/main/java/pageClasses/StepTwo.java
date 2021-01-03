package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class StepTwo extends BaseClass{

	public StepTwo(WebDriver driver){
		BaseClass.driver=driver;
	}
	
	@FindBy(xpath = "//*[@id=\"licensePlateLookup\"]/div[4]/button")
	WebElement dontHavePlate;
	
	public void dontHavePlate()
	{
		dontHavePlate.click();
		//return PageFactory.initElements(driver,stepThree.class);
	}
	
	@FindBy(xpath = "//*[@id=\"year-select-select\"]")
	WebElement vehicleYear;
	
	public void setVehicleYear(String year) {
		vehicleYear.sendKeys(year);
	}
	
	@FindBy(xpath = "//*[@id=\"make-visualRadioGroup\"]/div/div/div/div[1]/label/span[2]")
	WebElement chevrolet;
	
	public void selectChevrolet()
	{
		chevrolet.click();
	}
	
	@FindBy(xpath = "//*[@id=\"vehicleSpecs-model-select\"]")
	WebElement vehicleModel;
	
	@FindBy(xpath = "//*[@id=\"vehicleSpecs-trim-select\"]")
	WebElement vehicleTrim;
	
	@FindBy(xpath = "//*[@id=\"vehicleSpecs-bodyStyle-select\"]")
	WebElement vehicleStyle;
	
	
	public void setVehicleSpecs(String vehicleModel,String vehicleTrim,String vehicleStyle)
	{
		this.vehicleModel.sendKeys(vehicleModel);
		this.vehicleTrim.sendKeys(vehicleTrim);
		this.vehicleStyle.sendKeys(vehicleStyle);
	}
	
	@FindBy(xpath = "//*[@id=\"vehicleSpecs\"]/button")
	WebElement next;
	
	public void clickNext()
	{
		next.click();
	}
	

}
