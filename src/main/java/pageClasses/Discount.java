package pageClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.DiscountRepo;

public class Discount extends BaseClass {

	DiscountRepo discountRepo;

	// Parameterized constructor
	public Discount(WebDriver driver) {
		BaseClass.driver = driver;
		discountRepo = new DiscountRepo(driver);
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// Selects radio button for having policy with liberty mutual
	public void haveAnotherPolicyWithLiberty(String ans) {

		if (ans.toLowerCase().equals("yes")) {
			discountRepo.getYes().click();
		} else {
			discountRepo.getNo().click();
		}
	}

	// Iterating through the list and selecting policies accordingly
	public void policiesYouHave(List<String> policies) {

		for (int i = 0; i < policies.size(); i++) {
			if (policies.get(i).toLowerCase().equals("renters") || policies.get(i).toLowerCase().equals("home")
					|| policies.get(i).toLowerCase().equals("condo")) {
				discountRepo.getHome().click();
			}
			if (policies.get(i).toLowerCase().equals("life")) {
				discountRepo.getLife().click();
			}
			if (policies.get(i).toLowerCase().equals("auto")) {
				discountRepo.getAuto().click();
			}
			if (policies.get(i).toLowerCase().equals("personal")) {
				discountRepo.getPeronalInsurance().click();
			}
			if (policies.get(i).toLowerCase().equals("landlord")) {
				discountRepo.getLandLord().click();
			}
			if (policies.get(i).toLowerCase().equals("motorcycle")) {
				discountRepo.getMotorcycle().click();
			}
			if (policies.get(i).toLowerCase().equals("other")) {
				discountRepo.getOther_policy().click();

			}

		}

	}

	// Radio button selection of employment status
	public void employmentStatus(String status) {
		if (status.toLowerCase().contains("employed")) {
			discountRepo.getEmployed().click();
		} else if (status.toLowerCase().contains("student")) {
			discountRepo.getStudent().click();

		} else if (status.toLowerCase().contains("retired")) {
			discountRepo.getRetired().click();

		} else if (status.toLowerCase().contains("military")) {
			discountRepo.getMilitary().click();

		} else if (status.toLowerCase().equals("notseekingemployment")) {
			discountRepo.getNotseekingemployment().click();

		} else {
			discountRepo.getUnemployed().click();

		}

	}

	// Radio button selection of Education status

	public void highestEducation(String highestLevel) {
		if (highestLevel.toLowerCase().contains("highschool")) {
			discountRepo.getHighschool().click();

		} else if (highestLevel.toLowerCase().contains("vocational")) {
			discountRepo.getVocational().click();

		} else if (highestLevel.toLowerCase().contains("associatedegree")) {
			discountRepo.getAssociatedegree().click();

		} else if (highestLevel.toLowerCase().contains("bachelor")) {
			discountRepo.getBachelor().click();

		} else if (highestLevel.toLowerCase().contains("masters")) {
			discountRepo.getAdvanced().click();

		} else {
			discountRepo.getOther().click();

		}

	}

	// Radio button selection of type of home

	public void ownHome(String ans) {
		if (ans.toLowerCase().contains("single")) {
			discountRepo.getSingle().click();

		} else if (ans.toLowerCase().contains("condo")) {
			discountRepo.getCondo().click();

		} else if (ans.toLowerCase().contains("mobile")) {
			discountRepo.getMobile().click();

		} else {
			discountRepo.getNo_home().click();

		}

	}

//Clicks save and continue button and returns CurrentInsurances object
	public CurrentInsurances saveAndContinue() {
		discountRepo.getSaveAndContinue().click();

		return PageFactory.initElements(driver, CurrentInsurances.class);

	}

	// Checks discount
	public void wantToSave30percent(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			discountRepo.getYes_Offer().click();
			sleep(2);
			discountRepo.getNext().click();

		} else {
			discountRepo.getNo_Offer().click();

		}

	}

	// Selects type of phone
	public void smartPhoneSelection(String phone) {
		if (phone.toLowerCase().contains("iphone")) {
			discountRepo.getIphone5().click();

		} else if (phone.toLowerCase().contains("android")) {
			discountRepo.getAndroid4().click();

		} else if (phone.toLowerCase().contains("other")) {
			discountRepo.getOther_phone().click();

		} else {
			discountRepo.getNoPhone().click();

		}
	}

	// Asks whether user wants to receive text
	public void wantToRecieveText(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			discountRepo.getYes_RecieveText().click();

		} else {
			discountRepo.getNo_RecieveText().click();

		}
	}

	// Sets user's phone number
	public void whatNumberShouldWeSendTextTo(String number) {
		discountRepo.getWhatNumber().sendKeys(number);
	}

	// Checks status of checkBox
	public boolean checkBoxActive() {

		return discountRepo.getCheckBoxStatus();
	}

	// Clicks on checkbox of 30% discount
	public void selectCheckBox() {

		discountRepo.getCheckBox().click();
	}

	// prints invalid data errors
	public void printErrors() throws Exception {
		printErrors(discountRepo.getErrorList());
	}

	// clicks next button
	public void next() {
		discountRepo.getNext().click();

	}

	// redirects to currentInsurance page and returns currentInsurance object
	public CurrentInsurances continueWithoutOffer() {
		discountRepo.getWithoutOffer().click();
		return PageFactory.initElements(driver, CurrentInsurances.class);
	}
	public String returnErrors() {
		try {
			System.out.print("inside try");
			return returnErrors(discountRepo.getErrorList());
		} catch (Exception e) {

			return "";
		}

	}
}
