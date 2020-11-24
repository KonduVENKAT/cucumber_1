package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition001 {
	
	

@Given("I have  a search feild  on Amezon page")
public void i_have_a_search_feild_on_amezon_page() {
    // Write code here that turns the phrase above into concrete actions
	
	System.out.println("Step-1 - I'm in search page in Amezon page");
    //throw new io.cucumber.java.PendingException();
}

@When("I search for a product  with name {string} and price {int}")
public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
    // Write code here that turns the phrase above into concrete actions

	System.out.println("Step -2 -Search the product name "+"-"+productName+" And Price : "+price);
	//throw new io.cucumber.java.PendingException();
}

@Then("Prodect with name {string} should be displayed")
public void prodect_with_name_should_be_displayed(String productName) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step-3 - product :"+productName+ " is displayed");
    //throw new io.cucumber.java.PendingException();
}
	
	

}
