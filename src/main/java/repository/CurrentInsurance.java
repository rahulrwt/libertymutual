package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrentInsurance {

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement yes;

	public WebElement getYes() {
		return yes;
	}


	public WebElement getNo() {
		return no;
	}


	public WebElement getExpiredOrCanceled() {
		return expiredOrCanceled;
	}


	public WebElement getNewlyLicensed() {
		return newlyLicensed;
	}


	public WebElement getCompanyCar() {
		return CompanyCar;
	}


	public WebElement getMilitary() {
		return military;
	}


	public WebElement getOther() {
		return other;
	}


	public WebElement getReason() {
		return reason;
	}


	public WebElement getNext() {
		return next;
	}


	public WebElement getPriorPolicyStart() {
		return priorPolicyStart;
	}


	public WebElement getBodilyInjury() {
		return bodilyInjury;
	}


	public WebElement getDate() {
		return date;
	}


	public WebElement getGetEstimate() {
		return getEstimate;
	}



	@FindBy(xpath = "//span[text()='No']")
	WebElement no;
	

	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[1]/span/span[1]")
	WebElement expiredOrCanceled;

	@FindBy(xpath = "//span[text() = 'I’m newly licensed']")
	WebElement newlyLicensed;

	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[3]/span/span[1]")
	WebElement CompanyCar;

	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[4]/span/span[1]")
	WebElement military;

	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[5]/span/span[1]")
	WebElement other;
	

	// if selected other
	@FindBy(xpath = "//*[@id=\"noPriorInsuranceForm-input-input\"]")
	WebElement reason;
	

	@FindBy(xpath = "//*[@id=\"noPriorInsuranceForm\"]/button")
	WebElement next;
	

	@FindBy(xpath = "//*[@id=\"priorPolicyStartDropdown-input-select\"]")
	WebElement priorPolicyStart;


	@FindBy(xpath = "//*[@id=\"bodilyInjury-select-select\"]")
	WebElement bodilyInjury;
	
	@FindBy(xpath = "//select[@class='lm-Field-select']")
	WebElement date;
	

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/form/button")
	WebElement getEstimate;

}
