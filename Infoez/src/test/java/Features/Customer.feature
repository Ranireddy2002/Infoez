@Customerpanel
Feature: Infoez Customer Module

Background:
Given User launches the browser
When User open the Infoez application
And User clicks on sign in button

@Login
Scenario Outline: Customer Login Page
And User Enters Customer "<Email>" and "<Password>"
And User clicks on sign 
Then Customer login status should be "<Results>"
Examples:
|Email              |Password    |Results |
|info@gmail         |g@123       |Invalid1|
|customer@gmail     |12345       |Invalid2|
|                   |qwert       |Invalid3|
|asdfgg             |zxcvvb      |Invalid4|
|@#$$%^^            |            |Invalid5|
|customer@infoez.com|Customer@123|Valid   |

Scenario: Verify Home Page
Given Customer is logged in
Then Customer home page should be displayed

Scenario: Verify explore page
When Customer clicks on explore
Then Explore page should be displayed
And Business listings should be displayed

Scenario: Search Businesses
When Customer enters business name
And Customer enters city name
And Customer clicks on search button
Then Matching business results should be displayed

Scenario: Verify filter section
Given Customer is on Explore page 
Then Filter section should be displayed
And Category dropdown should be displayed
And Sort by dropdown should be displayed
And Min rating dropdown should be displayed
And Verified only checkbox should be displayed

Scenario: Filter Businesses by category
Given Customer is on explore page
When Customer selects a category
Then Businesses related to selected category should be displayed

Scenario: Sort By Businesses
Given Customer is on explore page
When Customer selects a sorting option
Then Businesses should be sorted accordinng to the selected option

Scenario: Filter businesses by Min Rating
Given Customer is on explore page
When Customer selects a min rating
Then Businesses matching the selected rating should be displayed

Scenario: Filter Verified Businesses 
Given Customer is on explore page
When Customer selects verified only checkbox
Then Only verified businesses should be displayed

Scenario: Verify Near me page
Then Near me page should be displayed 
And Search near by field should be displayed
And Category dropdown should be displayed
And Distance dropdown should be displayed
And Apply button should be displayed
And Use my location button should be displayed 
And Business results should be displayed

Scenario: Search nearby businesses
When Customer enters a business name in search nearby field
Then Matching nearby businesses should be displayed














