package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import testBase.TestBase;

public class HomePageStepDefinition extends TestBase{
	
	public TestBase testBase;
	public HomePage homePage = new HomePage();
	
	public static HomePageStepDefinition homePageStepDefinition;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.initialization();
		
	}
	
	@When("^user logins to the application$")
	public void user_logins_to_the_application() throws Throwable {
		homePage.userLogin("userName", "password");
	}
	
	@When("^user can directly checks flight details$")
	public void user_can_directly_checks_flight_details() throws Throwable {
		
	}
	
	@Then("^user clicks on Return,OnWay , MultiCity option$")
	public void user_clicks_on_Return_OnWay_MultiCity_option() throws Throwable {
	    
	}
	
	@Then("^user enters fromCity and toCity$")
	public void user_enters_fromCity_and_toCity() throws Throwable {
		homePageStepDefinition=new HomePageStepDefinition();
		
	
		homePage.departureCity();
		homePage.destinationCity();
	}
	
	@Then("^user enters departDate and ReturnDate$")
	public void user_enters_departDate_and_ReturnDate() throws Throwable {
	   
	}
	
	@Then("^user enters number of passengrs$")
	public void user_enters_number_of_passengrs() throws Throwable {
		homePage.passengerList();
		
	}
	
	@Then("^user enters cash mode$")
	public void user_enters_cash_mode() throws Throwable {
		homePage.clickOnCash();
	}
	
	@Then("^user clicks on search flight button$")
	public void user_clicks_on_search_flight_button() throws Throwable {
		homePage.clickOnFlightBtn();
	}


}
