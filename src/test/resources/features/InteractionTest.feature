@Regression
Feature: Execute the Web test cases of Interaction menu for jquery UI

  Background:
    Given user is on "https://jqueryui.com/" url

  Scenario: Verify Droppable from left menu under Interactions
    Given user selected 'Interactions' form left menu
    And user click on droppable under interaction from left menu
    When user drag 'Drag me to my target' component to 'drop here'
    Then component should place in inbox

 Scenario Outline: Verify Selectable from left menu under Interactions
    Given user click on selectable from left menu
    When user select the items "<select>" from table
    Then item "<select>" should get selected
   Examples:
   |select|
   |Item 1|
   |Item 3|
   |Item 7|
