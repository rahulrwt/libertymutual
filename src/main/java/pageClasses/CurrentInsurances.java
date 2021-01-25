package pageClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseClass;
import repository.CurrentInsuranceRepo;

public class CurrentInsurances extends BaseClass {
	CurrentInsuranceRepo currentInsurance;

	// Parameterized Constructor
	public CurrentInsurances(WebDriver driver) {
		BaseClass.driver = driver;
		currentInsurance = new CurrentInsuranceRepo(driver);
	}

	//Selects radio button for history of insurance
	public void currentlyHaveInsurance(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			currentInsurance.getYes().click();
		} else {
			currentInsurance.getNo().click();
		}
	}

	// Takes reason as argument and clicks accordingly
	public void reasonForNotHavingInsurance(String reason) {
		if (reason.toLowerCase().contains("expired")) {
			currentInsurance.getExpiredOrCanceled().click();

		} else if (reason.toLowerCase().contains("newly licensed")) {
			currentInsurance.getNewlyLicensed().click();

		} else if (reason.toLowerCase().contains("had a company car")) {
			currentInsurance.getCompanyCar().click();

		} else if (reason.toLowerCase().contains("military")) {
			currentInsurance.getMilitary().click();
		} else {
			currentInsurance.getOther().click();
		}
	}

	// Selects reason for not having insurance
	public void shareReason(String reason) {

		currentInsurance.getReason().sendKeys(reason);
	}

	// Clicks next button
	public void next() {
		currentInsurance.getNext().click();
	}

	// Sets time with c
	public void timeWithCurrentInsurer(String time) {
		currentInsurance.getPriorPolicyStart().sendKeys(time);
	}

	//Sets bodily injury limit of current insurance
	public void currentBodilyInjuryLimit(String amount) {
		int i = 0;

		if (amount.equals("don't know")) {
			i = 6;
		} else if (amount.equals("25000")) {
			i = 1;
		} else if (amount.equals("50000")) {
			i = 2;
		} else if (amount.equals("100000")) {
			i = 3;
		} else if (amount.equals("250000")) {
			i = 4;
		} else if (amount.equals("300000")) {
			i = 5;
		}

		while (i > 0) {
			currentInsurance.getBodilyInjury().sendKeys(Keys.ARROW_DOWN);
			i--;
		}
	}
	//sets policy start date
	public void policyStartDate(String date) throws Exception {
			Select policyDateSelect=new Select(currentInsurance.getPriorPolicyStart());
			policyDateSelect.selectByVisibleText(date);
	}

	// prints invalid data errors
	public void printErrors() throws Exception {
		printErrors(currentInsurance.getErrorList());
	}

	// redirects to Quote Page
	public Quote getEstimate() {
		currentInsurance.getGetEstimate().click();
		return PageFactory.initElements(driver, Quote.class);
	}

}