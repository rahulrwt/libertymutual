package pageClasses;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.SingleKeyAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class StepFour extends BaseClass {
	public StepFour(WebDriver driver) {
		BaseClass.driver = driver;
		BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement yes;

	@FindBy(xpath = "//span[text()='No']")
	WebElement no;

	public void haveAnotherPolicyWithLiberty(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			yes.click();
		} else {
			no.click();
		}
	}

	//*************************************yes branch*******************
	
	@FindBy(xpath = "//*[@id=\"visualCheckboxGroupV2-2\"]/fieldset/div/div/div[1]/label")
	WebElement home;

	@FindBy(xpath = "//*[@id=\"visualCheckboxGroupV2-2\"]/fieldset/div/div/div[2]/label")
	WebElement life;
	
	@FindBy(xpath = "//*[@id=\"visualCheckboxGroupV2-2\"]/fieldset/div/div/div[3]/label")
	WebElement auto;

	@FindBy(xpath = "//*[@id=\"visualCheckboxGroupV2-2\"]/fieldset/div/div/div[4]/label")
	WebElement peronalInsurance;
	
	@FindBy(xpath = "//*[@id=\"visualCheckboxGroupV2-2\"]/fieldset/div/div/div[5]/label")
	WebElement landLord;

	@FindBy(xpath = "//*[@id=\"visualCheckboxGroupV2-2\"]/fieldset/div/div/div[6]/label")
	WebElement motorcycle;
	
	@FindBy(xpath = "//*[@id=\"visualCheckboxGroupV2-2\"]/fieldset/div/div/div[7]/label")
	WebElement other11;
	
	
	
	//arraylist of policies
	
	public void policiesYouHave(ArrayList<String> policies) {
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"employmentStatus-radio\"]/div/div/label[1]/span")
	WebElement employed;

	@FindBy(xpath = "//*[@id=\"employmentStatus-radio\"]/div/div/label[2]/span")
	WebElement student;

	@FindBy(xpath = "//*[@id=\"employmentStatus-radio\"]/div/div/label[3]/span")
	WebElement retired;

	@FindBy(xpath = "//*[@id=\"employmentStatus-radio\"]/div/div/label[4]/span")
	WebElement military;

	@FindBy(xpath = "//*[@id=\"employmentStatus-radio\"]/div/div/label[5]/span")
	WebElement notseekingemployment;

	@FindBy(xpath = "//*[@id=\"employmentStatus-radio\"]/div/div/label[6]/span")
	WebElement unemployed;

	public void employmentStatus(String status) {
		if (status.toLowerCase().equals("employed")) {
			employed.click();
		} else if (status.toLowerCase().equals("student")) {
			student.click();
		} else if (status.toLowerCase().equals("retired")) {
			retired.click();
		} else if (status.toLowerCase().equals("military")) {
			military.click();
		} else if (status.toLowerCase().equals("notseekingemployment")) {
			notseekingemployment.click();
		} else {
			unemployed.click();
		}

	}

	
	@FindBy(xpath = "//span[text()='High school diploma/equivalent']")
	WebElement highschool;

	@FindBy(xpath = "//*[@id=\"highestEducationLevel-radio\"]/div/div/label[2]/span")
	WebElement vocational;

	@FindBy(xpath = "//*[@id=\"highestEducationLevel-radio\"]/div/div/label[3]/span")
	WebElement associatedegree;

	@FindBy(xpath = "//span[text()='Bachelor’s degree']")
	WebElement bachelor;

	@FindBy(xpath = "//*[@id=\"highestEducationLevel-radio\"]/div/div/label[5]/span")
	WebElement advanced;

	@FindBy(xpath = "//*[@id=\"highestEducationLevel-radio\"]/div/div/label[6]/span")
	WebElement other;

	public void highestEducation(String highestLevel) {
		if (highestLevel.toLowerCase().equals("highschool")) {
			highschool.click();
		} else if (highestLevel.toLowerCase().equals("vocational")) {
			vocational.click();
		} else if (highestLevel.toLowerCase().equals("associatedegree")) {
			associatedegree.click();
		} else if (highestLevel.toLowerCase().equals("bachelor")) {
			bachelor.click();
		} else if (highestLevel.toLowerCase().equals("advanced")) {
			advanced.click();
		} else {
			other11.click();
		}

	}

	@FindBy(xpath = "//span[text()='Yes, single or multi-family']")
	WebElement single;

	@FindBy(xpath = "//*[@id=\"residenceType-radio\"]/div/div/label[2]/span")
	WebElement condo;

	@FindBy(xpath = "//*[@id=\"residenceType-radio\"]/div/div/label[3]/span")
	WebElement mobile;

	@FindBy(xpath = "//*[@id=\"residenceType-radio\"]/div/div/label[4]/span")
	WebElement no1;

	public void ownHome(String ans) {
		if (ans.toLowerCase().equals("single")) {
			single.click();
		} else if (ans.toLowerCase().equals("condo")) {
			condo.click();
		} else if (ans.toLowerCase().equals("mobile")) {
			mobile.click();
		} else {
			no1.click();
		}

	}

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/form/button")
	WebElement saveAndContinue;

	public StepFive saveAndContinue() {
		saveAndContinue.click();
		return PageFactory.initElements(driver, StepFive.class);

	}

	@FindBy(xpath = "//span[text()='Yes, sign me up!']")
	WebElement yes1;
	
	@FindBy(xpath = "//span[text()='No, thanks']")
	WebElement no11;

	@FindBy(xpath = "//*[@id=\"rightTrackSelections\"]/button")
	WebElement next;

	public void wantToSave30percent(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			yes1.click();
			next.click();

		} else {
			no11.click();
		}

	}

	// *********************functions for yes option branch *******************
	@FindBy(xpath = "//*[@id=\"phoneType-radio\"]/div/div/label[1]/span")
	WebElement iphone5;

	@FindBy(xpath = "//*[@id=\"phoneType-radio\"]/div/div/label[2]/span")
	WebElement android4;

	@FindBy(xpath = "//*[@id=\"phoneType-radio\"]/div/div/label[3]/span")
	WebElement other1;

	@FindBy(xpath = "//*[@id=\"phoneType-radio\"]/div/div/label[4]/span")
	WebElement noPhone;

	public void smartPhoneSelection(String phone) {
		if (phone.toLowerCase().equals("iphone")) {
			iphone5.click();
		} else if (phone.toLowerCase().equals("android")) {
			android4.click();
		} else if (phone.toLowerCase().equals("other")) {
			other11.click();
		} else {
			noPhone.click();
		}
	}

	@FindBy(xpath = "//*[@id=\"textMessages-radio\"]/div/div/label[1]/span")
	WebElement yes11;

	@FindBy(xpath = "//*[@id=\"textMessages-radio\"]/div/div/label[2]/span")
	WebElement no111;

	public void wantToRecieveText(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			yes11.click();
		} else {
			no111.click();
		}
	}
	// *********************functions for no option branch *******************

	@FindBy(xpath = "//*[@id=\"lms-Modal-4\"]/footer/button[2]")
	WebElement withoutOffer;

	public StepFive continueWithoutOffer() {
		withoutOffer.click();
		return PageFactory.initElements(driver, StepFive.class);

	}

}
