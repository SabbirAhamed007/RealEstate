
Feature: Test latest news in home page feature
 
  @smoke
  Scenario: Test latest news scenario
    Given I open the buyrebtbd homepage news
    When I verify latest news text
    And verify text for realestate housing association
    And The ultimate real estate 
    Then I verify rent vs buy
    And close the website after latest verification done
