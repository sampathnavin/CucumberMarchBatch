package Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	LoginWebElements lw ;
	
	@Given("A user tries to launch the browser")
	public void a_user_tries_to_launch_the_browser() {
		
		LoginWebElements.browserSetup();
		
	}
	    

	@When("Validate whether user can able to open URL")
	public void validate_whether_user_can_able_to_open_url() {
		
		LoginWebElements.puturl();
	   
	}

	@Then("Validate whether user can enter valid username and password")
	public void validate_whether_user_can_enter_valid_username_and_password() {
		lw = new LoginWebElements();
		
		lw.validcredentials();
	    
	}

	@Then("User tries to login by clicking the login button")
	public void user_tries_to_login_by_clicking_the_login_button() {
		
		lw.loginclick();
	   
	}

	@Then("Validate whether user can able to Login Successfully")
	public void validate_whether_user_can_able_to_login_successfully() {
		
		lw.checkingstatus();
	   
	}

	@Then("After Successfull validation close the browser")
	public void after_successfull_validation_close_the_browser() {
		
		lw.teardown();
	   
		
	}


}
