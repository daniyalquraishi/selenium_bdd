Feature: Wishlist
  Background:
  # why add scenario outline here ?
  Scenario Outline: verify add product to wishlist
    Given user opens home page
    When user clicks on product with index <index>
    Then success message should displayed
    Examples:
      | index |
      | 2     |
    Scenario: verify wishlist quantity
      Given success message becomes invisible
      When user clicks on wishlist tab
      Then quantity should be greater than zero
