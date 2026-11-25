@Customerpanel

Feature: Infoez Customer Module
Background:
Given User launches the browser
When User open the Infoez application
And User clicks on sign in button
And user clicks on signin

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
Scenario: Verify explore page
Given User launches the browser
When User clicks on explore
Then Explore page should be displayed 

Scenario Outline: Verify search functionality
Given User is clicks the explore page  
When user enters "<Businessname>" in search field 
And User enters "<City>" in city field 
And User clicks on search button 
Then Search results should be "<Results>" for "<Businessname>" 
Examples:
|Businessname    |City      |Results |
|Aroma cafe      |Banglore  |Valid   |
|Mira studio     |Chennai   |Valid   |
|                |Hyderabad |Valid   |
|A2B             |          |Valid   |
|@#$WER          |wertyu    |Invalid |

Scenario: Verify filter section 
Given User is clicks the explore page 
When User selects a category from the category dropdown 
And User selects a sorting option from the sort by dropdown 
And User selects a minimium rating from the min rating dropdown 
And user selects the verified only checkbox 
Then The business listings should be displayed based on the selected filter criteria 

 @Nearme
 
 Scenario: Verify nearme page
 Given User clicks near me
 Then Nearme page should displayed 
 And Search nearby field should be displayed 
 And All categories dropdown should displayed 
 And Within km dropdown should be displayed 
 And Apply button should be displayed 
 And Use my location button should be displayed 
 
 @Howitworks 
 Scenario: Verify How it works page
 Given User clicks on how it works 
 Then How it works page should be dispalyed 
 And Serch verified locals should be displayed 
 And Trust the badge should be displayed 
 And Send enquiries should be displayed 
 And Rate and review should be displayed 
 And Start exploring button should be displayed 
 When user clicks on start exploring 
 Then Explore page should be displayed
 When User navigates back to how it works page 
 And list your business button should be displayed 
 When User clicks on list your business 
 Then list your business page should be displayed 
 
@Pricing
Scenario: verify pricing page 
Given user clciks on pricing 
Then Pricing page should be displayed 
And Free plan should be displayed 
And Starter plan should be displayed 
And Pro plan should be displayed 
And Enterprise plan should be displayed 

@Customerprofile 
Scenario: Verify  profile 
#Given User is on home page
When User clicks on customer profile 
Then Profile should be displayed 
And Favorite should be displayed 
And My reviews should be displayed 
And My enquiries should be displayed 
And Notifications should be displayed 
And Subscription should be displayed 
And Logout should be displayed 

@Profile
Scenario Outline: To verify profile functionality
Given User is on home page
When User clicks on customer profile
Then User should navigate to profile page 
And User should verify email 
And User should verify role 
And User enters "<Name>" in name field 
And User enters "<Phone>" in phone field 
And User enters "<AvatarURL>" in avatar URL field 
When user clicks on save changes button 
Then User should verify profile details are updated successfully 

Examples:
|Name           |Phone      |AvatarURL   |
|Roopa          |9876543210 |qwertyui    |
|               |234567899  |            |
|zxcv           |           |            |
|               |           | //https.gwd|
|               |           |            |

@Favorites
Scenario: Verify favorite page functionality
Given User is on home page
When User clicks on customer profile
And User clicks on favorites 
Then Favorite page should be displayed 
When User clicks on favorite icon 
Then "Removed from Favorites" message should be displayed 

@Myreviews
Scenario: Verify my reviews page functionality 
Given User is on home page
When User clicks on customer profile
And User clicks on my reviews 
Then My reviews page should be displayed 
And Useres submitted reviews should be displayed 
When User clicks on delete icon 
Then "Review deleted successfully" message should displayed




















