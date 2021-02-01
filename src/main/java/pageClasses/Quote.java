package pageClasses;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import repository.QuoteRepo;

public class Quote extends BaseClass {

	QuoteRepo quoteRepo;
	List<WebElement> pricesElements;

	// Parameterized constructor
	public Quote(WebDriver driver) {
		BaseClass.driver = driver;
		this.quoteRepo = new QuoteRepo(driver);
	}

	// Prints details of quote on console
	public void printConsole() {
		this.pricesElements = quoteRepo.getPricesElements();

		for (int i = 0; i < pricesElements.size(); i++) {
			System.out.println(i + 1 + ". " + pricesElements.get(i).getText());

		}
	}

	// Saves details of quote in .XLSX format
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
