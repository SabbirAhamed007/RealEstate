Feature: Test Banani Lake apartment feature

  @smoke
  Scenario: Test Banani Lake apartment scenario
    Given I open Banani Lake apartment
    And change the picture for Banani Lake apartment
    When I verify text in Banani Lake apartment
    And I verify monthly mortgage payment for Banani Lake apartment
    Then I validate leave a reply for Banani Lake apartment
    And close the browser for Banani Lake apartment
