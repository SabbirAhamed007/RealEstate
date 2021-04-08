Feature: Test Rossella apartment feature
 
  @smoke
  Scenario: Test Rossella flat scenario
    Given I open BDDL Rossella flat page
    And change the picture for BDDL Rossella flat
    When I verify text for BDDL Rossella flat
    And I verify monthly mortgage payment for BDDL Rossella flat
    Then close the browser for BDDL Rossella flat
