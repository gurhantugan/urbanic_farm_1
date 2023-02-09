Feature:
  As a user, after entering valid information,
  I should be able to perform various operations on the Sale-Pay-Trade page.
  Scenario: Logout should be clickable and relevant page should be visible
    Given user is on homepage
    And user enter the Login button
    And user enters "huseyinaka01@gmail.com" in Email field on Login Page
    And user enters "Apply1453#" in Password field on login Page
    And user clicks on login button
    And user clicks on huseyin button
    And user clicks on logout button
    Then user verifies that relevant page is "https://test.urbanicfarm.com/"