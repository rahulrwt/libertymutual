package pageClasses;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;


import baseClass.BaseClass;
import repository.CurrentInsurance;


public class CurrentInsurances extends BaseClass {
	CurrentInsurance currentInsurance = new CurrentInsurance();
	public CurrentInsurances(WebDriver driver) {
		BaseClass.driver = driver;
		BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	public void currentlyHaveInsurance(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			currentInsurance.getYes().click();
			
		} else {
			currentInsurance.getNo().click();
			
		}
		
	}

	public void reasonForNotHavingInsurance(String reason) {
		if (reason.toLowerCase().equals("expiredOrCanceled")) {
			currentInsurance.getExpiredOrCanceled().click();

		} else if (reason.toLowerCase().equals("newly licensed")) {
			currentInsurance.getNewlyLicensed().click();

		} else if (reason.toLowerCase().equals("had company car")) {
			currentInsurance.getCompanyCar().click();

		} else if (reason.toLowerCase().equals("military")) {
			currentInsurance.getMilitary().click();
		} else {
			currentInsurance.getOther().click();
		}
	}

	public void shareReason(String reason) {
		currentInsurance.getReason().click();
	}

	public void next() {
		currentInsurance.getNext().click();
	}

	public void timeWithCurrentInsurer(int time) {
		for (int i = 0; i <= time; i++) {
			currentInsurance.getPriorPolicyStart().sendKeys(Keys.ARROW_DOWN);
		}
	}

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
			currentInsurance.getBodilyInjury().sendKeys(Keys.ARROW_DOWN);
		}
	}

	// ******************************logic for date!!!!!!!!!!!!!!!!!!!!***************************

//	public void policyStartDate(String date) {
//
//		
//		
//		Select dropdown = new Select(this.date);
//
//		dropdown.selectByIndex(10);
//
//	}

	public Quote getEstimate() {
		currentInsurance.getGetEstimate().click();
		
		return PageFactory.initElements(driver, Quote.class);

	}

}
