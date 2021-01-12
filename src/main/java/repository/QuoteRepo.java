package repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoteRepo {



	public WebElement getFinalize() {
		return finalize;
	}

	public WebElement getVIN() {
		return VIN;
	}

	public WebElement getDrivers() {
		return drivers;
	}

	public List<WebElement> getPricesElements() {
		return pricesElements;
	}

	public List<WebElement> getPricesElements1() {
		return pricesElements1;
	}


	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/button")
	WebElement finalize;

	@FindBy(xpath = "//*[@id=\"alphaNumericInput0-input\"]")
	WebElement VIN;


	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div/div[2]/div/form/button")
	WebElement drivers;


	@FindBy(xpath = "//div[@class='lm-Body lms-Header--price']")

	List<WebElement> pricesElements;

	@FindBy(xpath = "//h1/b")

	List<WebElement> pricesElements1;

}
