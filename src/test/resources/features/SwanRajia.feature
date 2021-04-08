Feature: Test Swan Rajia apartment feature

  @smoke
  Scenario: Test Swan Rajia apartment scenario
    Given I open Swan Rajia apartment page
    And change the picture for BSwan Rajia apartment
    When I verify text for Swan Rajia apartment
    And I verify monthly mortgage payment for Swan Rajia apartment
    Then close the browser for Swan Rajia apartment
