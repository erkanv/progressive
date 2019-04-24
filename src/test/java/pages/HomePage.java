package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;

public class HomePage {
	private WebDriver driver;
	
	public HomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id='UnlistedVehicleFormModel_OwnOrLease_Value']")
	public WebElement dd; 
	
	
	@FindBy(xpath = "//a[@aria-label='Auto insurance']")
	public WebElement auto; 
	
	@FindBy(id="zipCode_ueno")
	public WebElement zipCode;
	
	@FindBy(id="qsButton_ueno")
	public WebElement QouteAuto;
	
	@FindBy(id="NameAndAddressFormModel_FirstName_Value")
	public WebElement firstName;
	
	@FindBy(id="NameAndAddressFormModel_LastName_Value")
	public WebElement lastName;
	
	@FindBy(id="NameAndAddressFormModel_DateOfBirth_Value")
	public WebElement dob;
	
	@FindBy(id="NameAndAddressFormModel_MailingAddress_Value")
	public WebElement address;
	
	@FindBy(id="NameAndAddressFormModel_City_Value")
	public WebElement city;
	
	@FindBy(xpath ="//input[@class='continue-button submit-button next-link  submit-button next-link ']")
	public WebElement startMyQuote;
	
	@FindBy(xpath ="//*[@id='UnlistedVehicleFormModel_Year_Value']/li[7]")
	public WebElement year;
	
	@FindBy(xpath ="//*[@id='UnlistedVehicleFormModel_Make_Value']/li[34]")
	public WebElement make;
	
	@FindBy(xpath ="//*[@id='UnlistedVehicleFormModel_Model_Value']/li[4]")
	public WebElement model;
	
	@FindBy(xpath ="//input[@class='submit-button next-link']")
	public WebElement done;
	
	@FindBy(xpath ="//*[@id='next']")
	public WebElement continueButton;
	
	@FindBy(id="EditPniDetailsFormModel_DriverDetail_Gender_Value_F")
	public WebElement female;
	
	@FindBy(id="EditPniDetailsFormModel_DriverDetail_HasPriorAddress_Value_N")
	public WebElement move;
	
	@FindBy(id="EditPniDetailsFormModel_DriverDetail_HasAccidentsOrClaims_Value_N")
	public WebElement accident;
	
	@FindBy(id="EditPniDetailsFormModel_DriverDetail_HasTicketsOrViolations_Value_N")
	public WebElement ticket;
	
	@FindBy(id="EditSpouseDetailsFormModel_DriverDetail_FirstName_Value")
	public WebElement spouseFirstName;
	            	
	@FindBy(id="EditSpouseDetailsFormModel_DriverDetail_Gender_Value_F")
	public WebElement spouseGender;
	
	@FindBy(id="EditSpouseDetailsFormModel_DriverDetail_DateOfBirth_Month")
	public WebElement spouseDOBMonth;
	
	@FindBy(id="EditSpouseDetailsFormModel_DriverDetail_DateOfBirth_Day")
	public WebElement spouseDOBDay;
	
	@FindBy(id="EditSpouseDetailsFormModel_DriverDetail_DateOfBirth_Year")
	public WebElement spouseDOBYear;
	
	@FindBy(id="EditSpouseDetailsFormModel_DriverDetail_DriverIncluded_Value_Y")
	public WebElement addSpouseToPolicy;
	
	@FindBy(id="EditSpouseDetailsFormModel_DriverDetail_HasAccidentsOrClaims_Value_N")
	public WebElement spouseAccident;
	
	@FindBy(id="EditSpouseDetailsFormModel_DriverDetail_HasTicketsOrViolations_Value_N")
	public WebElement spouseTicket;
	
	@FindBy(xpath = "//input[@id='FinalDetailsFormModel_InsuranceToday_Value_Y']")
	public WebElement currentInsurance;
	
	@FindBy(id="FinalDetailsFormModel_OtherPolicies_Value_N")
	public WebElement priorNonAuto;
	
	@FindBy(id="FinalDetailsFormModel_PriorProgressive_Value_N")
	public WebElement priorAuto;
	
	@FindBy(id="FinalDetailsFormModel_AdvancedShopperPolicyEffectiveDate_Month")
	public WebElement policyStartMonth;
	
	@FindBy(id="FinalDetailsFormModel_AdvancedShopperPolicyEffectiveDate_Day")
	public WebElement policyStartDay;
	
	@FindBy(id="FinalDetailsFormModel_AdvancedShopperPolicyEffectiveDate_Year")
	public WebElement policyStartYear;
	
	@FindBy(id="FinalDetailsFormModel_PrimaryEmailAddress_Value")
	public WebElement email;
	
	@FindBy(id="SnapshotFormModel_SnapshotEnrollments_0__Value_N")
	public WebElement snapshot;
	
	@FindBy(id="no-thanks-link")
	public WebElement noThanks;
	
	@FindBy(xpath="(//div[@class='text'])[1]")
	public WebElement result;
	
	
	public void selectOption(String opt, String elementRef) {	
		
		switch (elementRef) {
		case opt:
			Select dropdown = new Select(dd);
			dropdown.selectByVisibleText(opt);
			break;

		default:
			break;
		}
		
		
	}
	
	
	
	
}
