package TestClass;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseClass.BaseClass;
import pageClasses.CurrentInsurances;
import pageClasses.Discount;
import pageClasses.DriverDetails;
import pageClasses.Home;
import pageClasses.Quote;
import pageClasses.UserDetails;
import pageClasses.VehicleDetails;

public class Invalid_Test extends BaseClass {
	Home home;
	VehicleDetails vehicleDetails;
	DriverDetails driverDetails;
	Discount discount;
	CurrentInsurances currentInsurances;
	Quote quote;
	int i=0;
	public static void sleep(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeSuite
	public void Initial() {
		invokebrowser();
		home = openUrl("https://buy.libertymutual.com/");
	}

	@DataProvider(name = "invalidTest")
	public Object[][] testEventData() {

		Object[][] arrayObject = getExcelData(
				"C:\\Users\\91950\\eclipse-workspace\\libertymutual\\resources\\repository\\InvalidData_LibertyInsurance.xlsx",
				"LibertyMutual", 3, 39);

		return arrayObject;
	}
	
	 
	@Test(dataProvider = "invalidTest", priority = 1)

	public void invalidTest(String zipCode, String firstName, String lastName, String DOB, String address1,
			String address2, String livedHere, String livedBeforeAddress1, String livedBeforeAddress2,
			String livedBeforeZipcode, String email, String VIN, String ownerShip, String keptAtGivenAddress,
			String address11, String address21, String zipcode, String city, String maritalStatus, String gender,
			String age, String fullTimeBGrade, String phoneNo, String havingPolicyWithLiberty, String otherPolicy,
			String employmentStatus, String education, String home, String wantDiscount, String smartPhone,
			String wantToRecieveMsg, String phoneNo1, String currentlyHaveInsurance, String firstInsurance,
			String injuryLimit, String reason, String shareReason, String startDate) {

		logger = report.createTest("libertymutual_Home");

		sleep(6);

		this.home.setZipCode(zipCode);
		logger.log(Status.INFO, "Zipcode set to: " + zipCode);
		sleep(3);

		UserDetails userDetails = this.home.getPrice();
		sleep(3);
		try {
			this.home.printErrors();
			reportFail(this.home.returnErrors());

			openUrl("https://buy.libertymutual.com/");
			return;
		} catch (Exception E) {
			reportPass("Zipcode has been successfully set to: " + zipCode);
		}

		// ****************************USER DETAILS *********************************
		logger = report.createTest("libertymutual_UserDetails");
		try {
			userDetails.okThanksPopUp();
			logger.log(Status.INFO, "Closed Pop-Up");

		} catch (Exception e1) {
			logger.log(Status.INFO, "Pop-not closed/Pop-up didn't apear");
		}

		try {
			userDetails.setFirstName(firstName);
			logger.log(Status.INFO, "FirstName set to" + firstName);

		} catch (Exception e) {

			try {
				this.home.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception E) {
				// TODO Auto-generated catch block
				E.printStackTrace();
			}
			reportFail(this.home.returnErrors());
			return;
		}
		userDetails.setLastName(lastName);
		if (lastName.length() > 0)
			logger.log(Status.INFO, "Last Name set to " + lastName);

		userDetails.setDOB("01/01/1996");
		logger.log(Status.INFO, "DOB set to" + DOB);

		userDetails.clickNextPersonalDetails();

		sleep(4);

		try {
			userDetails.setAddress1(address1);
			logger.log(Status.PASS, "User Name and DOB has been set");
			logger.log(Status.INFO, "UserDetails Address1 set to" + address1);

		} catch (Exception e) {

			try {
				userDetails.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception E) {

				e.printStackTrace();
			}

			reportFail(userDetails.returnErrors());
			return;
		}

		userDetails.setAddress2(address2);
		logger.log(Status.INFO, "UserDetails Address2 set to" + address2);

		userDetails.clickNextAddressDetails();

		sleep(2);
		try {

			userDetails.lastThreeMonths(livedHere);
			reportPass("User Address has been set");
		} catch (Exception e) {
			try {
				userDetails.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception E) {
				e.printStackTrace();
			}

			reportFail(userDetails.returnErrors());
			return;
		}

		if (livedHere.toLowerCase().equals("no")) {
			userDetails.whereDidYouLiveBefore(livedBeforeAddress1, livedBeforeAddress2, livedBeforeZipcode);
			sleep(2);
			logger.log(Status.INFO, "Where Did you live Before Address1: " + livedBeforeAddress1 + " Address1: "
					+ livedBeforeAddress2 + " Zipcode: " + livedBeforeZipcode);
			userDetails.next();
			reportPass("Address added");
		}

		sleep(2);
		userDetails.setEmail(email);
		logger.log(Status.INFO, "Email set to: " + email);

		// ***********************Vehicle details
		// Page*****************************************

		vehicleDetails = userDetails.clickContinue();
		sleep(5);
		try {
			vehicleDetails.haveOtherVehicle();
			sleep(1);
			vehicleDetails.saveAndContinue();
		} catch (Exception e) {
			System.out.println(e);
		}
		sleep(6);

		try {
			try {

				sleep(4);
				vehicleDetails.setVIN(VIN);
			} catch (Exception e) {
				sleep(4);
				vehicleDetails.useVINInstead();
				sleep(3);
				vehicleDetails.setVIN1(VIN);
				sleep(2);
				vehicleDetails.VINNext();
			}

			reportPass("User Details form has been filled successfully");
			logger = report.createTest("LibertyMutual_VehicleDetails");
			logger.log(Status.INFO, "VIN has been set to: " + VIN);
		} catch (Exception e) {

			try {
				userDetails.printErrors();
				sleep(2);
				openUrl("https://www.libertymutual.com/get-a-quote");
			} catch (Exception E) {
			}

			System.out.println(userDetails.returnErrors());
			reportFail(userDetails.returnErrors());
			return;
		}

		sleep(3);
		vehicleDetails.ownerShip(ownerShip);
		logger.log(Status.INFO, "Owner ship " + ownerShip + " has been selected");
		sleep(4);

		vehicleDetails.CarKeptAtGivenAddress(keptAtGivenAddress);

		if (keptAtGivenAddress.toLowerCase().equals("no")) {
			vehicleDetails.whereDoYouKeepIt(address1, address2, zipcode);
			logger.log(Status.INFO,
					"Car is kept at address1: " + address1 + " address2: " + address2 + " zipcode: " + zipCode);
		}
		sleep(4);

		driverDetails = vehicleDetails.saveAndContinue();
		sleep(4);

		if (!vehicleDetails.getTitle().equals("Liberty Mutual - Vehicle Review")) {
			reportFail("Please enter valid details");
			openUrl("https://www.libertymutual.com/get-a-quote");
			return;
		}

		// ************************DRIVER DETAILS****************************
		driverDetails = vehicleDetails.saveAndContinue();
		logger = report.createTest("LibertyMutual_DriverDetails");
		sleep(5);
		driverDetails.marriedOrCivilUnion("yes");

		sleep(2);
		driverDetails.gender(gender);

		sleep(2);
		driverDetails.fullTimeStudentWithBAverage(fullTimeBGrade);

		sleep(2);
		driverDetails.contactNo(phoneNo);
		logger.log(Status.INFO, "Contact no added");

		driverDetails.saveAndContinue();

		sleep(2);

		// ***********************************DISCOUNT
		// PAGE*******************************

		discount = driverDetails.saveAndContinue();

		try {
			discount.haveAnotherPolicyWithLiberty(havingPolicyWithLiberty);
			reportPass("Driver Details form submitted successfully");
		} catch (Exception e) {
			try {
				driverDetails.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			reportFail(discount.returnErrors());
			return;
		}
		sleep(6);

		logger = report.createTest("LibertyMutual_Discount");
		if (havingPolicyWithLiberty.toLowerCase().equals("yes")) {

			// splitting policy names and storing into List
			List<String> policies = Arrays.asList(otherPolicy.split(","));
			System.out.println(policies);
			discount.policiesYouHave(policies);
			sleep(2);
			discount.next();
		}
		sleep(2);

		try {
			discount.employmentStatus(employmentStatus);
			logger.log(Status.INFO, "employment status:" + employmentStatus + " has been selected");
		} catch (Exception e) {

		}

		sleep(2);
		discount.highestEducation(education);
		logger.log(Status.INFO, "Highest education:" + education + " has been selected");

		sleep(2);

		discount.ownHome(home);

		sleep(2);

		discount.saveAndContinue();

		sleep(5);

		discount.next();
		sleep(2);
		
		discount.smartPhoneSelection(smartPhone);
		discount.wantToRecieveText(wantToRecieveMsg);
		if (wantToRecieveMsg.toLowerCase().equals("yes")) {
			discount.whatNumberShouldWeSendTextTo(phoneNo);
			logger.log(Status.INFO,"Phone no for recieving text has been set");
		}
		sleep(2);
		currentInsurances = discount.saveAndContinue();
		if (wantDiscount.toLowerCase().equals("no"))
			currentInsurances = discount.continueWithoutOffer();

		sleep(5);

		currentInsurances.currentlyHaveInsurance(currentlyHaveInsurance);
		sleep(2);
		if (currentlyHaveInsurance.toLowerCase().equals("yes")) {
			currentInsurances.timeWithCurrentInsurer(firstInsurance);
			
			sleep(2);
			currentInsurances.next();
			currentInsurances.currentBodilyInjuryLimit(injuryLimit);
			logger.log(Status.INFO,"Injury limit has been set");

		} else {
			currentInsurances.reasonForNotHavingInsurance(reason);
			if (reason.toLowerCase().equals("other"))
				currentInsurances.shareReason(shareReason);
			logger.log(Status.INFO,"Reason for not having Insurance has been set");
		}
		// ****************************logic***************************
		sleep(2);
		try {
			currentInsurances.policyStartDate(startDate);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		quote = currentInsurances.getEstimate();
		sleep(10);

		try {
			quote.saveToXls();
		} catch (IOException e) {

			e.printStackTrace();
		}
		openUrl("https://www.libertymutual.com/get-a-quote");
		sleep(5);
	}

	@AfterSuite
	public void afterSuit() {
		closeAndFlushReport();
	}
}