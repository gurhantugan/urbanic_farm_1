@API
@US_119
Feature: user should be able to complete an event

  Scenario:
    Given user connects to the "account/event/complete" with payload and token
    | eventId       |
    | 890|
    Then user asserts that the response is as expected
