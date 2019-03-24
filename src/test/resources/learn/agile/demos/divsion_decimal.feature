Feature: Division of Integer resulting in whole integer Feature

  Scenario: divide positive integer by decimal
    Given I am on the demo page
    When I divide the numbers 9 by 3.232
    Then the result is 3
    
 