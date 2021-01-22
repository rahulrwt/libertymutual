package baseClass;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pageClasses.Home;
import utilities.DateUtil;
import utilities.ExtentReportManager;

public class BaseClass {

	public static WebDriver driver;

	static Properties prop = readProperties();
	public ExtentReports report = ExtentReportManager.getReportInstance();
	public ExtentTest logger;
	public DesiredCapabilities cap = null;

	@Parameters("browser")
	//function for invoking browsers
	public void invokebrowser() {
		String browser = prop.getProperty("browser_name");
		browser = "internetExplorer";
		this.logger = report.createTest("invokeBrowser");
		try {
			logger.log(Status.INFO, "Opening the browser");

			if (browser.equalsIgnoreCase("chrome")) {

				cap = DesiredCapabilities.chrome();

				logger.log(Status.PASS, "Chrome opened");
			}

			else if (browser.equalsIgnoreCase("firefox")) {
				// System.setProperty("webdriver.gecko.driver",
				// prop.getProperty("firefox_path"));

				cap = DesiredCapabilities.firefox();
				logger.log(Status.PASS, "firefox opened");
			}
			else {
				cap=DesiredCapabilities.internetExplorer();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//grid configuration
		try {

			logger.log(Status.INFO, "node is connected to hub http://192.168.1.28:4444/wd/hub");
			driver = new RemoteWebDriver(new URL("http://192.168.0.111:4444/wd/hub"), cap); // pass address of hub as
																							// argument in URL()
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
//function for opening website
	public Home openUrl(String URL) {
		this.logger = report.createTest("OpenUrl");
		// driver.manage().window().maximize();
		driver.get(URL);
		return PageFactory.initElements(driver, Home.class);
	}

	public static Properties readProperties() {
		File file = new File("config.properties");

		FileInputStream fileInput = null;

		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

	public void closeAndFlushReport() {
		report.flush();
		driver.close();
	}

	public void reportPass(String reportString) {
		logger.log(Status.PASS, reportString);
	}

	
	
	public void takeScreenShot() {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + DateUtil.getTimeStamp() + ".png");

		try {
			FileUtils.copyFile(src, dest);
			logger.addScreenCaptureFromPath(System.getProperty("user.dir") + DateUtil.getTimeStamp() + ".png");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	//*************************function for reading data from excel
	public String[][] getExcelData(String fileName, String sheetName, int totalNoOfRows, int totalNoOfCols) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sh = wb.getSheet(sheetName);

			arrayExcelData = new String[totalNoOfRows - 1][totalNoOfCols - 1];

			for (int i = 1; i < totalNoOfRows; i++) {

				for (int j = 1; j < totalNoOfCols; j++) {
					arrayExcelData[i - 1][j - 1] = String.valueOf(sh.getRow(i).getCell(j));
				}

			}
			fs.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		}

		return arrayExcelData;
	}

	//function for printing invalid data error
	public void printErrors(ArrayList<WebElement> errors) {
			for (int i = 0; i < errors.size(); i++) {
				System.out.println(i + 1 + ". " + errors.get(i).getText());

			}
		}

	public void reportFail(String reportString) {
//		logger.log(Status.FAIL, reportString);
//		takeScreenShot();
//		Assert.fail();
	}
}