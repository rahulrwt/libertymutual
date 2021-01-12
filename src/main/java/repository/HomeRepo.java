package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import baseClass.BaseClass;



public class HomeRepo extends BaseClass{

	WebDriver driver;
//	@FindBy(xpath = "//input[@name='zipCode']")
//	WebElement zipcodeElement;

//	@FindBy(xpath = "//*[@id='quoteModuleForm']/div/div/div[1]/div[3]/div/div/div/div/div/div[3]/button")
//	WebElement getPricElement;
	
	public WebElement getZipcodeElement() {
		WebElement zipcodeElement=driver.findElement(By.xpath("//input[@name='zipCode']"));
		return zipcodeElement;
	}

	public WebElement getGetPricElement() {
		WebElement getPricElement=driver.findElement(By.xpath("//*[@id='quoteModuleForm']/div/div/div[1]/div[3]/div/div/div/div/div/div[3]/button"));
		return getPricElement;
	}
	public HomeRepo(WebDriver driver)
	{
		this.driver=driver;
	}

	

}