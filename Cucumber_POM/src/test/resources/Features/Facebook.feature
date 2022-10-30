Feature: To launch Facebook

Scenario: Launching FB

Given the user launches facebook
Then the user verifies facebook title
And the user enters "username" in username field
And the user enters "password" in password field
And the user clicks on createnew button
Then the user enters "tom" in firstname field
And the user enters "jerry" in lastname field