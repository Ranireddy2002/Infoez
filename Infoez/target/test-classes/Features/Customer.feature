@Customerpanel
Feature: Infoez Customer Module

Scenario: Customer Login Page
Given User launches the browser
When User open the Infoez application
And User Enters Customer Email and password
And User clicks on sign in button
Then Customer should login successully

Scenario: Verify Home Page
Given Customer is logged in
Then Customer home page should be displayed

Scenario: Veriy home page bussiness search
Given Customer is on home page
When Customer enters business name in search field
And Customer enters city name in search field
And Customer clicks on search button
Then Relavant Businesses listings should be displayed

Scenario: Veriy business categories
Given Customer is on home page
When Customer views business categories
Then Business listings should be displayed

Scenario: Veriy featured these week businesses
Given Customer is on home page
When Customer views featured businesses
Then Featured businesses should be displayed

Scenario: Verify Toprated near you 
Given Customer is on home page 
When Customer views toprated near you businesses
Then Toprated near you businesses should be displayed

Scenario: Verify Recently added
Given Customer is on home page
When Customer views recently added businesses
Then Recently added businesses should be displayed

#Scenario: Verify add your business in home page
#Given Customer is on home page
#When Customer clicks add your business
#Then add your business page should be displayed

Scenario: Verify see pricing in home page
Given Customer is on home page
When Customer clicks see pricing
Then Pricing page should be displayed 

Scenario: Verify footer link section
Given Customer is on home page
When Customer scroll  to the footer section
Then Footer section should be displayed 

Scenario: Verify all businesess footer link
Given Customer is on home page
When Customer clicks on all businesses footer link
Then All businesses should be displayed 

Scenario: Verify featured footer link
Given Customer is on home page
When Customer clicks on featured footer link
Then featured businesses should be displayed 

Scenario: Verify top rated footer link
Given Customer is on home page
When Customer clicks on top rated footer link
Then Top rated businesses should be displayed 

#Scenario: Verify add your business footer link
#Given Customer is on home page
#When Customer clicks on add your business footer link
#Then Add your business page should be displayed

Scenario: Verify pricing plans footer link
Given Customer is on home page
When Customer clicks on pricing plan footer link
Then Pricing plan page should be displayed 

#Scenario: Verify How claims works footer link
#Given Customer is on home page
#When Customer clicks on How claims works footer link
#Then How claims works page should be displayed 

Scenario: Verify How it works footer link
Given Customer is on home page
When Customer clicks on How it works footer link
Then How it works page should be displayed

Scenario: Verify pricing footer link
Given Customer is on home page
When Customer clicks on pricing footer link
Then Pricing page should be displayed

#Scenario: Verify contact footer link 
#Given Customer is on home page
#When Customer clicks on contact footer link
#Then Contact details should be displayed

Scenario: Verify explore page
When Customer clicks on explore
Then Explore page should be displayed
And explore business listings should be displayed

Scenario: Search Businesses
When Customer enters business name
And Customer enters city name
And Customer clicks on explore search button
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
Given User launches the browser
When User open the Infoez application
And  Customer clicks on near me
Then Near me page should be displayed 
And Search near by field should be displayed
And Near me Category dropdown should be displayed
And Distance dropdown should be displayed
And Apply button should be displayed
And Use my location button should be displayed 
And Business results should be displayed

Scenario: Search nearby businesses
When Customer enters a business name in search nearby field
Then Matching nearby businesses should be displayed

Scenario: Filter businesses by category
#Given User launches the browser
#When User open the Infoez application
When  Customer clicks on near me
And  Customer selects a category from category dropdown
And Customer clicks apply button
Then Businesses matching the selected category should be displayed

Scenario: Filter businesses by distance
#Given User launches the browser
#When User open the Infoez application
When Customer selects a distance from distance dropdown
And Customer clicks apply button
Then Businesses within the selected distance should be displayed

#Scenario:  Apply filters
#When Customer selects a category
#And Customer selects a distance
#And Customer clicks apply button
#Then Results should be filtered based on selected criteria

Scenario: Use my location
When Customer clicks Use my location button
Then Browser should request location permission
And Nearby businesses should be displayed based on current location
