package pageClasses;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import repository.HomeRepo;

public class Home extends BaseClass {

	HomeRepo homeRepo;

	public Home(WebDriver driver) {
		BaseClass.driver = driver;
		this.homeRepo = new HomeRepo(driver);
		// BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	String excelSheetName;
	String sheetLocation;
	int rowId;

	public void setSheetDetails(String excelSheetName, String sheetLocation) {
		this.excelSheetName = excelSheetName;
		this.sheetLocation = sheetLocation;
	}

	public void setZipCode(String zipCode) {

		this.logger = report.createTest("SetZipCode");
		homeRepo.getZipcodeElement().sendKeys(zipCode);
	}

	public UserDetails getPrice() {
		homeRepo.getGetPricElement().click();
		return PageFactory.initElements(driver, UserDetails.class);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void printErrors() throws Exception
	{
		printErrors(homeRepo.getErrorList());
	}

}
