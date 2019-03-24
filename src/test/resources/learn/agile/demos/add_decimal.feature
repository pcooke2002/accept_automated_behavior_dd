Feature: Addition Feature

  Scenario: Add two positive numbers
    Given I am on the demo page
    When I add the numbers 2.25 and 3.35
    Then the result is 5.6

  Scenario: Add postive and negative numbers
    Given I am on the demo page
    When I add the numbers 2.25 and -3.35
    Then the result is -1.0999999

  Scenario: Add negative and postivie numbers
    Given I am on the demo page
    When I add the numbers -2.25 and 3.35
    Then the result is 1.0999999

  Scenario: Add negative and negative numbers
    Given I am on the demo page
    When I add the numbers -2.25 and -3.35
    Then the result is -5.6
