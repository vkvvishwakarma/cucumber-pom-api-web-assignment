Feature: Execute the Web test cases of Widget menu for jquery UI

  Background:
    Given user is on "https://jqueryui.com/" url

  Scenario: Verify control group and perform actions on widget menu from left menu
    Given user navigate to Control group link from left menu
    When user on control page frame for horizontal care rental options
    Then user can select "SUV" from drop down
    And user can select "Automatic" radio button
    And user can select the "insurance" check box
    And user can give the number "2" for car input
    When user on vertical car rental menu options
    Then user can select "Truck" option from select menu
    And user should be able to select "standard" radio button
    And user can check "insurance" checkbox
    And user can put the "1" number of cars
