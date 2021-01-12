package TestClass;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageClasses.Home;
import pageClasses.CurrentInsurances;
import pageClasses.Discount;
import pageClasses.UserDetails;
import pageClasses.Quote;
import pageClasses.DriverDetails;
import pageClasses.VehicleDetails;



public class App extends BaseClass{
	Home home;
	public static void sleep(int time)
	{
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void Test() {
		logger=report.createTest("libertymutual");
		try {
			home =openUrl("https://buy.libertymutual.com/");
			reportPass("Site opened Successfuly");
			
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		
		//sleep(8);
		
//		WebDriver driver=home.getDriver();
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.elementToBeClickable(home.getZipCodeElement()));

		home.setZipCode("03820");
		UserDetails stepOne = home.getPrice();
		// *******************STEP StepOne*******************

		//sleep(10);
		
		try {
			stepOne.okThanksPopUp();
			reportPass("Closed Pop-Up");
			
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		

		try {
			String firstName="asd";
			stepOne.setFirstName(firstName);
			reportPass("First Name set to"+firstName);
			
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		
		try {
			String LastName="asd";
			stepOne.setLastName(LastName);
			reportPass("LastName set to"+LastName);
			
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		
		try {
			String DOB="03/30/1991";
			stepOne.setDOB(DOB);
			reportPass("DOB set to"+DOB);
			
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		
		stepOne.clickNextPersonalDetails();
		//sleep(4);
		
		try {
			String address="h.no 8";
			stepOne.setAddress1(address);
			reportPass("address1 set to"+address);
			
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		
	
		stepOne.setAddress2("");
		stepOne.clickNextAddressDetails();

		sleep(2);

		stepOne.lastThreeMonths("yes");

		//sleep(2);
		stepOne.setEmail("rahulrawat.rrc@gmail.com");
		VehicleDetails stepTwo = stepOne.clickContinue();

		// *******************StepTwo*******************

		//sleep();

		try {

			stepTwo.setVIN("5NPEB4ACXDH537662");
				
		} catch (Exception e) {
			stepTwo.useVINInstead();
			//sleep(2);
			stepTwo.setVIN1("5NPEB4ACXDH537662");
			sleep(4);
			stepTwo.VINNext();

		}

		sleep(3);
		stepTwo.ownerShip("full paid");

		sleep(4);

		stepTwo.CarKeptAtGivenAddress("yes");

		//sleep(4);
		//stepTwo.saveAndContinue();
		//stepTwo.purchaseYear("2017");

		stepTwo.saveAndContinue();
		//sleep(4);

		DriverDetails stepThree = stepTwo.saveAndContinue();
		sleep(6);

		// *******************STEP THREE*******************
		stepThree.marriedOrCivilUnion("yes");

		sleep(2);

		stepThree.gender("male");

		//sleep(2);

	//	stepThree.licenseIssuedAtAge("18");

		//sleep(2);

		stepThree.contactNo("9501612028");
		//sleep(2);

		stepThree.saveAndContinue();

		sleep(2);

		Discount stepFour = stepThree.saveAndContinue();

		sleep(6);

		// *******************STEP FOUR*******************

		
		stepFour.haveAnotherPolicyWithLiberty("no");
		try {
			sleep(2);

			stepFour.employmentStatus("student");
		} catch (Exception e) {
			
		}
		
		sleep(2);
		stepFour.highestEducation("bachelor");

		sleep(2);

		stepFour.ownHome("single");

		sleep(2);



		stepFour.saveAndContinue();

		//sleep(5);

		stepFour.wantToSave30percent("no");
		stepFour.saveAndContinue();
		CurrentInsurances stepFive = stepFour.continueWithoutOffer();
		// *******************STEP FIVE*******************
		sleep(5);

		stepFive.currentlyHaveInsurance("no");
		sleep(2);

		stepFive.reasonForNotHavingInsurance("newly licensed");
		sleep(2);
		//stepFive.policyStartDate("January 22,2021");       //set by visible text
		sleep(2);
		Quote stepSix = stepFive.getEstimate();
		sleep(10);
		try
		{
			stepSix.printConsole();
		}
		catch(Exception e) {
			stepSix.printConsole1();
		}
		
		try {
			stepSix.saveToXls();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sleep(10);
	stepSix.closeAndFlushReport();

	}
}