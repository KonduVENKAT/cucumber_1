Feature: Uber Car Booking 

Scenario: Booking a Cab

# for this feature there is no glue code is abailable how to implement Glue code for this feature 
#																		{ "String "} -- this is called Reguler Expression for feture file 
Given User wants book a car type like "Tufan" from uber app
When User selects a car "Tufan"  and pick up Location "Hyderabad" and drop Location "Bengalore"
Then Driver Strats the Journey
And Driver End the Journey
Then User pay 500 IND  

