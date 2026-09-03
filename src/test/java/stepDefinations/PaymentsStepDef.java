package stepDefinations;

import io.cucumber.java.en.Then;

public class PaymentsStepDef {	
	
	@Then("Validate the Payments Page")
	public void validate_the_Payments_Page() {
		System.out.println("Then -- Validate the Payments Page -- Payments Page");
	}

}
