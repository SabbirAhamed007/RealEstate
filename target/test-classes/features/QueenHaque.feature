Feature: Test queen haque apartment feature

  @smoke
  Scenario: Test queen haque apartment scenario
    Given I open queen haque apartment page
    And change the picture for queen haque apartment
    When I verify text for queen haque apartment
    And I verify monthly mortgage payment for queen haque apartment
    Then close the browser for queen haque apartment
