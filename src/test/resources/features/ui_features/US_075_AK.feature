@US075
Feature: Events
  Scenario:
    Given user goes to "account/events-i-organize" page after login.
    When user clicks the new Events
    And user creates the event by filling in the required fields to create the event

  Scenario: As a user, should able to attend the someone's event(s)
    Given user goes to "account/events" pageafter login
    #When user participates in any of the events

  Scenario Outline:
    #Given user goes to "account/events" page after login
    #And user participates in any of the events
    And A user fills in the "<number>" of participants
    Examples:
      | number |
      | 3      |

  Scenario:
    And the user checks the terms and conditions box
    And user clicks confirmation button
    Then Verifies that the user confirmation button is clickable
    Then user confirms activity is registered

  Scenario:
    Given user goes to "account/events-i-organize" pageafterlogin.
    When The user deletes the record he entered.