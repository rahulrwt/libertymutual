package pageClasses;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.HomeRepo;

public class Home extends BaseClass {

	HomeRepo homeRepo;
	String excelSheetName;
	String sheetLocation;
	int rowId;

	// Parameterized constructor
	public Home(WebDriver driver) {
		BaseClass.driver = driver;
		this.homeRepo = new HomeRepo(driver);
	}

//	public void setSheetDetails(String excelSheetName, String sheetLocation) {
//		this.excelSheetName = excelSheetName;
//		this.sheetLocation = sheetLocation;
//	}

	//Sets zipcode of city where car is purchased
	public void setZipCode(String zipCode) {
		this.logger = report.createTest("SetZipCode");
		homeRepo.getZipcodeElement().sendKeys(zipCode);
	}

	// redirects to UserDetails page and returns UserDetails object
	
	public UserDetails getPrice() {
		homeRepo.getGetPricElement().click();
		return PageFactory.initElements(driver, UserDetails.class);

	}

	//Print errors, if any on page
	public void printErrors() throws Exception {
		if(homeRepo.getErrorList().size()==0)
		{
			throw new Exception("Errmessage");
		}
		printErrors(homeRepo.getErrorList());
	}


}
