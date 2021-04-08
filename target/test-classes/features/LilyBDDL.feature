Feature: Test BDDL Lily feature
  
@smoke
  Scenario: Test BDDL Lily flat scenario
    Given I open BDDL Lily flat page
    And change the picture for BDDL Lily flat
    When I verify text for BDDL Lily flat
    And I verify monthly mortgage payment for BDDL Lily flat
    Then close the browser for BDDL Lily flat


 