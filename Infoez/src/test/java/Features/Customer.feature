@Customerpanel
Feature: Infoez Customer Module

Background:
Given User launches the browser
When User open the Infoez application
And User clicks on sign in button

@Login
Scenario Outline: To verify the valid and invalid customer login functionality

#Given User open the Infoez application 
When the user enters username "<Email>"
And The user enter password "<Password>"
And user clicks on signin 
Then the user redirected to the home page "<Results>"
Examples:
|Email              |Password    |Results |
|info@gmail         |g@123       |Invalid1|
|customer@gmail     |12345       |Invalid2|
|                   |qwert       |Invalid3|
|asdfgg             |zxcvvb      |Invalid4|
|@#$$%^^            |            |Invalid5|
|customer@infoez.com|Customer@123|Valid   |

@Menu
Scenario: Verify home page menu navigation
Given User is on home page 
When User clicks on explore 
And User clicks near me 
And User clicks Howitworks 
And User clicks pricing 

@Explore
Scenario Outline: Verify search functionality
Given User is on explore page 
When user enters business name "<Businessname>" in search field 
And User enters city "<City>" in city field 
And User clicks on search button 
Then Relevent businesses should be displayed 
Examples:
|Businessname    |City      |
|Mira studio     |Chennai   |
|@#$WER          |wertyu    |
|                |Chennai   |
|Aroma cafe      |          |











