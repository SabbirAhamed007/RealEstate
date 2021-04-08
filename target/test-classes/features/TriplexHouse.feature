Feature: Test Triplex house feature

  @smoke
  Scenario: Test Triplex house scenario
    Given I open Triplex house page
    And change the picture for Triplex house
    When I verify text for Triplex house
    And I verify monthly mortgage payment for Triplex house
    Then close the browser for Triplex house
