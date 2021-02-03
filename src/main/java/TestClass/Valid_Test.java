package TestClass;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
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

public class Valid_Test extends BaseClass {
	Home home;
	VehicleDetails vehicleDetails;
	DriverDetails driverDetails;
	Discount discount;
	CurrentInsurances currentInsurances;
	Quote quote;

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

	@DataProvider(name = "validTest")
	public Object[][] testEventData() {

		Object[][] arrayObject = getExcelData(
				"C:\\Users\\91950\\eclipse-workspace\\libertymutual\\resources\\repository\\ValidData_LibertyInsurance.xlsx",
				"ValidData", 2, 39);

		return arrayObject;
	}

	@Test(dataProvider = "validTest", priority = 1)

	public void validTest(String zipCode, String firstName, String lastName, String DOB, String address1,
			String address2, String livedHere, String livedBeforeAddress1, String livedBeforeAddress2,
			String livedBeforeZipcode, String email, String VIN, String ownerShip, String keptAtGivenAddress,
			String address11, String address21, String zipcode, String city, String maritalStatus, String gender,
			String age, String fullTimeBGrade, String phoneNo, String havingPolicyWithLiberty, String otherPolicy,
			String employmentStatus, String education, String home, String wantDiscount, String smartPhone,
			String wantToRecieveMsg, String phoneNo1, String currentlyHaveInsurance, String firstInsurance,
			String injuryLimit, String reason, String shareReason, String startDate) {

		reportPass("Site opened Successfuly");

		logger = report.createTest("libertymutual");
		sleep(6);

		this.home.setZipCode(zipCode);
		sleep(3);

		UserDetails userDetails = this.home.getPrice();

		sleep(3);
		try {
			this.home.printErrors();
			openUrl("https://buy.libertymutual.com/");
			return;
		} catch (Exception E) {

		}

		// *******************STEP userDetails*******************

		try {
			userDetails.okThanksPopUp();
			reportPass("Closed Pop-Up");

		} catch (Exception e1) {

		}

		try {
			userDetails.setFirstName(firstName);

			reportPass("FirstName set to" + firstName);

		} catch (Exception e) {

			try {
				this.home.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception E) {
				// TODO Auto-generated catch block
				E.printStackTrace();
			}
			reportFail(e.getMessage());
			return;
		}
		userDetails.setLastName(lastName);
		try {

			userDetails.setDOB("01/01/1996");
			reportPass("DOB set to" + DOB);

		} catch (Exception e) {
			reportFail(e.getMessage());
		}

		userDetails.clickNextPersonalDetails();

		sleep(4);

		try {
			userDetails.setAddress1(address1);
			reportPass("UserDetails Address1 set to" + address1);

		} catch (Exception e) {

			try {
				userDetails.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception E) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			reportFail(e.getMessage());
			return;

		}

		userDetails.setAddress2(address2);
		userDetails.clickNextAddressDetails();

		sleep(2);
		try {

			userDetails.lastThreeMonths(livedHere);
		} catch (Exception e) {
			try {
				userDetails.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception E) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			reportFail(e.getMessage());
			return;
		}
		if (livedHere.toLowerCase().equals("no")) {
			userDetails.whereDidYouLiveBefore(livedBeforeAddress1, livedBeforeAddress2, livedBeforeZipcode);
			sleep(2);
			userDetails.next();

		}
		// have to create branch for no

		sleep(2);
		userDetails.setEmail(email);
		vehicleDetails = userDetails.clickContinue();

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
		} catch (Exception e) {

			try {
				userDetails.printErrors();
				openUrl("https://www.libertymutual.com/get-a-quote");
			} catch (Exception E) {

				e.printStackTrace();
			}

			reportFail(e.getMessage());
			return;

		}

		sleep(3);
		vehicleDetails.ownerShip(ownerShip);

		sleep(4);

		vehicleDetails.CarKeptAtGivenAddress(keptAtGivenAddress);

		if (keptAtGivenAddress.toLowerCase().equals("no")) {
			vehicleDetails.whereDoYouKeepIt(address1, address2, zipcode);
		}
		sleep(4);

		try {
			driverDetails = vehicleDetails.saveAndContinue();
		} catch (Exception e) {

		}

		sleep(4);

		try {
			driverDetails = vehicleDetails.saveAndContinue();
		} catch (Exception e) {

		}

		sleep(5);

		driverDetails.marriedOrCivilUnion("yes");

		sleep(2);

		driverDetails.gender(gender);

		// driverDetails.licenseIssuedAtAge(age);

		sleep(2);
		driverDetails.fullTimeStudentWithBAverage(fullTimeBGrade);
		sleep(2);
		driverDetails.contactNo(phoneNo);
		// sleep(2);

		driverDetails.saveAndContinue();

		sleep(2);
		discount = driverDetails.saveAndContinue();

		try {
			discount.haveAnotherPolicyWithLiberty(havingPolicyWithLiberty);
		} catch (Exception e) {
			try {
				userDetails.printErrors();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			reportFail(e.getMessage());
		}

		sleep(6);

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
		} catch (Exception e) {

		}

		sleep(2);
		discount.highestEducation(education);
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

		} else {
			currentInsurances.reasonForNotHavingInsurance(reason);
			if (reason.toLowerCase().equals("other"))
				currentInsurances.shareReason(shareReason);
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
		quote.closeAndFlushReport();
	}
}