Feature: Test Eldorado apartment feature

  @smoke
  Scenario: Test Eldorado apartment scenario
    Given I open Eldorado apartment page
    And change the picture for Eldorado apartment
    When I verify text for Eldorado apartment
    And I verify monthly mortgage payment for Eldorado apartment
    Then close the browser for Eldorado apartment
