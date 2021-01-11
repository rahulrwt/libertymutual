package pageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class Home extends BaseClass {

	public Home(WebDriver driver) {
		BaseClass.driver = driver;
		BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	// ***************************dynamic xpath*****************

	@FindBy(xpath = "//input[@name='zipCode']")

	WebElement zipcodeElement;

	@FindBy(xpath = "//*[@id='quoteModuleForm']/div/div/div[1]/div[3]/div/div/div/div/div/div[3]/button")
	WebElement getPricElement;

	public void setZipCode(String zipCode) {
		this.logger = report.createTest("SetZipCode");
		zipcodeElement.sendKeys(zipCode);
	}

	public StepOne getPrice() {
		getPricElement.click();
		return PageFactory.initElements(driver, StepOne.class);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getZipCodeElement() {
		// TODO Auto-generated method stub
		return zipcodeElement;
	}

}
