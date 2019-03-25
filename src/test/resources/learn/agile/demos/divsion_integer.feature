Feature: Division of Integer resulting in whole integer Feature

  Scenario: divide two positive integers
    Given I am on the demo page
    When I divide the numbers 6 by  2
    Then the result is 3
    
  Scenario: divide negative integer by postitive
    Given I am on the demo page
    When I divide the numbers -9 by  3
    Then the result is -3
    
    Scenario: divide postivie integer by negative
    Given I am on the demo page
    When I divide the numbers 9 by  -3
    Then the result is -3
    
    Scenario: divide negative integer by negative
    Given I am on the demo page
    When I divide the numbers -9 by  -3
    Then the result is 3