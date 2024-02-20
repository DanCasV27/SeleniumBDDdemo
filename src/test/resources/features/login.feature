Feature: Login Functionality
  I want to be able to login successfully into the saucelabs application


  Scenario: Successfull login
    Given User navigates to the saucelabs page
    When User enters valid username and password
    And User clicks on Login button
    Then User gets redirected to marketplace
  

