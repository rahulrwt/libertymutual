package repository;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverDetailRepo {

	WebDriver driver;

	public DriverDetailRepo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getYes() {
		return driver.findElement(By.xpath("//span[text()='Yes']"));

	}

	public WebElement getNo() {
		return driver.findElement(By.xpath("//span[text()='No']"));

	}

	public WebElement getMale() {
		return driver.findElement(By.xpath("//span[text()='Male']"));

	}

	public WebElement getFemale() {
		return driver.findElement(By.xpath("//span[text()='Female']"));

	}

	public WebElement getAge() {
		return driver.findElement(By.xpath("//*[@id='ageLicensed-input']"));

	}

	public WebElement getYesFullTime() {
		return driver.findElement(By.xpath("//*[@id=\"goodStudent-radio\"]/div/div/label[1]/span"));

	}

	public WebElement getNoFullTime() {

		return driver.findElement(By.xpath("//*[@id=\"goodStudent-radio\"]/div/div/label[2]/span"));

	}

	public WebElement getContactNo() {
		return driver.findElement(By.xpath("//*[@id=\"primaryPhoneNumber-input-input\"]"));

	}

	public WebElement getSaveAndContinue() {

		return driver.findElement(By.xpath("//button[text()='Save and continue']"));

	}

	public ArrayList<WebElement> getErrorList() throws Exception {
		return (ArrayList<WebElement>) driver
				.findElements(By.xpath("//ul[@class='lm-FieldGroupMessage is-error']/li/span"));

	}

}
