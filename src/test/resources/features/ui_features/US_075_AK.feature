Feature: Events

  Scenario: As a user, should able to attend the someone's event(s)
    Given user goes to "account/events" page after login
    When user clicks Events the checkbox
    When user participates in any of the events

  #cenario Outline:
  # Given user goes to "account/events" page after login
  # When user clicks Events the checkbox
  # And user participates in any of the events
  # And A user fills in the "<number>" of participants
  # Examples:
  #   | number |
  #   | -2     |
  #   | 1      |



    #And the user checks the terms and conditions box
    #And user clicks confirmation button
    #Then Verifies that the user confirmation button is clickable
    #And user fills in all required fields
    #And   user logs activity
    #Then  user confirms activity is registered



