package com.team13.libertymutual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import pageClasses.Home;
import pageClasses.StepOne;
import pageClasses.StepTwo;

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
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		WebDriver driver=home.getDriver();
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.elementToBeClickable(home.getZipCodeElement()));
//		
		home.setZipCode("03820");
		StepOne stepOne=home.getPrice();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepOne.okThanksPopUp();
		
		stepOne.setFirstName("asd");
		stepOne.setLastName("sad");
		stepOne.setDOB("03/30/1991");
		stepOne.clickNextPersonalDetails();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepOne.setAddress1("h.no 8");
		stepOne.setAddress2("");
		stepOne.clickNextAddressDetails();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		stepOne.lastThreeMonths("yes");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepOne.setEmail("rahulrawat.rrc@gmail.com");
		StepTwo stepTwo=stepOne.clickContinue();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			stepTwo.dontHavePlate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
		stepTwo.setVehicleYear("2015");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepTwo.selectChevrolet();
		stepTwo.setVehicleSpecs("CAMARO", "LS", "2 DOOR COUPE");
}
}