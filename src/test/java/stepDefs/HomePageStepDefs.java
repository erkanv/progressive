package stepDefs;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePageStepDefs {

	private WebDriver driver = Driver.getDriver();
	HomePage hp = new HomePage();
	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

	@Given("the user is on the homepage of Progressive")
	public void the_user_is_on_the_homepage_of_Progressive() {
		driver.get(ConfigurationReader.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("the user verifies url and title while on the homepage.")
	public void the_user_verifies_url_and_title_while_on_the_homepage() {
		assertTrue(driver.getCurrentUrl().contains("https://www.progressive.com/"));
		assertTrue(driver.getTitle().contains("Progressive: Ranked"));

	}

	@When("the user clicks on the Auto button")
	public void the_user_clicks_on_the_Auto_button() {
		wait.until(ExpectedConditions.elementToBeClickable(hp.auto));
		hp.auto.sendKeys(Keys.ENTER);
	}

	@When("the user enters the zip code")
	public void the_user_enters_the_zip_code() {
		hp.zipCode.sendKeys("98037");
	}

	@When("the user clicks on the Quote Auto button")
	public void the_user_clicks_on_the_Quote_Auto_button() {
		wait.until(ExpectedConditions.elementToBeClickable(hp.QouteAuto));
		hp.QouteAuto.click();
	}

	@When("the user enters the first name")
	public void the_user_enters_the_first_name() {
		wait.until(ExpectedConditions.visibilityOf(hp.firstName));
		hp.firstName.sendKeys("John");
	}

	@When("the user enters the last name")
	public void the_user_enters_the_last_name() {
		hp.lastName.sendKeys("Smith");
	}

	@When("the user enters the address")
	public void the_user_enters_the_address() {
		hp.address.sendKeys("18110 Larch Way ");
	}

	@When("the user enters the city")
	public void the_user_enters_the_city() {
		hp.city.sendKeys("Lynnwood");
	}

	@When("the user enters the date of birth")
	public void the_user_enters_the_date_of_birth() {
		hp.dob.sendKeys("11/11/1981");
	}

	@When("the user clicks on the Okay, start my quote button")
	public void the_user_clicks_on_the_Okay_start_my_quote_button() {
		hp.startMyQuote.click();
	}

	@When("the user chooses the year of the vehicle")
	public void the_user_chooses_the_year_of_the_vehicle() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(hp.year));
		hp.year.click();
	}

	@When("the user chooses the make of the vehicle")
	public void the_user_chooses_the_make_of_the_vehicle() {
		wait.until(ExpectedConditions.elementToBeClickable(hp.make));
		hp.make.click();
	}

	@When("the user chooses the model of the vehicle")
	public void the_user_chooses_the_model_of_the_vehicle() {
		wait.until(ExpectedConditions.elementToBeClickable(hp.model));
		hp.model.click();
	}

	@When("the user selects body type")
	public void the_user_selects_body_type() {
		WebElement dd = driver.findElement(By.id("UnlistedVehicleFormModel_BodyStyle_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("4DR 4CYL");
	}

	@When("the user selects the purpose of use")
	public void the_user_selects_the_purpose_of_use() throws InterruptedException {
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.cssSelector("#UnlistedVehicleFormModel_VehicleUse_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Personal (to/from work or school, errands, pleasure)");
	}

	@When("user selects if the car is owned or leased")
	public void user_selects_if_the_car_is_owned_or_leased() throws InterruptedException {
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.xpath("//*[@id='UnlistedVehicleFormModel_OwnOrLease_Value']"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Own");
	}

	@When("the user selects for how lond the car has been owned")
	public void the_user_selects_for_how_lond_the_car_has_been_owned() throws InterruptedException {
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.id("UnlistedVehicleFormModel_LengthOfOwnership_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Less than 1 month");
	}

	@When("the user clicks on the Done button")
	public void the_user_clicks_on_the_Done_button() throws InterruptedException {
		Thread.sleep(2000);
		hp.done.click();
	}

	@When("the user clicks on the Save and Continue button")
	public void the_user_clicks_on_the_Save_and_Continue_button() throws InterruptedException {
		Thread.sleep(2500);
		hp.continueButton.click();
	}

	@When("the user chooses the gender")
	public void the_user_chooses_the_gender() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeSelected(hp.female));
		Thread.sleep(3000);
		hp.female.click();
	}

	@When("the user selects marital status")
	public void the_user_selects_marital_status() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("EditPniDetailsFormModel_DriverDetail_MaritalStatus_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Married");
	}

	@When("the user selects the highest level of education")
	public void the_user_selects_the_highest_level_of_education() throws InterruptedException {
		Thread.sleep(3000);
		WebElement dd = driver.findElement(By.id("EditPniDetailsFormModel_DriverDetail_HighestLevelOfEducation_Value"));
		Select dropdown = new Select(dd);
		// dropdown.selectByVisibleText("Bachelors or Associated degree");
		dropdown.selectByIndex(4);
	}

	@When("the user selects primary residence")
	public void the_user_selects_primary_residence() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("EditPniDetailsFormModel_DriverDetail_PrimaryResidence_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Own home");
	}

	@When("the user answers the question if s\\/he moved in two years")
	public void the_user_answers_the_question_if_s_he_moved_in_two_years() throws InterruptedException {
		Thread.sleep(3000);
		hp.move.click();
	}

	@When("the user selects the years licensed")
	public void the_user_selects_the_years_licensed() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("EditPniDetailsFormModel_DriverDetail_DriverYearsLicensed_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("3 years or more");
	}

	@When("the user answers the question if s\\/he was involved in an accident")
	public void the_user_answers_the_question_if_s_he_was_involved_in_an_accident() throws InterruptedException {
		Thread.sleep(3000);
		hp.accident.click();
	}

	@When("the user reports the violations and tickets")
	public void the_user_reports_the_violations_and_tickets() throws InterruptedException {
		Thread.sleep(3000);
		hp.ticket.click();
	}

	@When("the user enters his\\/her spouse's name")
	public void the_user_enters_his_her_spouse_s_name() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(hp.spouseFirstName));
		Thread.sleep(2500);
		hp.spouseFirstName.sendKeys("Sarah");
	}

	@When("the user chooses his\\/her spouse's gender")
	public void the_user_chooses_his_her_spouse_s_gender() throws InterruptedException {
		Thread.sleep(3000);
		hp.spouseGender.click();
	}

	@When("the user enters his\\/her spouse's date of birth")
	public void the_user_enters_his_her_spouse_s_date_of_birth() throws InterruptedException {
		Thread.sleep(1000);
		hp.spouseDOBMonth.sendKeys("11");
		Thread.sleep(1000);
		hp.spouseDOBDay.sendKeys("11");
		Thread.sleep(1000);
		hp.spouseDOBYear.sendKeys("1986");
	}

	@When("the user add his\\/her spouse to the policy")
	public void the_user_add_his_her_spouse_to_the_policy() throws InterruptedException {
		Thread.sleep(1000);
		hp.addSpouseToPolicy.click();
	}

	@When("the user selects his\\/her spouse's highest level of education")
	public void the_user_selects_his_her_spouse_s_highest_level_of_education() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("EditSpouseDetailsFormModel_DriverDetail_HighestLevelOfEducation_Value"));
		Select dropdown = new Select(dd);
//	dropdown.selectByVisibleText("Bachelors or Associated degree");
		dropdown.selectByIndex(4);
	}

	@When("the user selects his\\/her spouse's years licensed")
	public void the_user_selects_his_her_spouse_s_years_licensed() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("EditSpouseDetailsFormModel_DriverDetail_DriverYearsLicensed_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("3 years or more");
	}

	@When("the user answers the question if his\\/her spouse was involved in an accident")
	public void the_user_answers_the_question_if_his_her_spouse_was_involved_in_an_accident()
			throws InterruptedException {
		Thread.sleep(2500);
		hp.spouseAccident.click();
	}

	@When("the user reports his\\/her spouse's violations and tickets")
	public void the_user_reports_his_her_spouse_s_violations_and_tickets() throws InterruptedException {
		Thread.sleep(2500);
		hp.spouseTicket.click();
	}

	@When("the user selects if they have any insurance right now")
	public void the_user_selects_if_they_have_any_insurance_right_now() throws InterruptedException {
		Thread.sleep(2500);
		//wait.until(ExpectedConditions.elementToBeClickable(hp.currentInsurance));
		hp.currentInsurance.click();
	}

	@When("the user selects current's insurance longiness")
	public void the_user_selects_current_s_insurance_longiness() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("FinalDetailsFormModel_RecentAutoInsuranceCompanyPeriod_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("3 to 5 years");
	}
	

	@When("the user selects current bodily injury limits")
	public void the_user_selects_current_bodily_injury_limits() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("FinalDetailsFormModel_BodilyInjuryLimits_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("$50,000/$100,000");
	}
	
	

	@When("the user selects if they have any progressive non auto insurance right now")
	public void the_user_selects_if_they_have_any_progressive_non_auto_insurance_right_now() throws InterruptedException {
		Thread.sleep(1000);
		hp.priorNonAuto.click();
	}

	@When("the user selects if they had any progressive auto insurance in the last month")
	public void the_user_selects_if_they_had_any_progressive_auto_insurance_in_the_last_month() throws InterruptedException {
		Thread.sleep(1000);
		hp.priorAuto.click();
	}

	@When("the user enters policy starting date")
	public void the_user_enters_policy_starting_date() throws InterruptedException {
		Thread.sleep(1000);
		hp.policyStartMonth.sendKeys("05");
		Thread.sleep(1000);
		hp.policyStartDay.sendKeys("01");
		Thread.sleep(1000);
		hp.policyStartYear.sendKeys("2019");	
	}

	@When("the user enters e-mail addresses")
	public void the_user_enters_e_mail_addresses() {
		hp.email.sendKeys("ngvp@icloud.com");
	}

	@When("the user enters resident amount in their home")
	public void the_user_enters_resident_amount_in_their_home() throws InterruptedException {
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("FinalDetailsFormModel_TotalResidents_Value"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("3");
		
	}

	@When("the user reject the snapshot membership offer")
	public void the_user_reject_the_snapshot_membership_offer() throws InterruptedException {
		Thread.sleep(2500);
		//wait.until(ExpectedConditions.elementToBeClickable(hp.snapshot));
		hp.snapshot.click();
	}

	@When("the user reject the other policy offers")
	public void the_user_reject_the_other_policy_offers() throws InterruptedException {
		Thread.sleep(2500);
		hp.noThanks.click();
	}
	
	@When("the user refreshes the page")
	public void the_user_refreshes_the_page() {
		driver.navigate().refresh();
	}

	@Then("the user should see the options")
	public void the_user_should_see_the_options() throws InterruptedException {
		Thread.sleep(3000);		
		String url = "https://autoinsurance1.progressivedirect.com/0/UQA/Quote#/RatePackageDetails";	
		assertTrue(driver.getCurrentUrl().equalsIgnoreCase(url));
	}

}
