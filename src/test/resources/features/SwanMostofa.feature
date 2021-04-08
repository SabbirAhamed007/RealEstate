Feature: Test Swan Mostofa apartment feature

  @smoke
  Scenario: Test Swan Mostofa apartment scenario
    Given I open Swan Mostofa apartment page
    And change the picture for Swan Mostofa apartment
    When I verify text for Swan Mostofa apartment
    And I verify monthly mortgage payment for Swan Mostofa apartment
    Then close the browser for Swan Mostofa apartment
