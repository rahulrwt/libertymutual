package com.team13.libertymutual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import pageClasses.Home;
import pageClasses.StepOne;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass bClass = new BaseClass();

		bClass.invokebrowser("chrome");
		Home home=bClass.openUrl("https://buy.libertymutual.com/");
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		WebDriver driver=home.getDriver();
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.elementToBeClickable(home.getZipCodeElement()));
//		
		home.setZipCode("03820");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StepOne stepOne=home.getPrice();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepOne.closePopUp();
		
		stepOne.setFirstName("asd");
		stepOne.setLastName("sad");
		stepOne.setDOB("03/30/1991");
		stepOne.clickNextPersonalDetails();
		stepOne.setAddress1("h.no 8");
		stepOne.setAddress2("");
		stepOne.clickNextAddressDetails();
		stepOne.lastThreeMonths("yes");
}
}