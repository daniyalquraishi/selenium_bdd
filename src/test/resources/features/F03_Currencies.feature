Feature: Currencies
  Scenario: Check Currencies changing
    Given user at home page
    When selects Euro currency
    Then verify that prices contain €
