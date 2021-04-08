Feature: Test find your home feature
 

  @smoke
  Scenario: Test find home scenario
    Given I open buyrentbd website
    When I validate all the find your home option
    Then I close the browser

