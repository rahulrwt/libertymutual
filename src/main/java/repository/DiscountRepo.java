package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscountRepo {
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement yes;

	@FindBy(xpath = "//span[text()='No']")
	WebElement no;
	
	
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

	@FindBy(xpath = "//span[text()='Yes, single or multi-family']")
	WebElement single;

	@FindBy(xpath = "//*[@id=\"residenceType-radio\"]/div/div/label[2]/span")
	WebElement condo;

	@FindBy(xpath = "//*[@id=\"residenceType-radio\"]/div/div/label[3]/span")
	WebElement mobile;

	@FindBy(xpath = "//*[@id=\"residenceType-radio\"]/div/div/label[4]/span")
	WebElement no1;

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/form/button")
	WebElement saveAndContinue;

	@FindBy(xpath = "//span[text()='Yes, sign me up!']")
	WebElement yes1;
	
	@FindBy(xpath = "//span[text()='No, thanks']")
	WebElement no11;

	@FindBy(xpath = "//*[@id=\"rightTrackSelections\"]/button")
	WebElement next;
	@FindBy(xpath = "//*[@id=\"phoneType-radio\"]/div/div/label[1]/span")
	WebElement iphone5;

	@FindBy(xpath = "//*[@id=\"phoneType-radio\"]/div/div/label[2]/span")
	WebElement android4;

	@FindBy(xpath = "//*[@id=\"phoneType-radio\"]/div/div/label[3]/span")
	WebElement other1;

	@FindBy(xpath = "//*[@id=\"phoneType-radio\"]/div/div/label[4]/span")
	WebElement noPhone;

	@FindBy(xpath = "//*[@id=\"textMessages-radio\"]/div/div/label[1]/span")
	WebElement yes11;

	@FindBy(xpath = "//*[@id=\"textMessages-radio\"]/div/div/label[2]/span")
	WebElement no111;
	@FindBy(xpath = "//*[@id=\"lms-Modal-4\"]/footer/button[2]")
	WebElement withoutOffer;
	

	public WebElement getYes() {
		return yes;
	}
	public WebElement getNo() {
		return no;
	}
	public WebElement getHome() {
		return home;
	}
	public WebElement getLife() {
		return life;
	}
	public WebElement getAuto() {
		return auto;
	}
	public WebElement getPeronalInsurance() {
		return peronalInsurance;
	}
	public WebElement getLandLord() {
		return landLord;
	}
	public WebElement getMotorcycle() {
		return motorcycle;
	}
	public WebElement getOther11() {
		return other11;
	}
	public WebElement getEmployed() {
		return employed;
	}
	public WebElement getStudent() {
		return student;
	}
	public WebElement getRetired() {
		return retired;
	}
	public WebElement getMilitary() {
		return military;
	}
	public WebElement getNotseekingemployment() {
		return notseekingemployment;
	}
	public WebElement getUnemployed() {
		return unemployed;
	}
	public WebElement getHighschool() {
		return highschool;
	}
	public WebElement getVocational() {
		return vocational;
	}
	public WebElement getAssociatedegree() {
		return associatedegree;
	}
	public WebElement getBachelor() {
		return bachelor;
	}
	public WebElement getAdvanced() {
		return advanced;
	}
	public WebElement getOther() {
		return other;
	}
	public WebElement getSingle() {
		return single;
	}
	public WebElement getCondo() {
		return condo;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getNo1() {
		return no1;
	}
	public WebElement getSaveAndContinue() {
		return saveAndContinue;
	}
	public WebElement getYes1() {
		return yes1;
	}
	public WebElement getNo11() {
		return no11;
	}
	public WebElement getNext() {
		return next;
	}
	public WebElement getIphone5() {
		return iphone5;
	}
	public WebElement getAndroid4() {
		return android4;
	}
	public WebElement getOther1() {
		return other1;
	}
	public WebElement getNoPhone() {
		return noPhone;
	}
	public WebElement getYes11() {
		return yes11;
	}
	public WebElement getNo111() {
		return no111;
	}
	public WebElement getWithoutOffer() {
		return withoutOffer;
	}
}
