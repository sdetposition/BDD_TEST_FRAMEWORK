package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentsStepDef {
	
	
	@Then("Validate the Payments Page")
	public void validate_the_Payments_Page() {
		System.out.println("Then -- Validate the Payments Page -- Payments Page");
	}

}
