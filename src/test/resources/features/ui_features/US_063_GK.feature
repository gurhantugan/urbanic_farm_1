
Feature: Welcome Page
  US:As a user, after entering valid information, I should be able to perform various actions in the Welcome Page

  AC:
  # After entering the buyer user name/buyer password, the Welcome Page should appear
  # What are you looking for,Search in miles, Categories, Search only in organic produce, Search menus should be functional
  # What are you looking for,Search in miles, Categories, Search only in organic produce, Search menus should give correct results
  # When the Box is clicked, Price, Delivery type, Unit type options should be seen.

@US63_TC001
 Scenario: Welcome Page
   Given User enter to Home Page
  When User see and click the login button
  Then User enters buyer valid email address
  Then User enters buyer valid password
  Then User click the login button
  Then User see "Welcome to Urbanic Farm" message on screen




  #//div[@class='modal-body']