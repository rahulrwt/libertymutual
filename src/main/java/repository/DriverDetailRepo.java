package repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DriverDetailRepo {


	@FindBy(xpath = "//*[@id=\"maritalStatus-radio\"]/div/div/label[1]/span")
	WebElement yes;

	@FindBy(xpath = "//*[@id=\"maritalStatus-radio\"]/div/div/label[2]/span")
	WebElement no;
	
	@FindBy(xpath = "//span[text()='Male']")
	WebElement male;

	@FindBy(xpath = "//span[text()='Female']")
	WebElement female;


	@FindBy(xpath = "//*[@id=\"ageLicensed-input-select\"]")
	WebElement age;

	@FindBy(xpath = "//*[@id=\"goodStudent-radio\"]/div/div/label[1]/span")
	WebElement yes1;

	@FindBy(xpath = "//*[@id=\"goodStudent-radio\"]/div/div/label[2]/span")
	WebElement no1;
	

	@FindBy(xpath = "//*[@id=\"primaryPhoneNumber-input-input\"]")
	WebElement contactNo;
	

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/form/button")
	WebElement saveAndContinue;


	public WebElement getYes() {
		return yes;
	}


	public WebElement getNo() {
		return no;
	}


	public WebElement getMale() {
		return male;
	}


	public WebElement getFemale() {
		return female;
	}


	public WebElement getAge() {
		return age;
	}


	public WebElement getYes1() {
		return yes1;
	}


	public WebElement getNo1() {
		return no1;
	}


	public WebElement getContactNo() {
		return contactNo;
	}


	public WebElement getSaveAndContinue() {
		return saveAndContinue;
	}


}
