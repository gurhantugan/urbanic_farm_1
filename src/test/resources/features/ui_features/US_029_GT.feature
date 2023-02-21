@regression @UI @US_029
Feature: As a user, I should be able to register with my Google account(Manuel)

  Scenario: Registration must be created with Sign in with Google and confirmation must be sent to the e-mail.

    Given user is on the Urbanic_Farm page
    When user clicks on Register
    And user clicks on Sign in with Google button
#    Then user verifies its username in registered page
    Then user closes browser



















