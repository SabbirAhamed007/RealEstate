Feature: Test BDDL Reaz Bag feature
 

  
  @smoke
  Scenario: Test BDDL Reaz Bag flat scenario
    Given I open BDDL Reaz Bag flat page
    And change the picture for BDDL Reaz Bag flat
    When I verify text for BDDL Reaz Bag flat
    And I verify monthly mortgage payment for BDDL Reaz Bag flat
    Then close the browser for BDDL Reaz Bag flat
   