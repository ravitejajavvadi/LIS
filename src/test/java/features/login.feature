Feature: Verify the Login Functionality

  Scenario: Verify that User is able to Login to the Application with Valid credentials
    Given User is on the Login Page
    When User Enters the UserName "raviteja1994" and Password"Abc@12345"
    And  User click on Login button
    Then User see the homepage


  Scenario: Verify that Application Logo Is displaying in Login Page
   Given User is on the Login Page
   Then User see the Application Logo
   
   
  Scenario: Verify Application title 
   Given User is on the Login Page
   Then User see the titele of the Loginpage
   
  Scenario: Verify that Application Login URL 
   Given User is on the Login Page 
   Then User see the Application launching URL
   
   Scenario Outline: Verify Login functionality with invalid credentials
    Given User is on the Login Page
    When User Enters the UserName <Username> and Password<password>
    And  User click on Login button
    Then User see the homepage
    
    Examples:
    |Username     |password |   
    |raviteja1994 |pwd12    |
    |admin34      |Abc@12345|
    |admin34      |pwd12    |
   
   
   
  
   
   