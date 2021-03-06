package repository;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeRepo {

	WebDriver driver;

	String excelSheetName;
	String excelFileName;

	// Parameterized constructor
	public HomeRepo(WebDriver driver) {
		this.driver = driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setExcelSheetName(String excelSheetName) {
		this.excelSheetName = excelSheetName;
	}

	public void setExcelFileName(String excelFileName) {
		this.excelFileName = excelFileName;
	}

	public WebElement getZipcodeElement() {
		return driver.findElement(By.xpath("//input[@name='zipCode']"));

	}

	public WebElement getGetPricElement() {
		return driver.findElement(
				By.xpath("//*[@id='quoteModuleForm']/div/div/div[1]/div[3]/div/div/div/div/div/div[3]/button"));

	}

	// function for fetching error elements from webpage
	public ArrayList<WebElement> getErrorList() throws Exception {
		return (ArrayList<WebElement>) driver.findElements(By.xpath("//ul[@class='lm-FieldGroupMessage is-error']/li"));

	}
}
