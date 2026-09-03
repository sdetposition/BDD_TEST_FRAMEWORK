package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard {
	
	@Given("Login in as a User")
	public void login_in_as_a_User() {
		System.out.println("Given -- User logged in successfully.");
	
	}
	
	@When("Enter Valid Credentials with succesful login")
	public void enter_Valid_Credentials_with_succesful_login() {
		System.out.println("When -- Enter Valid Credentials with succesful login -- Dahsboard Page");
	}
	
	@Then("Validate the Dashboard Page with {string}")
	public void validate_the_Dashboard_Page(String expecetd) {
		System.out.println("Then -- Validate the Dashboard Page -- Dashboard Page"+expecetd);
	
		String obj = new String("CME");
		System.out.println(obj);
		obj = obj.concat(" Group");
		System.out.println(obj);
		
		String test = "Chadnra";
		if(test.contains("Chadnra")) {
			test = "Narayana";
		} else {
			System.out.println("No Exception");
		}
		
		
	}
}
