Feature: user login
  Background:
    Given user in home page
  Scenario: user can login with valid email and password
    When user clicks on login
    And user enters valid email
    And user enters password
    And user clicks on login button
    Then user login successfully
  Scenario: user cannot login with invalid email and password
    When user clicks on logout
    And user clicks on login
    And user enters invalid email
    And user enters password
    And user clicks on login button
    Then user login unsuccessfully