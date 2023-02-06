@abd
  Feature:User should be able to perform various operations
    Scenario:Explore should be clickable and relevant page should be visible
      Given user goes to url
      When user clicks the discover button
      Then user verifies that the "https://test.urbanicfarm.com/explore" is visible
