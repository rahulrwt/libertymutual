package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeRepo {

	WebDriver driver;

	public HomeRepo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getZipcodeElement() {
		WebElement zipcodeElement = driver.findElement(By.xpath("//input[@name='zipCode']"));
		return zipcodeElement;
	}

	public WebElement getGetPricElement() {
		WebElement getPricElement = driver.findElement(
				By.xpath("//*[@id='quoteModuleForm']/div/div/div[1]/div[3]/div/div/div/div/div/div[3]/button"));

		return getPricElement;
	}
}
