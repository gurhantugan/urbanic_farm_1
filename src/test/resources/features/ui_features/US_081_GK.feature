Feature: Support US

  US:As a user, I should be able to perform various operations on the Support us page

  #After clicking the Support the local food movement head, https://wefunder.com/urbanicfarm page should be seen
  #The user should be able to make various controls on this page
  #User must be able to donate




  @US081_TC001
  Scenario: After login,click the Support the local food movement head , https://wefunder.com/urbanicfarm page should be seen
    Given User enter to Home Page
    When User see and click the login button
    Then User enters buyer valid email address
    Then User enters buyer valid password
    Then User click the login button
    Then User should click <"Support the local food movement">
    And User should see "https://wefunder.com/urbanicfarm" webpage

    @US081_TC002
    Scenario: Before login,click the support the local food movement head ,https://wefunder.com/urbanicfarm page should be seen
      Given user on the Urbanic Farm page
      Then User should click <"Support the local food movement"> before login
      And User should see "https://wefunder.com/urbanicfarm" webpage before login

@US081_TC003
Scenario: The user should be able to make various controls on this page
  Given user is on the Urbanic_Farm page
  Then User should click <"Support the local food movement"> before login
  And User should see "https://wefunder.com/urbanicfarm" webpage before login
  Then User close cookie part on website
  And User see "INVEST IN URBANICFARM" sentence on the page
  Then User click "Overview" on website
  And User see Urbanic Farm under "Pitch"


