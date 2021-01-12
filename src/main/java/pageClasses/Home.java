package pageClasses;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.HomeRepo;


public class Home extends BaseClass {

	HomeRepo homeRepo;
	public Home(WebDriver driver) {
		BaseClass.driver = driver;
		
		BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	
	public void setZipCode(String zipCode) {
		this.logger = report.createTest("SetZipCode");
		homeRepo.getZipcodeElement().sendKeys(zipCode);
	}

	public UserDetails getPrice() {
		homeRepo.getGetPricElement().click();
		return PageFactory.initElements(driver, UserDetails.class);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getZipCodeElement() {
		// TODO Auto-generated method stub
		return homeRepo.getZipcodeElement();
	}

}
