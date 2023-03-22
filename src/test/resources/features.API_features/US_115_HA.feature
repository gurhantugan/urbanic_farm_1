Feature: As a user, I should be able to create an event

  Scenario: Event. User should be able to create an event
  https://test.urbanicfarm.com/account/event/create
  Details on the swagger document."
    Given user logs in by token and goes "/account/event/create" with payload
      | title       | date             | fee | duration | attendeeLimit |
      | Ahmet Erbil | 2023-04-10T15:00 | 200 | 60       | 30            |


    And user verifies that the event was created successfully with the correct parameters