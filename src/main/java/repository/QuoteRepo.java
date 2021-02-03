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
		return driver
				.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/button"));

	}

	public WebElement getVIN() {
		return driver
				.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/button"));

	}

	public WebElement getDrivers() {
		return driver
				.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/button"));
	}

	public List<WebElement> getPricesElements() {
		return driver.findElements(By.xpath("//span[@class='lms-ContentArea--price']"));

	}

	public List<WebElement> getPricesElements1() {
		return driver.findElements(By.xpath("//h1/b"));

	}

}
