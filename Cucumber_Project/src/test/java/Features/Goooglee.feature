Feature: Google Feature

Background:
Given I navigates to google url
Then I verifies google search page is displayed


Scenario Outline: Google Search page with "<SearchText>"

When I enter "<SearchText>" in search bar
Then I click on search button 

Examples:
|SearchText|
|Selenium|
|Java|
|Apple|
