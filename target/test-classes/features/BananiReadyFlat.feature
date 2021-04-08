Feature: Test Banani Ready flat feature

  @smoke
  Scenario: Test Banani Ready flat scenario
    Given I open Banani Ready flat page
    And change the picture for Banani Ready flat
    When I verify text for Banani Ready flat
    And I verify monthly mortgage payment for Banani Ready flat
    Then close the browser for Banani Ready flat
   
