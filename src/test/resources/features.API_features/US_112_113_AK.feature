Feature: As a user, I should be able to register an existing event

  #@API
    #@US112_113
  Scenario:
    Given User logs in as as Seller with API
    And User creates Address
    And User creates Event
    And User gets Register
    Then User verifies success message is true
    Then User verifies if status code is 200 on Event
    And User Go to Payment
    Then User verifies success message is true
    Then User verifies if status code is 200 on Event