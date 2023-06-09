Feature: Title of your feature

  Scenario Outline: Login Data Driven
    Given User Launch browser
    And opens URL "https://tutorialsninja.com/demo/"
    When User navigate to MyAccount menu
    And click on Login
    And Email "<email>" and password "<password>"
    And Click on Login button
    Then User navigates to MyAccount Page

    Examples: 
      | email                         | password |
      | Rashmi.kolekar@citiustech.com | Qafox    |
      | demo1.nilesh@gmail.com        | demo@123 |
