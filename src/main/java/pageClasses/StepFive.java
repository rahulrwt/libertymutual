package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BaseClass;

public class StepFive extends BaseClass {
	public StepFive(WebDriver driver) {
		BaseClass.driver = driver;
	}

	@FindBy(xpath = "//*[@id=\"autoPolicyIndicator-radio\"]/div/div/label[1]/span")
	WebElement yes;
	
	@FindBy(xpath = "//*[@id=\"autoPolicyIndicator-radio\"]/div/div/label[2]/span")
	WebElement no;
	
	public void currentlyHaveInsurance(String ans)
	{
		if(ans.toLowerCase().equals("yes"))
		{
			yes.click();
		}
		else {
			no.click();
		}
	}
	
	//********************************functions for no option*************************
	
	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[1]/span/span[1]")
	WebElement expiredOrCanceled;
	
	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[2]/span/span[1]")
	WebElement newlyLicensed;
	
	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[3]/span/span[1]")
	WebElement CompanyCar;
	
	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[4]/span/span[1]")
	WebElement military;
	
	@FindBy(xpath = "//*[@id=\"currentInsuranceStatus-radio\"]/div/div/label[5]/span/span[1]")
	WebElement other;
	
	
	public void reasonForNotHavingInsurance(String reason) {
		if(reason.toLowerCase().equals("expiredOrCanceled"))
		{
			expiredOrCanceled.click();
		}
		else if(reason.toLowerCase().equals("newly licensed"))
		{
			newlyLicensed.click();
		}
		else if(reason.toLowerCase().equals("had company car"))
		{
			CompanyCar.click();
		}
		else if(reason.toLowerCase().equals("military"))
		{
			military.click();
		}
		else
		{
			other.click();
		}
	}
	
}
