package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homeRepo {
	@FindBy(xpath = "//input[@name='zipCode']")

	WebElement zipcodeElement;

	@FindBy(xpath = "//*[@id='quoteModuleForm']/div/div/div[1]/div[3]/div/div/div/div/div/div[3]/button")
	WebElement getPricElement;
	
}
