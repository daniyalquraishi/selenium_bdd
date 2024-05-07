Feature: FollowUs


  Scenario: user opens facebook link
    Given user is on home page
    When user clicks on facebook link
    Then facebook should open in new tab

  Scenario: user opens twitter link
    Given user back to home page
    And user clicks on twitter link
    Then twitter should open in new tab

  Scenario: user opens rss link
    Given user back to home page
    And user clicks on rss link
    Then rss should open in new tab

  Scenario: user opens youtube link
    Given user back to home page
    And user clicks on youtube link
    Then youtube should open in new tab