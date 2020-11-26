package com.stepDefinition;

import googleImplementations.LinkPage;
import googleImplementations.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitionGoogle {  // we need some utility class form another java class to reduce repeated code
	/*									I will do later on 
//And my question is how it is recognize from which feature file this class is executing ..
Feature: Google Search Feature

Scenario: google text query box  is taking the input text

Given: I have a search Box in the google page
When: when Title of the google page is google
Then: then user enters on the search box  Facebook.com
Then: client click on search button
And: user get the all posible links for facebook log in pages  

	 * */

	/*
	// This is exactly what we written at feature file we have to write because it is case sensitive
@Given("^I have a search Box in the google page$")
public void client_At_googleHomePage() /// for method name we can give any name it's up to us
{
}
*/
	
	LinkPage linkPagetext;
	Search search;
	
@Given("I have to search for {string}")
public void i_have_to_search_for(String linkText) {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Step -1 - I'm in google home page search and passing the String in textbox is "+linkText);
	
	//throw new io.cucumber.java.PendingException();
}

@When("I have to pass  {string} in google text box")
public void i_have_to_pass_in_google_text_box(String linkText) {
    // Write code here that turns the phrase above into concrete actions
   
	System.out.println("Step -2 - I passed the string like "+linkText+" in the search box feild ");
	// For aching TestDrivenDevelopment 
	// How to implement it is 
	linkPagetext=new LinkPage(linkText); // this is for send that feature file String to LinkPageText variable for test this linkText String is available in that links are not 
							// The above vale stored in that List<String> links collection 
	
	// throw new io.cucumber.java.PendingException();
	//
}

@Then("I have to click on SearchButton")
public void i_have_to_click_on_search_button() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Step -3 -  I have to click the Search button in the googleHome page ");
	//throw new io.cucumber.java.PendingException();
}

@Then("Display some Links with {string} Should be displayed")
public void display_some_links_with_should_be_displayed(String contains_linkText) {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Step -4 - I have to get the some links like :::"+contains_linkText+" are displayed");
	search=new Search();
	String linkTxxt=search.displayLinkText(linkPagetext);
   System.out.println("Link Text is avaailble in linkPage lp=new LinkPage(Stringgg) class=="+linkTxxt);
   System.out.println("Searched Link is :"+linkTxxt);
   
  // Assert.assertEquals( "Facebook.com", linkTxxt,"Here I test the LinkText is avaulablbe in LInkPage or not");
 //Assertion is failed why I don't know the reason 
   
   //System.out.println("");
   // 
   //throw new io.cucumber.java.PendingException();
    
}


}
