package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DriverDetailRepo {

	WebDriver driver;

	public DriverDetailRepo(WebDriver driver) {
		this.driver = driver;
	}

	//WebElement zipcodeElement = driver.findElement(By.xpath("//input[@name='zipCode']"));

	public WebElement getYes() {
		System.out.print("this is page title :"+driver.getTitle());
		WebElement yes = driver.findElement(By.xpath("//span[text()='Yes']"));
			System.out.print("This is yes button text:"+ yes.getText());
		return yes;
	}

	public WebElement getNo() {
		WebElement no = driver.findElement(By.xpath("//span[text()='No']"));

		return no;
	}

	public WebElement getMale() {
		WebElement male = driver.findElement(By.xpath("//span[text()='Male']"));

		return male;
	}

	public WebElement getFemale() {
		WebElement female = driver.findElement(By.xpath("//span[text()='Female']"));

		return female;
	}

	public WebElement getAge() {
		WebElement age = driver.findElement(By.xpath("//*[@id='ageLicensed-input']"));

		return age;
	}

	public WebElement getYes1() {
		WebElement yes1 = driver.findElement(By.xpath("//*[@id=\"goodStudent-radio\"]/div/div/label[1]/span"));

		return yes1;
	}

	public WebElement getNo1() {

		WebElement no1 = driver.findElement(By.xpath("//*[@id=\"goodStudent-radio\"]/div/div/label[2]/span"));

		return no1;
	}

	public WebElement getContactNo() {
		WebElement contactNo = driver.findElement(By.xpath("//*[@id=\"primaryPhoneNumber-input-input\"]"));

		return contactNo;
	}

	public WebElement getSaveAndContinue() {

		WebElement saveAndContinue = driver.findElement(By.xpath("//button[text()='Save and continue']"));

		return saveAndContinue;
	}

}
