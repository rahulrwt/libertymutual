package TestClass;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageClasses.CurrentInsurances;
import pageClasses.Discount;
import pageClasses.DriverDetails;
import pageClasses.Home;
import pageClasses.Quote;
import pageClasses.UserDetails;
import pageClasses.VehicleDetails;

public class Test2 extends BaseClass {
	Home home;
	VehicleDetails stepTwo;
	DriverDetails stepThree;
	Discount stepFour;
	CurrentInsurances stepFive;
	Quote stepSix;

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

	@DataProvider(name = "Test1")
	public Object[][] testEventData() {

		Object[][] arrayObject = getExcelData(
				"C:\\Users\\91950\\eclipse-workspace\\libertymutual\\resources\\repository\\LibertyMutual.xlsx", "LibertyMutual",
				2, 36);

		return arrayObject;
	}

	@Test(dataProvider = "Test1", priority = 1)

	public void Test1(String zipCode, String firstName, String lastName, String DOB, String address1, String address2,
			String livedHere, String email, String VIN, String ownerShip, String keptAtGivenAddress, String address11,
			String address21, String zipcode, String city, String maritalStatus, String gender, String age,
			String fullTimeBGrade, String phoneNo, String havingPolicyWithLiberty, String otherPolicy,
			String employmentStatus, String education, String home, String wantDiscount, String smartPhone,
			String wantToRecieveMsg, String phoneNo1, String currentlyHaveInsurance, String firstInsurance,
			String injuryLimit, String reason, String shareReason, String startDate) {

		reportPass("Site opened Successfuly");

		logger = report.createTest("libertymutual");
		sleep(6);

		this.home.setZipCode(zipCode);
		sleep(3);

		UserDetails stepOne = this.home.getPrice();

		// *******************STEP StepOne*******************

		try {
			stepOne.okThanksPopUp();
			reportPass("Closed Pop-Up");

		} catch (Exception e1) {

		}

		try {
			stepOne.setFirstName(firstName);

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
		stepOne.setLastName(lastName);
		try {

			stepOne.setDOB("01/01/1996");
			reportPass("DOB set to" + DOB);

		} catch (Exception e) {
			reportFail(e.getMessage());
		}

		stepOne.clickNextPersonalDetails();

		sleep(4);

		try {
			stepOne.setAddress1(address1);
			reportPass("UserDetails Address1 set to" + address1);

		} catch (Exception e) {

			try {
				stepOne.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception E) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			reportFail(e.getMessage());
			return;

		}

		stepOne.setAddress2(address2);
		stepOne.clickNextAddressDetails();

		sleep(2);
		try {
			stepOne.lastThreeMonths(livedHere);
		} catch (Exception e) {
			try {
				stepOne.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception E) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			reportFail(e.getMessage());
			return;
		}

		// sleep(2);
		stepOne.setEmail(email);
		stepTwo = stepOne.clickContinue();
		try {
			try {

				sleep(2);
				stepTwo.setVIN(VIN);

			} catch (Exception e) {
				sleep(2);
				stepTwo.useVINInstead();
				sleep(3);
				stepTwo.setVIN1(VIN);
				sleep(4);
				stepTwo.VINNext();
			}
		} catch (Exception e) {

			try {
				stepOne.printErrors();
				openUrl("https://buy.libertymutual.com/");
			} catch (Exception E) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			reportFail(e.getMessage());
			return;

		}

		sleep(3);
		stepTwo.ownerShip(ownerShip);

		sleep(4);

		stepTwo.CarKeptAtGivenAddress(keptAtGivenAddress);

		if (keptAtGivenAddress.toLowerCase().equals("no")) {
			stepTwo.whereDoYouKeepIt(address1, address2, zipcode);
		}
		sleep(4);

		try {
			stepThree = stepTwo.saveAndContinue();
		} catch (Exception e) {
			System.out.println("this is exception " + e);
			System.out.println("**********inside Catch 1******");
		}

		sleep(4);

		try {
			stepThree = stepTwo.saveAndContinue();
		} catch (Exception e) {

		}

		sleep(5);

		stepThree.marriedOrCivilUnion("yes");

		sleep(2);

		stepThree.gender(gender);

		// stepThree.licenseIssuedAtAge(age);

		sleep(2);
		stepThree.fullTimeStudentWithBAverage(fullTimeBGrade);
		sleep(2);
		stepThree.contactNo(phoneNo);
		// sleep(2);

		stepThree.saveAndContinue();

		sleep(2);
		stepFour = stepThree.saveAndContinue();

		try {
			stepFour.haveAnotherPolicyWithLiberty(havingPolicyWithLiberty);
		} catch (Exception e) {
			try {
				stepOne.printErrors();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			reportFail(e.getMessage());
		}

		sleep(6);

		if (havingPolicyWithLiberty.toLowerCase().equals("yes")) {
			// splitting policy names and storing into List
			List<String> policies = Arrays.asList(otherPolicy.split(","));
			System.out.println(policies);
			stepFour.policiesYouHave(policies);
			sleep(2);
			stepFour.next();
		}
		sleep(2);
		try {
			stepFour.employmentStatus(employmentStatus);
		} catch (Exception e) {

		}

		sleep(2);
		stepFour.highestEducation(education);
		sleep(2);

		stepFour.ownHome(home);

		sleep(2);

		stepFour.saveAndContinue();

		sleep(5);

		stepFour.wantToSave30percent(wantDiscount);
		if (wantDiscount.toLowerCase().equals("yes")) {
			if (!stepFour.checkBoxActive()) {
				stepFour.selectCheckBox();

			}
			else
			{
				stepFour.continueWithoutOffer();
			}
			stepFour.saveAndContinue();
			stepFour.smartPhoneSelection(smartPhone);
			stepFour.wantToRecieveText(wantToRecieveMsg);
			if (wantToRecieveMsg.toLowerCase().equals("yes")) {
				stepFour.whatNumberShouldWeSendTextTo(phoneNo);
			}
		}
		stepFive = stepFour.saveAndContinue();
		if (wantDiscount.toLowerCase().equals("no"))
			stepFive = stepFour.continueWithoutOffer();

		sleep(5);

		stepFive.currentlyHaveInsurance(currentlyHaveInsurance);
		sleep(2);
		if (currentlyHaveInsurance.toLowerCase().equals("yes")) {
			stepFive.timeWithCurrentInsurer(firstInsurance);
			stepFive.next();
			stepFive.currentBodilyInjuryLimit(Integer.parseInt(injuryLimit));

		} else {
			stepFive.reasonForNotHavingInsurance(reason);
			if (reason.toLowerCase().equals("other"))
				stepFive.shareReason(shareReason);
		}
		// ****************************logic***************************
		try {
			stepFive.policyStartDate(startDate);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		stepSix = stepFive.getEstimate();
		sleep(10);
		try {
			stepSix.printConsole();
		} catch (Exception e) {
			// stepSix.printConsole1();
		}

		try {
			stepSix.saveToXls();
		} catch (IOException e) {

			e.printStackTrace();
		}
		openUrl("https://buy.libertymutual.com/");
	}
@AfterSuite
public void afterSuit()
{
	stepSix.closeAndFlushReport();
}
}