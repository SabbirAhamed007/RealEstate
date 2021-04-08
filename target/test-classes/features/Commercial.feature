Feature: Test commercial building feature

  @smoke
  Scenario: Test commercial building scenario
    Given I open commercial building page
    And change the picture for commercial building
    When I verify text for commercial building
    And I verify monthly mortgage payment for commercial building
    Then close the browser for commercial building
