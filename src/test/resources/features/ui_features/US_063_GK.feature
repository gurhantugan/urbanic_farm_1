@US63
Feature: Welcome Page
  US:As a user, after entering valid information, I should be able to perform various actions in the Welcome Page

  AC:
  # After entering the buyer user name/buyer password, the Welcome Page should appear
  # What are you looking for,Search in miles, Categories, Search only in organic produce, Search menus should be functional
  # What are you looking for,Search in miles, Categories, Search only in organic produce, Search menus should give correct results
  # When the Box is clicked, Price, Delivery type, Unit type options should be seen.
Background: Welcome Page
  Given User enter to Home Page
  When User see and click the login button
  Then User enters buyer valid email address
  Then User enters buyer valid password
  Then User click the login button

@US63_TC001

  Scenario: Welcome Page should be appear
  Then User see "Welcome to Urbanic Farm" message on screen

@US63_TC002
Scenario: What are you looking for,,Search in miles,Categories,Search only organic produce,Search menu should be functional
  Then  user should be functinal all titles
    | What are you looking for    |
    | Search in miles             |
    | Categories                  |
    | Search only organic produce |
    | Search menu                 |


  @US63_TC003
  Scenario Outline: What are you looking for,Search in miles, Categories, Search only in organic produce, Search menus should give correct results
    Then User should choose valid credentials to '<What are you looking for>'
    And User should choose valid credentials to '<Search in miles>'
    And User should choose valid credentials to '<Categories>'
    And User should choose the correct version  '<Search only in organic produce>'
    And User should click "<Search menu>"

    Examples:
      | What are you looking for | Search in miles | Categories |
      | Adriatic Figs            | Any             | Any        |
      |                          |                 |            |









