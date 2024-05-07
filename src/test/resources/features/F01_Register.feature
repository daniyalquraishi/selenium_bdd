Feature: User Registration

  Scenario Outline: Verify that user can register with valid data successfully
    Given user is in home page
    When user clicks on register button
    When user enters registration data with firstName as <firstName> and lastName as <lastName> and birthDay as <birthDay> and birthMonth as <birthMonth> and birthYear as <birthYear> and email as <email> and company as <company> and password as <password> and confirmedPassword as <confirmedPassword>
    And clicks on register button
#    Then user registration success message is displayed
    Examples:
      | firstName    | lastName | birthDay | birthMonth | birthYear | email              | company | password   | confirmedPassword |
      | "automation" | "tester" | "7"      | "1"        | "1989"    | "test@example.com" | "AMIT"  | "P@ssw0rd" | "P@ssw0rd"        |

