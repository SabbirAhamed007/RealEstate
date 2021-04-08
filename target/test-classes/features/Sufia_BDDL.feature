Feature: Test BDDL Sufia feature

  @smoke
  Scenario: Test BDDL Sufia flat scenario
    Given I open BDDL Sufia flat page
    And change the picture for BDDL Sufia flat
    When I verify text for BDDL Sufia flat
    And I verify monthly mortgage payment for BDDL Sufia flat
    Then close the browser for BDDL Sufia flat
