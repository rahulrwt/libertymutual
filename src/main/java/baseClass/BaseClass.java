package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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
	//public DesiredCapabilities cap = null;
	
	@Parameters("browser")
	@Test(priority = 0)
	public void invokebrowser() {
		String browser = prop.getProperty("browser_name");
		browser="chrome";
		this.logger = report.createTest("invokeBrowser");
		try {
			logger.log(Status.INFO, "Opening the browser");

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome_path"));
				driver=new ChromeDriver();
				//cap = DesiredCapabilities.chrome();

				logger.log(Status.PASS, "Chrome opened");
			}

			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", prop.getProperty("firefox_path"));
				
				//cap = DesiredCapabilities.firefox();
				logger.log(Status.PASS, "firefox opened");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

//		try {
//
//			logger.log(Status.INFO, "node is connected to hub http://192.168.1.28:4444/wd/hub");
//			driver = new RemoteWebDriver(new URL("http://192.168.1.28:4444/wd/hub"), cap); // pass address of hub as
//																							// argument in URL()
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}

	}

	// URL

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

	public void reportFail(String reportString) {
		logger.log(Status.FAIL, reportString);
		takeScreenShot();
		Assert.fail();
	}
}
