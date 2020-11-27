package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion_UberBookingCar {

@Given("User wants book a car type like {string} from uber app")
public void user_wants_book_a_car_type_like_from_uber_app(String carType) {
	System.out.println("Step -1 - User wants a book a car form This Uber App And car Type : "+carType);
}

@When("User selects a car {string}  and pick up Location {string} and drop Location {string}")
public void user_selects_a_car_and_pick_up_location_and_drop_location(String carType, String pic_Location, String drop_Location) {
	System.out.println("Step -2 - user Selects a picup Location  :\'"+carType+"\' And Puk Up Loaction \'"+pic_Location+"\' And Drop Location \'"+drop_Location+"\' ");
}

@Then("Driver Strats the Journey")
public void driver_strats_the_journey() {
	System.out.println("Step -3 - Driver Starts the Journey From :pikUpLoaction");
}

@Then("Driver End the Journey")
public void driver_end_the_journey() {
	System.out.println("Step -2 - Driver Ends the Journey At : DropLocation");
}

@Then("User pay {int} IND")
public void user_pay_ind(Integer rootCost) {
	System.out.println("Step -2 - User Pay the payment in Indian Rupies Rs :"+rootCost+"Rs\\-");
}


}
