package pageClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class StepFive extends BaseClass {
	public StepFive(WebDriver driver) {
		BaseClass.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"autoPolicyIndicator-radio\"]/div/div/label[1]/span")
	WebElement yes;

	@FindBy(xpath = "//*[@id=\"autoPolicyIndicator-radio\"]/div/div/label[2]/span")
	WebElement no;

	public void currentlyHaveInsurance(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			yes.click();
		} else {
			no.click();
		}
	}

	// ********************************functions for no option*************************

	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[1]/span/span[1]")
	WebElement expiredOrCanceled;

	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[2]/span/span[1]")
	WebElement newlyLicensed;

	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[3]/span/span[1]")
	WebElement CompanyCar;

	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[4]/span/span[1]")
	WebElement military;

	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[5]/span/span[1]")
	WebElement other;

	public void reasonForNotHavingInsurance(String reason) {
		if (reason.toLowerCase().equals("expiredOrCanceled")) {
			expiredOrCanceled.click();
		} else if (reason.toLowerCase().equals("newly licensed")) {
			newlyLicensed.click();
		} else if (reason.toLowerCase().equals("had company car")) {
			CompanyCar.click();
		} else if (reason.toLowerCase().equals("military")) {
			military.click();
		} else {
			other.click();
		}
	}

	// if selected other
	@FindBy(xpath = "//*[@id=\"noPriorInsuranceForm-input-input\"]")
	WebElement reason;

	public void shareReason(String reason) {
		this.reason.sendKeys(reason);
	}
	
	@FindBy(xpath = "//*[@id=\"noPriorInsuranceForm\"]/button")
	WebElement next;
	public void next() {
		this.next.click();
	}
	

	// ********************************functions for yes option*************************

	@FindBy(xpath = "//*[@id=\"priorPolicyStartDropdown-input-select\"]")
	WebElement priorPolicyStart;

	public void timeWithCurrentInsurer(int time) {
		for (int i = 0; i <= time; i++) {
			priorPolicyStart.sendKeys(Keys.ARROW_DOWN);
		}
	}

	@FindBy(xpath = "//*[@id=\"bodilyInjury-select-select\"]")
	WebElement bodilyInjury;

	public void currentBodilyInjuryLimit(int amount) {
		int i = 0;
		if (amount == 0) {
			i = 6;
		} else if (amount == 25000) {
			i = 1;
		} else if (amount == 50000) {
			i = 2;
		} else if (amount == 10000) {
			i = 3;
		} else if (amount == 25000) {
			i = 4;
		} else if (amount >= 30000) {
			i = 5;
		}

		while (i > 0) {
			bodilyInjury.sendKeys(Keys.ARROW_DOWN);
		}
	}
	//***************************************logic for date!!!!!!!!!!!!!!!!!!!!*****************************************
	@FindBy(xpath = "//*[@id=\"newPolicyStart-select-select\"]")
	WebElement date;
	//*[@id="newPolicyStart-select-select"]
	public void policyStartDate(String date) {
		
	}
	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/form/button")
	WebElement getEstimate;
	
	public StepSix getEstimate()
	{
		getEstimate.click();
		return PageFactory.initElements(driver, StepSix.class);

	}
	
}
