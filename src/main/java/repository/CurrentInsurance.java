package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrentInsurance {

	WebDriver driver;

	public CurrentInsurance(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getYes() {
		WebElement yes = driver.findElement(By.xpath("//span[text()='Yes']"));
		return yes;
	}

	public WebElement getNo() {
		WebElement no = driver.findElement(By.xpath("//span[text()='No']"));
		return no;
	}

	public WebElement getExpiredOrCanceled() {
		WebElement expiredOrCanceled = driver
				.findElement(By.xpath("//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[1]/span/span[1]"));

		return expiredOrCanceled;
	}

	public WebElement getNewlyLicensed() {
		WebElement newlyLicensed = driver.findElement(By.xpath("//span[text() = 'I’m newly licensed']"));

		return newlyLicensed;
	}

	public WebElement getCompanyCar() {
		WebElement CompanyCar = driver
				.findElement(By.xpath("//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[3]/span/span[1]"));

		return CompanyCar;
	}

	public WebElement getMilitary() {
		WebElement military = driver
				.findElement(By.xpath("//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[4]/span/span[1]"));

		return military;
	}

	public WebElement getOther() {

		WebElement other = driver
				.findElement(By.xpath("//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[5]/span/span[1]"));

		return other;
	}

	public WebElement getReason() {
		WebElement reason = driver.findElement(By.xpath("//*[@id=\"noPriorInsuranceForm-input-input\"]"));

		return reason;
	}

	public WebElement getNext() {
		WebElement next = driver.findElement(By.xpath("//*[@id=\"noPriorInsuranceForm\"]/button"));

		return next;
	}

	public WebElement getPriorPolicyStart() {
		WebElement priorPolicyStart = driver
				.findElement(By.xpath("//*[@id=\"priorPolicyStartDropdown-input-select\"]"));

		return priorPolicyStart;
	}

	public WebElement getBodilyInjury() {
		WebElement bodilyInjury = driver.findElement(By.xpath("//*[@id=\"bodilyInjury-select-select\"]"));

		return bodilyInjury;
	}

	public WebElement getDate() {

		WebElement date = driver.findElement(By.xpath("//select[@class='lm-Field-select']"));

		return date;
	}

	public WebElement getGetEstimate() {

		WebElement getEstimate = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/form/button"));

		return getEstimate;
	}

}
