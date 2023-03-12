@US075
Feature: Events
  Scenario:
    Given user goes to "account/events-i-organize" page after login.
    When user clicks the new Events
    And user writes the required data to the boxes with followings

      | Title  | Address | Date       | Time  | Duration | Attendee Limit | Terms and Conditions |
      | mahsul | 1       | 08/08/2023 | 15:00 | 300      | 50             | misir, bugday        |

  Scenario: As a user, should able to attend the someone's event(s)
    Given user goes to "account/events" pageafter login

  Scenario Outline:
#    Given user goes to "account/events" page after login
    And A user fills in the "<number>" of participants
    Examples:
      | number |
      | 3      |

  Scenario:
    And the user checks the terms and conditions box
    And user clicks confirmation button
    Then user confirms activity is registered

  Scenario: As a user, should able to attend the someone's event(s)
    Given After logging in, the user visits the "account/events" page.

  Scenario Outline:
#    Given user goes to "account/events" page after login
    And A user enters "<number>" as the number of participants.
    Examples:
      | number |
      | -2     |

  Scenario:
    And The user clicks the I agree button.
    And The user then presses the confirmation button.
    And User then confirms that the activity was registered.

  Scenario:
    Given user goes to "account/events-i-organize" pageafterlogin.
    When The user deletes the record he entered.