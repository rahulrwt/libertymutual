package repository;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrentInsuranceRepo {

	WebDriver driver;
	public CurrentInsuranceRepo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getYes() {
		return driver.findElement(By.xpath("//span[text()='Yes']"));
		 
	}

	public WebElement getNo() {
		return driver.findElement(By.xpath("//span[text()='No']"));
		
	}

	public WebElement getExpiredOrCanceled() {
		return driver.findElement(By.xpath("//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[1]/span/span[1]"));
	}

	public WebElement getNewlyLicensed() {
		return driver.findElement(By.xpath("//span[text() = 'I’m newly licensed']"));
	}

	public WebElement getCompanyCar() {
		return driver.findElement(By.xpath("//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[3]/span/span[1]"));

	}

	public WebElement getMilitary() {
		return driver.findElement(By.xpath("//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[4]/span/span[1]"));

	}

	public WebElement getOther() {

		return driver.findElement(By.xpath("//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[5]/span/span[1]"));

	}

	public WebElement getReason() {
		return driver.findElement(By.xpath("//*[@id=\"noPriorInsuranceForm-input-input\"]"));

	}

	public WebElement getNext() {
		return driver.findElement(By.xpath("//button[text()='Next']"));

	}

	public WebElement getPriorPolicyStart() {
		return driver.findElement(By.xpath("//*[@id='priorPolicyStart-input-input']"));

	}

	public WebElement getBodilyInjury() {
		return driver.findElement(By.xpath("//*[@id=\"bodilyInjury-select-select\"]"));

	}

	public WebElement getDate() {

		return driver.findElement(By.xpath("//select[@class='lm-Field-select']"));

	}

	public WebElement getGetEstimate() {

		return driver.findElement(By.xpath("//button[text()='Get my estimate']"));

	}

		public ArrayList<WebElement> getErrorList() throws Exception {
			return (ArrayList<WebElement>) driver.findElements(By.xpath("//ul[@class='lm-FieldGroupMessage is-error']/li/span"));
		
	}
}
