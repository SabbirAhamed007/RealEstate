Feature: Test let us call you feature

  @smoke
  Scenario: Test let us call you scenario
    Given I open website
    When I enter name
    And email
    And phone number
    And type message
    Then I validate the submit button
    And close the webpage

  