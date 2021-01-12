package pageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.DriverDetailRepo;

public class DriverDetails extends BaseClass {
	
	DriverDetailRepo driverDetailsRepo = new DriverDetailRepo();
	public DriverDetails(WebDriver driver) {
		BaseClass.driver = driver;
		BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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


	public Discount saveAndContinue() {
		driverDetailsRepo.getSaveAndContinue().click();
		return PageFactory.initElements(driver, Discount.class);
	}

}
