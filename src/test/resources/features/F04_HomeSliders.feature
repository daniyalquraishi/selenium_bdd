Feature: Home sliders
  Background:
    Given user on home page

  Scenario: first slider is clickable on home page
    When user click on first slider
    Then direct user to new url
  Scenario: second slider is clickable on home page
    When user click on second slider
    Then direct user to another url