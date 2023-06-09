Feature: Login with Valid Credentials

  @smoke
  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "https://tutorialsninja.com/demo/index.php?route=common/home"
    When User navigate to MyAccount menu
    And click on Login
    And Email "Rashmi.kolekar@citiustech.com" and password "Qafox"
    And Click on Login button
    Then User navigates to MyAccount Page

    @regression
   Scenario: Successful Login with Invalid Credentials
    Given User Launch browser
    And opens URL "https://tutorialsninja.com/demo/index.php?route=common/home"
    When User navigate to MyAccount menu
    And click on Login
    And Email "Rashmi.kolekar@citiustech.com" and password "Qafox"
    And Click on Login button
    Then User navigates to MyAccount Page