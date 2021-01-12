package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeRepo {
	public WebElement getZipcodeElement() {
		return zipcodeElement;
	}

	public WebElement getGetPricElement() {
		return getPricElement;
	}

	@FindBy(xpath = "//input[@name='zipCode']")

	WebElement zipcodeElement;

	@FindBy(xpath = "//*[@id='quoteModuleForm']/div/div/div[1]/div[3]/div/div/div/div/div/div[3]/button")
	WebElement getPricElement;

}
