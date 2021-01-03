package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import pageClasses.Home;

public class BaseClass {

	public static WebDriver driver;
	

	static Properties prop = readProperties();

	@Parameters("browser")

	public void invokebrowser(String browser) {
		try {
			// logger.log(Status.INFO, "Opening the browser");

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome_path"));
				driver = new ChromeDriver();

				// logger.log(Status.PASS, "Browser opened");
			}

			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", prop.getProperty("firefox_path"));
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// URL

	public Home openUrl(String URL) {
		driver.get(URL);
		//driver.manage().window().maximize();
		return PageFactory.initElements(driver, Home.class);
	}
	// Title validation

	public void timewait(int time) {
		try {
			Thread.sleep(time * 500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {

		driver.close();

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
}
