@regression,@smoke
Feature: The various titles on the homepage
  As a user I should be able to see the various titles when I enter the homepage

  Scenario: To see various titles
    Given user is on homepage
    Then  "Urbanic Farm" logo should be visible on the web site


    Then Homepage should contain the following links
#     | Support the local food movement |
#      | Blog                            |
#      | Explore                         |
#      | About Us                        |
#      | Contact Us                      |
#      | Login                           |
#      | Register                        |







