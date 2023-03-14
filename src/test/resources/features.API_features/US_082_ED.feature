Feature: As a user, I should be able to login

  @US082
  Scenario: User should be able to log in as a seller
    Given User logs in as as seller with API
    Then user verifies that the response is as expected in followings
      | success    | true                     |
      | email      | seller_urban@mailsac.com |
      | first_name | Mpho                     |
