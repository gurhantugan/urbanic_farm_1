@US_073


Feature:US73

  Background:
    Given user goes to Home Page
    When  user enter the Login button
    And   user enter "seller_urban1@yopmail.com" and "Seller1/" as login credentials and clicks login
    And   user goes to account page and clicks on My Events

  Scenario Outline: As a user, should able to add an address successfully by providing with valid data
    When user should able to add an address by clicking add button on create event page
    Then user should provide Title for the event
    Then user should provide address for the event
    Then user should type or select the city for the event
    Then user should type or select the state for the event
    Then user should provide Zip code for the event
    Then user should able to add an address by clicking <button> button and see successful message <alert>
    Examples:
      | button    | alert                         |
      | "Submit " | "Address successfully added." |