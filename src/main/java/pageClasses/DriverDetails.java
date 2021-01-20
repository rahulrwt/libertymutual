package pageClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.DriverDetailRepo;

public class DriverDetails extends BaseClass {

	DriverDetailRepo driverDetailsRepo;

	public DriverDetails(WebDriver driver) {
		BaseClass.driver = driver;
		this.driverDetailsRepo = new DriverDetailRepo(driver);
		
	}
	public String getTitle() {
		return driver.getTitle();
		
	}
	public void marriedOrCivilUnion(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			driverDetailsRepo.getYes().click();
		} else {
			driverDetailsRepo.getNo().click();
		}
	}

	public void gender(String ans) {
		if (ans.toLowerCase().equals("male")) {
			driverDetailsRepo.getMale().click();
		} else {
			driverDetailsRepo.getFemale().click();
		}
	}

	public void licenseIssuedAtAge(String age) {

		this.driverDetailsRepo.getAge().sendKeys(age);

	}

	public void fullTimeStudentWithBAverage(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			driverDetailsRepo.getYes1().click();
		} else {
			driverDetailsRepo.getNo1().click();
		}
	}

	public void contactNo(String phone) {
		driverDetailsRepo.getContactNo().sendKeys(phone);
	}

	public void printErrors() throws Exception
	{
		printErrors(driverDetailsRepo.getErrorList());
	}
	
	public Discount saveAndContinue() {
		driverDetailsRepo.getSaveAndContinue().click();
		return PageFactory.initElements(driver, Discount.class);
	}

}
