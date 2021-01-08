package com.team13.libertymutual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import pageClasses.Home;
import pageClasses.StepFive;
import pageClasses.StepFour;
import pageClasses.StepOne;
import pageClasses.StepSix;
import pageClasses.StepThree;
import pageClasses.StepTwo;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass bClass = new BaseClass();

		bClass.invokebrowser("chrome");
		Home home = bClass.openUrl("https://buy.libertymutual.com/");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		WebDriver driver=home.getDriver();
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.elementToBeClickable(home.getZipCodeElement()));

		home.setZipCode("03820");
		StepOne stepOne = home.getPrice();
		// *******************STEP StepOne*******************

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
		StepTwo stepTwo = stepOne.clickContinue();

		// *******************StepTwo*******************

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			stepTwo.setVIN("5NPEB4ACXDH537662");
				
		} catch (Exception e) {
			stepTwo.useVINInstead();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			stepTwo.setVIN1("5NPEB4ACXDH537662");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			stepTwo.VINNext();

		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepTwo.ownerShip("full paid");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepTwo.CarKeptAtGivenAddress("yes");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepTwo.purchaseYear("2017");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepTwo.saveAndContinue();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		StepThree stepThree = stepTwo.saveAndContinue();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// *******************STEP THREE*******************
		stepThree.marriedOrCivilUnion("yes");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepThree.gender("male");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepThree.licenseIssuedAtAge(18);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepThree.contactNo("9501612028");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepThree.saveAndContinue();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		StepFour stepFour = stepThree.saveAndContinue();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// *******************STEP FOUR*******************

		try {
			stepFour.employmentStatus("student");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepFour.haveAnotherPolicyWithLiberty("no");

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepFour.highestEducation("bachelor");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepFour.ownHome("single");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// stepFour.saveAndContinue();

//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		stepFour.saveAndContinue();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepFour.wantToSave30percent("no");
		stepFour.saveAndContinue();
		StepFive stepFive = stepFour.continueWithoutOffer();
		// *******************STEP FIVE*******************
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepFive.currentlyHaveInsurance("no");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		stepFive.reasonForNotHavingInsurance("newly licensed");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stepFive.policyStartDate("January 22,2021");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StepSix stepSix = stepFive.getEstimate();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}