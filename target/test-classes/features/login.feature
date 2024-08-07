Feature: Verify the Login Functionality
@SmokeTest
  Scenario: Verify that User is able to Login to the Application
    Given User is on the Login Page
    When User Enters the UserName and Password
    And  User click on Login button
    Then User see the homepage

@Regression
  Scenario: Verify that Application Logo Is displaying in Login Page
   Given User is on the Login Page
   Then User see the Application Logo
   
   