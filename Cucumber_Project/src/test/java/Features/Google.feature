Feature: Google Feature

Scenario: Google Search page with Selenium

Given I navigates to google url
Then I verifies google search page is displayed
When I enter "selenium" in search bar
Then I click on search button 


Scenario: Google Search page with Apple

Given I navigates to google url
Then I verifies google search page is displayed
When I enter "apple" in search bar
Then I click on search button 
