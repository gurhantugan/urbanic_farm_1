Feature: As a user, I should be able to update an event

  Scenario: "Events.. User should be able to update an event.
  https://test.urbanicfarm.com/api/account/event/update
  Details on the swagger document."
    Given user logs in by token and goes "/account/event/update" with payload
      | title       | date             | fee | duration | attendeeLimit | addressId | tac     |
      | Ahmet Ertan | 2023-04-10T15:00 | 100 | 100      | 30            | 723       | Merhaba |
    Then user verifies that the response is as expected in create event is as expected
      | success | true |
#      | title         | Ahmet Ergul |
#      | fee           | 100         |
  #    | event.duration      | 60          |
#      | attendeeLimit | 30          |
#      | tac           | Merhaba     |
    Given user logs in by token and goes "/account/event/update" with payload
      | title       | date             | fee | duration | attendeeLimit | addressId | tac     |
      | Ahmet Erbil | 2023-04-10T15:00 | 200 | 60       | 30            | 723       | Merhaba |




