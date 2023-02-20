@regression
@abd_16
Feature:User should be able to perform various operations on homepage
  Scenario:Blog should be clickable and relevant page should be visible
    Given user goes to url
    When user clicks the blog button
    Then user verifies that the urbanicfarm.com blog is visible.
         #user verifies that the "https://urbanicfarm.com/blog/" is visible.