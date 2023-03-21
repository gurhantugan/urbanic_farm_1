Feature: As a user, I should be able to get weekly order list

  Scenario:
    Given The user connects to the "string" api.
    And The user connects to the getWeekly api
    #And The user verifies buyer ids numbers more than one
    And The user verifies that the status code is 200.
