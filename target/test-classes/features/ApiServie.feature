@Regression
Feature: Execute the API test cases
  I want to execute and verify the response for API

  Background:
    Given The base uri is "https://reqres.in/api"

  Scenario: Verify get request users API
    When user inquires for page "2"
    Then status for the reponse should be "200"
    And first name for id "10" should be "Byron"

  Scenario: Verify the post request user API
    When user posts with name "Bryant" and job "BA"
    Then status code should be "201"
    And the id should be generated
    And verify schema with file "/Users/vinodvishwakarma/workspace/nag-assignment/naggarro-assignment/src/test/resources/com/user.json"
