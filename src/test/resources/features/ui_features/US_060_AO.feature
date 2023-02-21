

#Your products/services
#Go back button must be functional
#When you click the go back button, you should go back to the previous page.

  Feature: US_060 As a user, after entering valid information, I should be able to perform various actions in the Your products/services section

    Scenario: TC_001 Go back button must be functional
      Given user goes to Home Page
      When user clicks on login button header
      And user enters valid email address
      And user enters valid password
      And user clicks on login button footer
      Then user should be on the Home page
      And user clicks on cristian button
      And user clicks on Your products and services button
      Given user is on Your products and services page
      Then Go back button should be clickable
      When user clicks on go back button
      Then user should be on the previous page

