Feature: The various titles on the homepage
  As a user I should be able to see the various titles when I enter the homepage

  Scenario : To see various titles
    Given user goes to the website
    Then  "Urbanic Farm" logo should be visible on the web site
    When Homepage should contain various headers from left to right
    Then Homepage should contain Support the local food movement,
    Then Homepage should contain Blog,
    Then Homepage should contain Explore,
    Then Homepage should contain About Us,
    Then Homepage should contain Contact Us,
    Then Homepage should contain Login,
    Then Homepage should contain Register.






