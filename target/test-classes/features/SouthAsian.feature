Feature: Test south asian feature

  @smoke
  Scenario: Test south asian flat scenario
    Given I open south asian flat page
    When I verify text for south asian flat
    And I verify monthly mortgage payment for south asian flat
    Then close the browser for south asian flat
