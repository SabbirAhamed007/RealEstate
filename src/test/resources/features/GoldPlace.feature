Feature: Test BDDL gold place feature
  

   @smoke
  Scenario: Test BDDL gold place flat scenario
    Given I open BDDL gold place flat page
    And change the picture for BDDL gold place flat
    When I verify text for BDDL gold place flat
    And I verify monthly mortgage payment for BDDL gold place flat
    Then close the browser for BDDL gold place flat
   