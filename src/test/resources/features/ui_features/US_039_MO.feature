
  Feature:As a user, after entering valid information,
        I should be able to perform various operations on the Sale-Pay-Trade page


  Scenario:About us should be clickable and relevant page should be visible

        Given User is on home page
        When  User clicks the login button
        Then  User enters valid email address
        Then  User enters valid password
        Then  User clicks the login button
        Then  User clicks the About us button
        Then  User is on relevant page
