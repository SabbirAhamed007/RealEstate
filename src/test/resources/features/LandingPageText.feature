Feature: Test landing page text feature

  @smoke
  Scenario: Test landing page scenario
    Given I open buyrentd homepage
    When I verify vission text
    And mission text
    Then I close the website
