Feature: Test Max ADN Apartment feature

  @smoke
  Scenario: Test Max ADN Apartment scenario
    Given I open Max ADN Apartment page
    And change the picture for Max ADN Apartment
    When I verify text for Max ADN Apartment
    And I verify monthly mortgage payment for Max ADN Apartment
    Then close the browser for Max ADN Apartment
