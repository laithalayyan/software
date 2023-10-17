package car_accessories;

import static org.junit.Assert.assertTrue;

import car_accessories_checkout.Fruits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutSteps {
	
	public static int am;
	public Fruits f;
	
	@Given("I should have {int} NIS")
	public void i_should_have_nis(Integer amountOfMoney) {
		am=amountOfMoney;
	}

	@When("I choose one apple")
	public void i_choose_one_apple() {
	    f.checkout();
	}

	@Then("I should have zero {int}")
	public void i_should_have_zero(Integer int1) {
	    assertTrue(am==0);
	}

}
