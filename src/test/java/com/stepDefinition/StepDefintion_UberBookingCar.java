package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion_UberBookingCar {
	@Given("User wants book a car type like {string} from uber app #How to pass the values form this place to glue code How")
	public void user_wants_book_a_car_type_like_from_uber_app_how_to_pass_the_values_form_this_place_to_glue_code_how(String carType) {
	  System.out.println("Step - 1 : "+carType);
	}

	@When("User selects a car {string}  and pick up Location {string} and drop Location {string}")
	public void user_selects_a_car_and_pick_up_location_and_drop_location(String carType, String picLocation, String dropLocation) {
	    System.out.println("Step -2 - CarType :\'"+carType+"\' pikUp Location From :\'"+picLocation+"\' And Drop Location At :\'"+dropLocation+"\'");
	}

	@Then("Driver Starts the Journey from {string}")
	public void driver_st_nrats_the_journey_from(String picLocation) {
	    System.out.println("Step -3 - Driver Starts Journey At :\'"+picLocation+"\'");
	}

	@Then("Driver End the Journey At {string}")
	public void driver_end_the_journey_at(String dropJourney) {
	    System.out.println("Step -4 - Driver Ends the Journey At :\'"+dropJourney+"\'");
	}

	@Then("User pay {string} IND")
	public void user_pay_ind(String rootCost) {
		System.out.println("Step -5 - User pay the Amout to the Application : \'"+rootCost+"\'");
	}

}
