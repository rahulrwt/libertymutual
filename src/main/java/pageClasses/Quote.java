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
import repository.QuoteRepo;

public class Quote extends BaseClass {

	public Quote(WebDriver driver) {
		BaseClass.driver = driver;
		BaseClass.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	QuoteRepo quoteRepo = new QuoteRepo();
	public void finalizePrice() {
		quoteRepo.getFinalize().click();
		
	}

	public void setVIN(String vin) {
		quoteRepo.getVIN().click();
		
	}

	public void continueToDrivers() {
		quoteRepo.getDrivers().click();
		
	}

	List<WebElement> pricesElements = quoteRepo.getPricesElements();

	public void printConsole() {

//		 ArrayList<WebElement> pricesElement=driver.findElement("xpath='");

		for (int i = 0; i < pricesElements.size(); i++) {
			System.out.println(i + 1 + ". " + pricesElements.get(i).getText());

		}
	}

	List<WebElement> pricesElements1 = quoteRepo.getPricesElements1();

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
