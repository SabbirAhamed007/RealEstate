Feature: Test footer feature

  @smoke
  Scenario: Test footer scenario
    Given I open website for footer
    When I verify property type
    And recent posts
    And categories
    Then contract info
    And close website for footer check
