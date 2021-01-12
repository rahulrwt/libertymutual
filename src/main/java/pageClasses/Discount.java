package pageClasses;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.DiscountRepo;

public class Discount extends BaseClass {
	
	DiscountRepo discountRepo ;
	public Discount(WebDriver driver) {
		BaseClass.driver = driver;
		BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	
	public void haveAnotherPolicyWithLiberty(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			discountRepo.getYes().click();
		} else {
			discountRepo.getNo().click();
		}
	}

	
	public void policiesYouHave(ArrayList<String> policies) {
	
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
	public CurrentInsurances continueWithoutOffer() {
		discountRepo.getWithoutOffer().click();
		
		return PageFactory.initElements(driver, CurrentInsurances.class);

	}

}
