Feature: As a user, I should be able to delete an event

  Scenario:
    Given User logs in as as seller with API
    And User create Address
    And User creat Event
    When User delete an event
    Then User verifies the status code
    #And User verifies success message is true delete

