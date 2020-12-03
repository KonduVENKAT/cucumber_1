Feature: This is about select the different products from the Amezon Application

#Background below this is applicable for all all the scenarios 

Background: UserLogin with details

When open the browser And pass the URL of the application
Then For Login the application click on LogIn application
Then Enter User_Name and password
And click on LogIn button


@All
Scenario: Select the product_AppleMacBook
#Belosw this is for search for the product 
Then searech the product "Apple Mac Book" and price 80000


@Smoke
Scenario: Select the product_IPhone
#Belosw this is for search for the product 
Then searech the product "IPhone" and price 50000


@Sanity
Scenario: Select the product_honor4N
#Belosw this is for search for the product 
Then searech the product "honor4N" and price 10000


@Regression
Scenario: Select the product_honor4A
#Belosw this is for search for the product 
Then searech the product "honor4S" and price 9000