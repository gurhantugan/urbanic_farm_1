Feature: US010

Scenario: User should be able to perform various operations on homepage

 Given User is on the Urbanic_Farm page
  And  User clickable the sell your produce button
 Then user verifies that relevant page contains "https://test.urbanicfarm.com/explore"

