package com.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmezonSearchDefintion {
// In this class I need to implement feature file things accordingly without any spelling mistakes 
// because feature file is case_Sensitive and and it can not understand which feature file you are writing this class 
// Better to execute on time feature file and copy and past over here 
// Feature file automatically generate default methods implementation for it's scenarios 
	

@When("open the browser And pass the URL of the application")
public void open_the_browser_and_pass_the_url_of_the_application() {
System.out.println("Step_1   - browser And Url of the apllication is opened ");
}

@Then("For Login the application click on LogIn application")
public void for_login_the_application_click_on_log_in_application() {
	System.out.println("Step_2   - for Login to the Amezon Application I have to click the login Link ");
}

@Then("Enter User_Name and password") // later on I will update this feature different different userName and their respective passwords
public void enter_user_name_and_password() {
	System.out.println("Step_3   - After getting the Amezon login page I have to pass the userName and password");
}

@Then("click on LogIn button")
public void click_on_log_in_button() {
	System.out.println("Step_4   - After entering the userName and Password clik on Login Button");
}

@Then("searech the product {string} and price {int}")
public void searech_the_product_and_price(String product_Name, Integer product_Price) {
	System.out.println("Step_5   - Search the product Name like "+product_Name+" And price of that product is ::"+product_Price+" IND");
}

	
}
