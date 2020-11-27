
# How to pass the values form this feature file to glue code how it is possible 

#String carType="Tufan";
#String picUpLocation="Hyderabad";
#String dropLocation="Banglore"
#int rootCost=1000;


Feature: Uber Car Booking 

Scenario: Booking a Cab

# for this feature there is no glue code is abailable how to implement Glue code for this feature 
#																		{ "String "} -- this is called Reguler Expression for feture file 
Given User wants book a car type like "+carType+" from uber app #How to pass the values form this place to glue code How 
When User selects a car "+carType+"  and pick up Location "pikUpLocation" and drop Location "+dropLocation+"
Then Driver Starts the Journey from "+pikUpLocation+"
And Driver End the Journey At "+dropLocation+"
Then User pay "+rootCost+" IND  

