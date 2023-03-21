Feature: As a user, I should be able to create an event
  Scenario: Event. User should be able to create an event
  https://test.urbanicfarm.com/account/event/create
  Details on the swagger document."
    Given user logs in by token and goes "/account/event/create"
    And user fills the required information to create an event
    And user creates the event
    And user verifies that the event was created successfully with the correct parameters