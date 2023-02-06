@US_022

Feature:

  US:
  User should be able to perform various operations on homepage

  AC:
  Privacy Policy should be clickable and relevant page should be visible

  Scenario: Privacy Policy should be clickable and relevant page should be visible

    Given User is on home page
    When User scrolls down on the home page
    Then User clicks the privacy policy
    Then Privacy policy page opens

