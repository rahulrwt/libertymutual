//package TestClass;
//
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import baseClass.BaseClass;
//import pageClasses.CurrentInsurances;
//import pageClasses.Discount;
//import pageClasses.DriverDetails;
//import pageClasses.Home;
//import pageClasses.Quote;
//import pageClasses.UserDetails;
//import pageClasses.VehicleDetails;
//
//public class App extends BaseClass {
//	Home home;
//	VehicleDetails stepTwo;
//	DriverDetails stepThree;
//	Discount stepFour;
//	CurrentInsurances stepFive;
//	Quote stepSix;
//
//	public static void sleep(int time) {
//		try {
//			Thread.sleep(time * 1000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
//	}
//
//	@BeforeSuite
//	public void Initial() {
//		invokebrowser();
//		home = openUrl("https://buy.libertymutual.com/");
//	}
//
//	// *******************StepOne User Page*******************
//
//	@DataProvider(name = "Test1")
//	public Object[][] testEventData() {
//
//		Object[][] arrayObject = getExcelData(
//				"C:\\Users\\91950\\eclipse-workspace\\libertymutual\\resources\\repository\\Test1.xlsx", "UserDetail",
//				2, 9);
//
//		return arrayObject;
//	}
//
//	@Test(dataProvider = "Test1", priority = 1)
//	
//	public void Test1(String zipCode, String firstName, String lastName, String DOB, String address1, String address2,
//			String livedHere, String email) {
//
//		reportPass("Site opened Successfuly");
//
//		logger = report.createTest("libertymutual");
//		sleep(6);
//
//		home.setZipCode(zipCode);
//		sleep(3);
//
//		UserDetails stepOne = home.getPrice();
//		// *******************STEP StepOne*******************
//
//		try {
//			stepOne.okThanksPopUp();
//			reportPass("Closed Pop-Up");
//
//		} catch (Exception e) {
//			reportFail(e.getMessage());
//		}
//
//		try {
//
//			stepOne.setFirstName(firstName);
//			reportPass("First Name set to" + firstName);
//
//		} catch (Exception e) {
//			reportFail(e.getMessage());
//		}
//
//		try {
//
//			stepOne.setLastName(lastName);
//			reportPass("LastName set to" + lastName);
//
//		} catch (Exception e) {
//			reportFail(e.getMessage());
//		}
//
//		try {
//
//			stepOne.setDOB("01/01/1996");
//			reportPass("DOB set to" + DOB);
//
//		} catch (Exception e) {
//			reportFail(e.getMessage());
//		}
//
//		stepOne.clickNextPersonalDetails();
//		sleep(4);
//
//		try {
//			stepOne.setAddress1(address1);
//			reportPass("UserDetails Address1 set to" + address1);
//
//		} catch (Exception e) {
//			reportFail(e.getMessage());
//		}
//
//		stepOne.setAddress2(address2);
//		stepOne.clickNextAddressDetails();
//
//		sleep(2);
//
//		stepOne.lastThreeMonths(livedHere);
//
//		// sleep(2);
//		stepOne.setEmail(email);
//		stepTwo = stepOne.clickContinue();
//	}
//
//	// *******************StepTwo Vehicle Page*******************
//
//	@DataProvider(name = "Test2")
//	public Object[][] testEventData2() {
//
//		Object[][] arrayObject = getExcelData(
//				"C:\\Users\\91950\\eclipse-workspace\\libertymutual\\resources\\repository\\Test1.xlsx",
//				"VehicleDetails", 2, 8);
//		System.out.print("*****************STEP2******************");
//		return arrayObject;
//	}
//
//	@Test(dataProvider = "Test2", priority = 2)
//	public void Test2(String VIN, String ownerShip, String keptAtGivenAddress, String address1, String address2,
//			String zipcode, String city, String execute) {
//
//		if (execute.equals("no")) {
//			return;
//		}
//		try {
//			sleep(2);
//			stepTwo.setVIN(VIN);
//
//		} catch (Exception e) {
//			sleep(2);
//			stepTwo.useVINInstead();
//			sleep(3);
//			stepTwo.setVIN1(VIN);
//			sleep(4);
//			stepTwo.VINNext();
//		}
//
//		sleep(3);
//		stepTwo.ownerShip(ownerShip);
//
//		sleep(4);
//
//		stepTwo.CarKeptAtGivenAddress(keptAtGivenAddress);
//
//		if (keptAtGivenAddress.toLowerCase().equals("no")) {
//			stepTwo.whereDoYouKeepIt(address1, address2, zipcode);
//		}
//		sleep(4);
//		System.out.println("Title of stepTwo:" + stepTwo.getTitle());
//		try {
//			stepThree = stepTwo.saveAndContinue();
//		} catch (Exception e) {
//			System.out.println("this is exception " + e);
//			System.out.println("**********inside Catch 1******");
//		}
//
//		sleep(4);
//		System.out.println("Title of stepTwo:" + stepThree.getTitle());
//
//		try {
//			stepThree = stepTwo.saveAndContinue();
//		} catch (Exception e) {
//
//		}
//
//		sleep(5);
//
//		stepThree.marriedOrCivilUnion("yes");
//	}
//
//	// *******************StepThree Driver Page*******************
//
//	@DataProvider(name = "Test3")
//	public Object[][] testEventData3() {
//
//		Object[][] arrayObject = getExcelData(
//				"C:\\Users\\91950\\eclipse-workspace\\libertymutual\\resources\\repository\\Test1.xlsx",
//				"DriverDetails", 2, 6);
//
//		return arrayObject;
//	}
//
//	@Test(dataProvider = "Test3", priority = 3)
//	public void Test3(String maritalStatus, String gender, String age, String fullTimeBGrade, String phoneNo)
//
//	{
//
//		sleep(2);
//
//		stepThree.gender(gender);
//
//		// stepThree.licenseIssuedAtAge(age);
//
//		sleep(2);
//		stepThree.fullTimeStudentWithBAverage(fullTimeBGrade);
//		sleep(2);
//		stepThree.contactNo(phoneNo);
//		// sleep(2);
//
//		stepThree.saveAndContinue();
//
//		sleep(2);
//
//		stepFour = stepThree.saveAndContinue();
//
//		sleep(6);
//	}
//
//	// *******************StepFour Discount Page*******************
//	@DataProvider(name = "Test4")
//	public Object[][] testEventData4() {
//
//		Object[][] arrayObject = getExcelData(
//				"C:\\Users\\91950\\eclipse-workspace\\libertymutual\\resources\\repository\\Test1.xlsx", "Discount", 2,
//				10);
//		return arrayObject;
//	}
//
//	@Test(dataProvider = "Test4", priority = 4)
//	public void Test4(String havingPolicyWithLiberty, String otherPolicy, String employmentStatus, String education,
//			String home, String wantDiscount, String smartPhone, String wantToRecieveMsg, String phoneNo) {
//		stepFour.haveAnotherPolicyWithLiberty(havingPolicyWithLiberty);
//		if (havingPolicyWithLiberty.toLowerCase().equals("yes")) {
//			List<String> policies = Arrays.asList(otherPolicy.split(","));
//			System.out.println(policies);
//			stepFour.policiesYouHave(policies);
//			sleep(2);
//			stepFour.next();
//		}
//		sleep(2);
//		try {
//			stepFour.employmentStatus(employmentStatus);
//		} catch (Exception e) {
//
//		}
//
//		sleep(2);
//		stepFour.highestEducation(education);
//		sleep(2);
//
//		stepFour.ownHome(home);
//
//		sleep(2);
//
//		stepFour.saveAndContinue();
//
//		// sleep(5);
//
//		stepFour.wantToSave30percent(wantDiscount);
//		if (wantDiscount.toLowerCase().equals("yes")) {
//			if (!stepFour.checkBoxActive()) {
//				stepFour.selectCheckBox();
//
//			}
//			stepFour.saveAndContinue();
//			stepFour.smartPhoneSelection(smartPhone);
//			stepFour.wantToRecieveText(wantToRecieveMsg);
//			if (wantToRecieveMsg.toLowerCase().equals("yes")) {
//				stepFour.whatNumberShouldWeSendTextTo(phoneNo);
//
//			}
//		}
//		stepFive = stepFour.saveAndContinue();
//		if (wantDiscount.toLowerCase().equals("no"))
//			stepFive = stepFour.continueWithoutOffer();
//	}
//
//	// *******************StepFive CurrentInsurance*******************
//	@DataProvider(name = "Test5")
//	public Object[][] testEventData5() {
//
//		Object[][] arrayObject = getExcelData(
//				"C:\\Users\\91950\\eclipse-workspace\\libertymutual\\resources\\repository\\Test1.xlsx",
//				"CurrentInsurance", 2, 9);
//
//		return arrayObject;
//	}
//
//	@Test(dataProvider = "Test5", priority = 5)
//	public void Test5(String currentlyHaveInsurance, String firstInsurance, String injuryLimit, String reason,
//			String shareReason, String startDate) {
//		// *******************STEP FIVE*******************
//		sleep(5);
//
//		stepFive.currentlyHaveInsurance(currentlyHaveInsurance);
//		sleep(2);
//		if (currentlyHaveInsurance.toLowerCase().equals("yes")) {
//			stepFive.timeWithCurrentInsurer(firstInsurance);
//			stepFive.next();
//			stepFive.currentBodilyInjuryLimit(Integer.parseInt(injuryLimit));
//
//		} else {
//			stepFive.reasonForNotHavingInsurance(reason);
//			if (reason.toLowerCase().equals("other"))
//				stepFive.shareReason(shareReason);
//		}
//		// ****************************logic***************************
//		stepFive.policyStartDate(startDate);
//
//	}
//
//	// *******************StepSix Quote*******************
//
//	@Test(priority = 6)
//	public void Test6() {
//
//		Quote stepSix = stepFive.getEstimate();
//		sleep(10);
//		try {
//			stepSix.printConsole();
//		} catch (Exception e) {
//			stepSix.printConsole1();
//		}
//
//		try {
//			stepSix.saveToXls();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//		// sleep(10);
//		stepSix.closeAndFlushReport();
//	}
//}