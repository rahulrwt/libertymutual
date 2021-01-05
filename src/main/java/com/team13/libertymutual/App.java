package com.team13.libertymutual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import pageClasses.Home;
import pageClasses.StepFive;
import pageClasses.StepFour;
import pageClasses.StepOne;
import pageClasses.StepThree;
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
			Thread.sleep(8000);
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
		//*******************STEP StepOne*******************
	
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
	
		//*******************StepTwo*******************

		
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
		
		stepTwo.setVehicleYear(2015);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//*********************************Have to change*****************
		stepTwo.selectChevrolet();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//stepTwo.setVehicleSpecs("CAMARO", "LS", "2 DOOR COUPE");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepTwo.clickNext();
		
		stepTwo.ownerShip("full paid");
		stepTwo.CarKeptAtGivenAddress("yes");
		stepTwo.purchaseYear(2020);
		stepTwo.saveAndContinue();
		
		StepThree stepThree=stepTwo.saveAndContinue();
		
		//*******************STEP THREE*******************
		stepThree.marriedOrCivilUnion("yes");
		stepThree.gender("male");
		stepThree.licenseIssuedAtAge(18);
		stepThree.contactNo("9501612028");
		stepThree.saveAndContinue();
		StepFour stepFour=stepThree.saveAndContinue();
		
		//*******************STEP FOUR*******************
			stepFour.employmentStatus("student");
			stepFour.highestEducation("vocational");
			stepFour.ownHome("single");
			stepFour.saveAndContinue();
			StepFive stepFive=stepFour.saveAndContinue();
			//*******************STEP FIVE*******************
			
}
}