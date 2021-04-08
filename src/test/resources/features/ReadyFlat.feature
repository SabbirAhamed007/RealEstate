Feature: Test ready flat feature

  @smoke
  Scenario: Test ready flat scenario
    Given I open ready flat page
    And change the picture for ready flat
    When I verify text in ready flat
    And I verify monthly mortgage payment for ready flat
    Then I validate leave a reply for ready flat
    And close the browser for ready flat
