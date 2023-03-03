Feature: As a user, should able to cancel/completed/share the event(s)

  Scenario: As a user, should able to on my events page
    Given user goes to Home Page
    When  user enter the Login button
    And   user enter "seller_urban1@yopmail.com" and "Seller1/" as login credentials and clicks login
    And   user goes to account page and clicks on My Events

  Scenario: As a user, should able to cancel/completed/share the event(s)
    When   user click on cancel button
    And    user should be able to sees "Event cancelled " message
    And    user click on Mark as completed button
    And    user should be able to see "Event marked as completed" message
    And    user click on copy link  button
    And    user should be able to seeing  "Event Link Copied Clipboard" message
