package repository;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiscountRepo {

	WebDriver driver;

	public DiscountRepo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getYes() {
		return driver.findElement(By.xpath("//span[text()='Yes']"));

	}

	public WebElement getNo() {
		return driver.findElement(By.xpath("//span[text()='No']"));

	}

	public WebElement getHome() {
		return driver.findElement(By.xpath("//span[text()='Renters / home / condo']"));

	}

	public WebElement getLife() {
		return driver.findElement(By.xpath("//span[text()='Life']"));

	}

	public WebElement getAuto() {
		return driver.findElement(By.xpath("//span[text()='Auto']"));

	}

	public WebElement getPeronalInsurance() {
		return driver.findElement(By.xpath("//span[text()='Personal liability protection']"));

	}

	public WebElement getLandLord() {
		return driver.findElement(By.xpath("//span[text()='Landlord']"));

	}

	public WebElement getMotorcycle() {
		return driver.findElement(By.xpath("//span[text()='Motorcycle']"));

	}

	public WebElement getOther_policy() {
		return driver.findElement(By.xpath("//span[text()='Other']"));

	}

	public WebElement getEmployed() {

		return driver.findElement(By.xpath("//span[text()='Employed/self-employed']"));

	}

	public WebElement getStudent() {

		return driver.findElement(By.xpath("//span[text()='Student']"));

	}

	public WebElement getRetired() {

		return driver.findElement(By.xpath("//span[text()='Retired']"));

	}

	public WebElement getMilitary() {

		return driver.findElement(By.xpath("//span[text()='In the military']"));

	}

	public WebElement getNotseekingemployment() {
		return driver.findElement(By.xpath("//span[text()='Not seeking employment']"));

	}

	public WebElement getUnemployed() {
		return driver.findElement(By.xpath("//span[text()='Unemployed']"));

	}

	public WebElement getHighschool() {
		return driver.findElement(By.xpath("//span[text()='High school diploma/equivalent']"));

	}

	public WebElement getVocational() {
		return driver.findElement(By.xpath("//span[text()='Vocational school']"));

	}

	public WebElement getAssociatedegree() {

		return driver.findElement(By.xpath("//span[text()='Associate degree/some college']"));

	}

	public WebElement getBachelor() {

		return driver.findElement(By.xpath("//span[text()='Bachelor’s degree']"));

	}

	public WebElement getAdvanced() {

		return driver.findElement(By.xpath("//span[text()='Master’s, Ph.D., J.D., etc']"));

	}

	public WebElement getOther() {

		return driver.findElement(By.xpath("//span[text()='Other']"));

	}

	public WebElement getSingle() {

		return driver.findElement(By.xpath("//span[text()='Yes, single or multi-family']"));

	}

	public WebElement getCondo() {
		return driver.findElement(By.xpath("//span[text()='Yes, condo or co-op']"));

	}

	public WebElement getMobile() {

		return driver.findElement(By.xpath("//span[text()='Yes, mobile home']"));

	}

	public WebElement getNo_home() {

		return driver.findElement(By.xpath("//span[text()='No']"));

	}

	public WebElement getSaveAndContinue() {

		return driver.findElement(By.xpath("//button[text()='Save and continue']"));

	}

	public WebElement getYes_Offer() {

		return driver.findElement(By.xpath("//span[text()='Yes, sign me up!']"));

	}

	public WebElement getNo_Offer() {

		return driver.findElement(By.xpath("//span[text()='No, thanks']"));

	}

	public WebElement getNext() {
		return driver.findElement(By.xpath("//button[text()='Next']"));

	}

	public WebElement getIphone5() {

		return driver.findElement(By.xpath("//span[text()='iPhone 5 or newer']"));

	}

	public WebElement getAndroid4() {

		return driver.findElement(By.xpath("//span[text()='Android 4.4 or newer']"));

	}

	public WebElement getOther_phone() {

		return driver.findElement(By.xpath("//span[text()='Other']"));

	}

	public WebElement getNoPhone() {

		return driver.findElement(By.xpath("//span[text()='I don’t have a smartphone']"));

	}

	public WebElement getYes_RecieveText() {
		return driver.findElement(By.xpath("//span[text()='Yes']"));

	}

	public WebElement getNo_RecieveText() {
		return driver.findElement(By.xpath("//span[text()='No']"));

	}

	public WebElement getWithoutOffer() {
		return driver.findElement(By.xpath("//button[text()='Continue without discount']"));

	}

	public WebElement getWhatNumber() {
		return driver.findElement(By.xpath("//*[@id=\"mobilePhoneNumber-input-input\"]"));

	}

	public boolean getCheckBoxStatus() {
		WebElement boxStatus = driver
				.findElement(By.xpath("//*[@id='visualCheckboxGroupV2-2']/fieldset/div/div/div/label/span[2]/span"));
		if (boxStatus.getAttribute("checked").equals("true")) {
			return true;
		}
		return false;
	}

	public WebElement getCheckBox() {
		return driver
				.findElement(By.xpath("//*[@id=\"visualCheckboxGroupV2-6\"]/fieldset/div/div/div/label/span[2]/span"));
	}

	public ArrayList<WebElement> getErrorList() throws Exception {
		return (ArrayList<WebElement>) driver
				.findElements(By.xpath("//ul[@class='lm-FieldGroupMessage is-error']/li/span"));

	}

}
