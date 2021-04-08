
Feature: Test Al Kaif feature
  

  @smoke
  Scenario: Test Al Kaif flat scenario
    Given I open Al Kaif flat page
    And change the picture for Al Kaif flat
    When I verify text for Al Kaif flat
    And I verify monthly mortgage payment for Al Kaif flat
    Then close the browser for Al Kaif flat
   

 