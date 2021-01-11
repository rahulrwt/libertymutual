package pageClasses;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BaseClass;

public class StepSix extends BaseClass {

	public StepSix(WebDriver driver) {
		BaseClass.driver = driver;
		BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div/div[2]/div/div/div/div[2]/div[2]/button")
	WebElement finalize;

	public void finalizePrice() {
		finalize.click();
	}

	@FindBy(xpath = "//*[@id=\"alphaNumericInput0-input\"]")
	WebElement VIN;

	public void setVIN(String vin) {
		VIN.sendKeys(vin);
	}

	@FindBy(xpath = "//*[@id=\"app\"]/main/div/div/div/div[2]/div/form/button")
	WebElement drivers;

	public void continueToDrivers() {
		drivers.click();
	}

	@FindBy(xpath = "//div[@class='lm-Body lms-Header--price']")

	List<WebElement> pricesElements;

	public void printConsole() {

//		 ArrayList<WebElement> pricesElement=driver.findElement("xpath='");

		for (int i = 0; i < pricesElements.size(); i++) {
			System.out.println(i + 1 + ". " + pricesElements.get(i).getText());

		}
	}

	@FindBy(xpath = "//h1/b")

	List<WebElement> pricesElements1;

	public void printConsole1() {

//	 ArrayList<WebElement> pricesElement=driver.findElement("xpath='");

		for (int i = 0; i < pricesElements1.size(); i++) {
			System.out.println(i + 1 + ". " + pricesElements1.get(i).getText());

		}
	}

	public void saveToXls() throws IOException {

		// Saving the data retrieved to xlsx file
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Details");

		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("SNo.");
		row.createCell(1).setCellValue("Quote Prices");

		for (int i = 0; i < 3; i++) {
			row = sheet.createRow(i + 1);
			row.createCell(0).setCellValue(i + 1);
			row.createCell(1).setCellValue(pricesElements.get(i).getText());
		}

		FileOutputStream fos = new FileOutputStream(new File("Prices.xlsx"));

		workbook.write(fos);

		fos.close();

	}

}
