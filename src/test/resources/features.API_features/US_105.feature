Feature:As a user, I should be able to get all conversations.
  Scenario:
    Given User logs in API for notification
    Then User get all conversations
    And user verifies that the response is expected.