package repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 

public class QuoteRepo {

	WebDriver driver;

	public QuoteRepo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFinalize() {
		WebElement finalize = driver
				.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/button"));

		return finalize;
	}

	public WebElement getVIN() {
		WebElement VIN = driver
				.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/button"));

		return VIN;
	}

	public WebElement getDrivers() {
		WebElement drivers = driver
				.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/button"));

		return drivers;
	}

	public List<WebElement> getPricesElements() {
		List<WebElement> pricesElements = driver.findElements(By.xpath("//span[@class='lms-ContentArea--price']"));

		return pricesElements;
	}

	public List<WebElement> getPricesElements1() {
		List<WebElement> pricesElements1 = driver.findElements(By.xpath("//h1/b"));

		return pricesElements1;
	}

}
