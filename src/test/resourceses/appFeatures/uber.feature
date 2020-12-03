
# How to pass the values form this feature file to glue code how it is possible 

#String carType="Tufan";
#String picUpLocation="Hyderabad";
#String dropLocation="Banglore"
#int rootCost=1000;


Feature: Uber Car Booking 

Scenario: Booking a CAB_carType_Cab

# for this feature there is no glue code is abailable how to implement Glue code for this feature 
#																		{ "String "} -- this is called Reguler Expression for feture file 
Given User wants book a car type like "+carType+" from uber app #How to pass the values form this place to glue code How 
When User selects a car "+carType+"  and pick up Location "pikUpLocation" and drop Location "+dropLocation+"
Then Driver Starts the Journey from "+pikUpLocation+"
And Driver End the Journey At "+dropLocation+"
Then User pay "+rootCost+" IND  


Scenario: Booking a CAB_carType_Tofan

Given User wants book a car type like "Tufan" from uber app 
When User selects a car "Tufan"  and pick up Location "Hyderabad" and drop Location "Benglore"
Then Driver Starts the Journey from "Hyderabad"
And Driver End the Journey At "Banglore"
Then User pay 5000 IND  


#@smoke
Scenario: Booking a CAB_carType_SVU

Given User wants book a car type like "SVU+" from uber app 
When User selects a car "SVU"  and pick up Location "Banglore" and drop Location "Mumbai"
Then Driver Starts the Journey from "Banglore"
And Driver End the Journey At "Mumbia"
Then User pay "7000" IND  

@Regresion
Scenario: Booking a CAB_carType_Safary

Given User wants book a car type like "Safari" from uber app 
When User selects a car "Safari"  and pick up Location "Mumbai" and drop Location "Pune"
Then Driver Starts the Journey from "Mumbai"
And Driver End the Journey At "Pune"
Then User pay 1000 IND  

@Sanity
Scenario: Booking a CAB_carType_Swift

Given User wants book a car type like "Swift" from uber app 
When User selects a car "Swift"  and pick up Location "Pune" and drop Location "Hyderabad"
Then Driver Starts the Journey from "Pune"
And Driver End the Journey At "Hyderabad"
Then User pay 2100 IND  
