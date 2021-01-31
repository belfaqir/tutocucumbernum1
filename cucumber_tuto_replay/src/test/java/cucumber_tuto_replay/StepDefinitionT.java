package cucumber_tuto_replay;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionT {

	@Given("i stil in life and have {string}")
	public void i_stil_in_life_and_have(String emotion) {
	   System.out.println(" i stil in life and have "+ emotion + " - - - - -");
	}


	@When("I do have problems")
	public void i_do_have_problems() {
	System.out.println(" when I do have problems ");
	}
	
	@Then("I will be {string} in step")
	public void i_will_be_in_step(String reaction) {
		System.out.println(" then i will be "+ reaction + " - - - - -");
	}




}
