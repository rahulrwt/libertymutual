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
		WebElement yes = driver.findElement(By.xpath("//span[text()='Yes']"));

		return yes;
	}

	public WebElement getNo() {
		WebElement no = driver.findElement(By.xpath("//span[text()='No']"));

		return no;
	}

	public WebElement getHome() {
		WebElement home = driver.findElement(By.xpath("//span[text()='Renters / home / condo']"));

		return home;
	}

	public WebElement getLife() {
		WebElement life = driver.findElement(By.xpath("//span[text()='Life']"));
		return life;
	}

	public WebElement getAuto() {
		WebElement auto = driver.findElement(By.xpath("//span[text()='Auto']"));

		return auto;
	}

	public WebElement getPeronalInsurance() {
		WebElement peronalInsurance = driver.findElement(By.xpath("//span[text()='Personal liability protection']"));

		return peronalInsurance;
	}

	public WebElement getLandLord() {
		WebElement landLord = driver.findElement(By.xpath("//span[text()='Landlord']"));

		return landLord;
	}

	public WebElement getMotorcycle() {
		WebElement motorcycle = driver.findElement(By.xpath("//span[text()='Motorcycle']"));

		return motorcycle;
	}

	public WebElement getOther11() {
		WebElement other11 = driver.findElement(By.xpath("//span[text()='Other']"));

		return other11;
	}

	public WebElement getEmployed() {

		WebElement employed = driver.findElement(By.xpath("//span[text()='Employed/self-employed']"));

		return employed;
	}

	public WebElement getStudent() {

		WebElement student = driver.findElement(By.xpath("//span[text()='Student']"));

		return student;
	}

	public WebElement getRetired() {

		WebElement retired = driver.findElement(By.xpath("//span[text()='Retired']"));

		return retired;
	}

	public WebElement getMilitary() {

		WebElement military = driver.findElement(By.xpath("//span[text()='In the military']"));

		return military;
	}

	public WebElement getNotseekingemployment() {
		WebElement notseekingemployment = driver.findElement(By.xpath("//span[text()='Not seeking employment']"));

		return notseekingemployment;
	}

	public WebElement getUnemployed() {

		WebElement unemployed = driver.findElement(By.xpath("//span[text()='Unemployed']"));

		return unemployed;
	}

	public WebElement getHighschool() {
		WebElement highschool = driver.findElement(By.xpath("//span[text()='High school diploma/equivalent']"));

		return highschool;
	}

	public WebElement getVocational() {
		WebElement vocational = driver.findElement(By.xpath("//span[text()='Vocational school']"));

		return vocational;
	}

	public WebElement getAssociatedegree() {

		WebElement associatedegree = driver.findElement(By.xpath("//span[text()='Associate degree/some college']"));

		return associatedegree;
	}

	public WebElement getBachelor() {

		WebElement bachelor = driver.findElement(By.xpath("//span[text()='Bachelor’s degree']"));

		return bachelor;
	}

	public WebElement getAdvanced() {

		WebElement advanced = driver.findElement(By.xpath("//span[text()='Master’s, Ph.D., J.D., etc']"));

		return advanced;
	}

	public WebElement getOther() {

		WebElement other = driver.findElement(By.xpath("//span[text()='Other']"));

		return other;
	}

	public WebElement getSingle() {

		WebElement single = driver.findElement(By.xpath("//span[text()='Yes, single or multi-family']"));

		return single;
	}

	public WebElement getCondo() {
		WebElement condo = driver.findElement(By.xpath("//span[text()='Yes, condo or co-op']"));

		return condo;
	}

	public WebElement getMobile() {

		WebElement mobile = driver.findElement(By.xpath("//span[text()='Yes, mobile home']"));

		return mobile;
	}

	public WebElement getNo1() {

		WebElement no1 = driver.findElement(By.xpath("//span[text()='No']"));

		return no1;
	}

	public WebElement getSaveAndContinue() {

		WebElement saveAndContinue = driver.findElement(By.xpath("//button[text()='Save and continue']"));

		return saveAndContinue;
	}

	public WebElement getYes1() {

		WebElement yes1 = driver.findElement(By.xpath("//span[text()='Yes, sign me up!']"));

		return yes1;
	}

	public WebElement getNo11() {

		WebElement no11 = driver.findElement(By.xpath("//span[text()='No, thanks']"));

		return no11;
	}

	public WebElement getNext() {
		WebElement next = driver.findElement(By.xpath("//button[text()='Next']"));

		return next;
	}

	public WebElement getIphone5() {

		WebElement iphone5 = driver.findElement(By.xpath("//span[text()='iPhone 5 or newer']"));

		return iphone5;
	}

	public WebElement getAndroid4() {

		WebElement android4 = driver.findElement(By.xpath("//span[text()='Android 4.4 or newer']"));

		return android4;
	}

	public WebElement getOther1() {

		WebElement other1 = driver.findElement(By.xpath("//span[text()='Other']"));

		return other1;
	}

	public WebElement getNoPhone() {

		WebElement noPhone = driver.findElement(By.xpath("//span[text()='I don’t have a smartphone']"));

		return noPhone;
	}

	public WebElement getYes11() {
		WebElement yes11 = driver.findElement(By.xpath("//span[text()='Yes']"));

		return yes11;
	}

	public WebElement getNo111() {
		WebElement no111 = driver.findElement(By.xpath("//span[text()='No']"));

		return no111;
	}

	public WebElement getWithoutOffer() {
		WebElement withoutOffer = driver.findElement(By.xpath("//button[text()='Continue without discount']"));
		return withoutOffer;
	}

	public WebElement getWhatNumber() {
		WebElement whatNumber = driver.findElement(By.xpath("//*[@id=\"mobilePhoneNumber-input-input\"]"));
		return whatNumber;
	}

	public boolean getCheckBoxStatus() {
		WebElement boxStatus = driver.findElement(
				By.xpath("//*[@id='visualCheckboxGroupV2-2']/fieldset/div/div/div/label/span[2]/span"));
		if (boxStatus.getAttribute("checked").equals("true")) {
			return true;
		}
		return false;
	}

	public WebElement getCheckBox() {
		WebElement checkBox = driver
				.findElement(By.xpath("//*[@id=\"visualCheckboxGroupV2-6\"]/fieldset/div/div/div/label/span[2]/span"));
		return checkBox;
	}

	public ArrayList<WebElement> getErrorList() throws Exception {
		ArrayList<WebElement> errors = (ArrayList<WebElement>) driver
				.findElements(By.xpath("//ul[@class='lm-FieldGroupMessage is-error']/li/span"));
		return errors;
	}

}
