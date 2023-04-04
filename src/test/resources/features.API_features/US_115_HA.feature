Feature: As a user, I should be able to create an event

  Scenario: Event. User should be able to create an event
  https://test.urbanicfarm.com/account/event/create
  Details on the swagger document."
    Given user logs in by token and goes "/account/event/create" with payload
      | title         | date             | fee | duration | attendeeLimit | addressId | tac     |
      | Ahmet Erbilli | 2023-04-10T15:00 | 200 | 60       | 30            | 723       | Merhaba |
    Then user verifies that the response is as expected in create event is as expected
      | success             | true          |
      | event.title         | Ahmet Erbilli |
      | event.fee           | 200           |
      | event.duration      | 60            |
      | event.attendeeLimit | 30            |
      | event.tac           | Merhaba       |