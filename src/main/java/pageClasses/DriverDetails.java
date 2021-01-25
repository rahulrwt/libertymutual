package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.DriverDetailRepo;

public class DriverDetails extends BaseClass {

	DriverDetailRepo driverDetailsRepo;

	// Parameterized constructor
	public DriverDetails(WebDriver driver) {
		BaseClass.driver = driver;
		this.driverDetailsRepo = new DriverDetailRepo(driver);

	}

	public String getTitle() {
		return driver.getTitle();

	}

	// Sets marital status of Driver
	public void marriedOrCivilUnion(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			driverDetailsRepo.getYes().click();
		} else {
			driverDetailsRepo.getNo().click();
		}
	}

	// Selects gender radio button
	public void gender(String ans) {
		if (ans.toLowerCase().equals("male")) {
			driverDetailsRepo.getMale().click();
		} else {
			driverDetailsRepo.getFemale().click();
		}
	}

	// Sets age of driver when license was issued
	public void licenseIssuedAtAge(String age) {

		this.driverDetailsRepo.getAge().sendKeys(age);

	}

	// Sets whether student is full time B grade average or not
	public void fullTimeStudentWithBAverage(String ans) {
		if (ans.toLowerCase().equals("yes")) {
			driverDetailsRepo.getYes1().click();
		} else {
			driverDetailsRepo.getNo1().click();
		}
	}

	// Sets driver's contact number
	public void contactNo(String phone) {
		driverDetailsRepo.getContactNo().sendKeys(phone);
	}

	// Prints error
	public void printErrors() throws Exception {
		printErrors(driverDetailsRepo.getErrorList());
	}

	// redirects to discount page and returns discount object
	public Discount saveAndContinue() {
		driverDetailsRepo.getSaveAndContinue().click();
		return PageFactory.initElements(driver, Discount.class);
	}

}
