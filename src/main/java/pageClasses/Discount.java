package pageClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.DiscountRepo;

public class Discount extends BaseClass {

	DiscountRepo discountRepo;


	public Discount(WebDriver driver) {
		BaseClass.driver = driver;
		discountRepo = new DiscountRepo(driver);
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void haveAnotherPolicyWithLiberty(String ans) {
		//String ans = xlsread.Excelread(sheetname,columnname , rowvalue);
		if (ans.toLowerCase().equals("yes")) {
			discountRepo.getYes().click();
		} else {
			discountRepo.getNo().click();
		}
	}

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
			} if(policies.get(i).toLowerCase().equals("other"))
			{
				discountRepo.getOther11().click();

			}

		}

	}

	public void employmentStatus(String status) {
		if (status.toLowerCase().equals("employed")) {
			discountRepo.getEmployed().click();
		} else if (status.toLowerCase().equals("student")) {
			discountRepo.getStudent().click();

		} else if (status.toLowerCase().equals("retired")) {
			discountRepo.getRetired().click();

		} else if (status.toLowerCase().equals("military")) {
			discountRepo.getMilitary().click();

		} else if (status.toLowerCase().equals("notseekingemployment")) {
			discountRepo.getNotseekingemployment().click();

		} else {
			discountRepo.getUnemployed().click();

		}

	}

	public void highestEducation(String highestLevel) {
		if (highestLevel.toLowerCase().equals("highschool")) {
			discountRepo.getHighschool().click();

		} else if (highestLevel.toLowerCase().equals("vocational")) {
			discountRepo.getVocational().click();

		} else if (highestLevel.toLowerCase().equals("associatedegree")) {
			discountRepo.getAssociatedegree().click();

		} else if (highestLevel.toLowerCase().equals("bachelor")) {
			discountRepo.getBachelor().click();

		} else if (highestLevel.toLowerCase().equals("advanced")) {
			discountRepo.getAdvanced().click();

		} else {
			discountRepo.getOther().click();

		}

	}

	public void ownHome(String ans) {
		if (ans.toLowerCase().equals("single")) {
			discountRepo.getSingle().click();

		} else if (ans.toLowerCase().equals("condo")) {
			discountRepo.getCondo().click();

		} else if (ans.toLowerCase().equals("mobile")) {
			discountRepo.getMobile().click();

		} else {
			discountRepo.getNo1().click();

		}

	}

	public CurrentInsurances saveAndContinue() {
		discountRepo.getSaveAndContinue().click();

		return PageFactory.initElements(driver, CurrentInsurances.class);

	}

	public void wantToSave30percent(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			discountRepo.getYes1().click();

			discountRepo.getNext().click();

		} else {
			discountRepo.getNo11().click();

		}

	}

	public void smartPhoneSelection(String phone) {
		if (phone.toLowerCase().equals("iphone")) {
			discountRepo.getIphone5().click();

		} else if (phone.toLowerCase().equals("android")) {
			discountRepo.getAndroid4().click();

		} else if (phone.toLowerCase().equals("other")) {
			discountRepo.getOther1().click();

		} else {
			discountRepo.getNoPhone().click();

		}
	}

	public void wantToRecieveText(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			discountRepo.getYes11().click();

		} else {
			discountRepo.getNo111().click();

		}
	}

	public void whatNumberShouldWeSendTextTo(String number) {
		discountRepo.getWhatNumber().sendKeys(number);
	}

	public CurrentInsurances continueWithoutOffer() {
		discountRepo.getWithoutOffer().click();

		return PageFactory.initElements(driver, CurrentInsurances.class);

	}

	public boolean checkBoxActive() {

		return discountRepo.getCheckBoxStatus();
	}

	public void selectCheckBox() {

		discountRepo.getCheckBox().click();
	}

	public void next() {
		discountRepo.getNext().click();
		
	}

}
