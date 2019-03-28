Feature: Division of Integer resulting in whole decimal Feature

  Scenario: divide positive integer by decimal
    Given I am on the demo page
    When I divide 9 by 3.232
    Then the result is 2.7846534

  Scenario: divide decimal by integer
    Given I am on the demo page
    When I divide 9.5675 by 3
    Then the result is 3.1891668

  Scenario: divide decimal by decimal
    Given I am on the demo page
    When I divide 9.5675 by 3.444
    Then the result is 2.7780197
