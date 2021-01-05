package pageClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.SingleKeyAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class StepThree extends BaseClass {
	public StepThree(WebDriver driver) {
		BaseClass.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"maritalStatus-radio\"]/div/div/label[1]/span")
	WebElement yes;

	@FindBy(xpath = "//*[@id=\"maritalStatus-radio\"]/div/div/label[2]/span")
	WebElement no;

	public void marriedOrCivilUnion(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			yes.click();
		} else {
			no.click();
		}
	}

	@FindBy(xpath = "//*[@id=\"gender-radio\"]/div/div/label[1]/span")
	WebElement male;

	@FindBy(xpath = "//*[@id=\"gender-radio\"]/div/div/label[2]/span")
	WebElement female;

	public void gender(String ans) {
		if (ans.toLowerCase().equals("male")) {
			male.click();
		} else {
			female.click();
		}
	}

	@FindBy(xpath = "//*[@id=\"ageLicensed-input-select\"]")
	WebElement age;

	public void licenseIssuedAtAge(int age) {
		
		
		for (int i = 0; i < 16 - age; i++) {
			this.age.sendKeys(Keys.ARROW_DOWN);
		}
		
	}

	@FindBy(xpath = "//*[@id=\"goodStudent-radio\"]/div/div/label[1]/span")
	WebElement yes1;

	@FindBy(xpath = "//*[@id=\"goodStudent-radio\"]/div/div/label[2]/span")
	WebElement no1;

	public void fullTimeStudentWithBAverage(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			yes1.click();
		} else {
			no1.click();
		}
	}

	@FindBy(xpath = "//*[@id=\"primaryPhoneNumber-input-input\"]")
	WebElement contactNo;

	public void contactNo(String phone) {
		contactNo.sendKeys(phone);
	}

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/form/button")
	WebElement saveAndContinue;

	public StepFour saveAndContinue() {
		saveAndContinue.click();
		return PageFactory.initElements(driver, StepFour.class);
	}

}
