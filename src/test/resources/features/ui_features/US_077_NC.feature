Feature: As a user, should able to delete the event
  Background:
    Given user goes to Home Page
    When  user enter the Login button
    And   user enter "seller_urban1@yopmail.com" and "Seller1/" as login credentials and clicks login
    And   user goes to account page and clicks on My Events

  Scenario: As a user, should able to delete the event
    When   user click on delete and yes button
    And    user should be able to seesing "Event deleted" message
    And    user verify the event has been deleted
    #And    user click on Mark as completed button
    #And    user should be able to see "Event marked as completed" message
    #And    user click on copy link  button
    #And    user should be able to seeing  "Event Link Copied Clipboard" message
    #And    user click on My Completed Events button
    #And    user verify the event has been completed