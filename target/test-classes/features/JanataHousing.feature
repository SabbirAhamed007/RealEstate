Feature: Test Janata Housing feature

  @smoke
  Scenario: Test Janata Housing scenario
    Given I open Janata Housing
    And change the picture for Janata Housing
    When I verify text in Janata Housing
    And I verify monthly mortgage payment for Janata Housing
    Then I validate leave a reply for Janata Housing
    And close the browser for Janata Housing
