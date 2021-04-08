Feature: Test three bed ready apartment feature

  @smoke
  Scenario: Test three bed ready apartment scenario
    Given I open three bed ready apartment page
    And change the picture
    When I verify text
    And I verify monthly mortgage payment
    Then I validate leave a reply
    And close the browser
