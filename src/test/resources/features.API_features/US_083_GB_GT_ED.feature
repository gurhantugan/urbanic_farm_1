@API
@US_083
Feature: user should be able to contact to Urbanic Farm

  Scenario:TC-001
    Given user connects to the "public/contact" with payload
      | email       | message     | name       | subject |
<<<<<<< HEAD
    | abc@def.com | Hello world | John Smith | Tomato  |
    Then user verifies that the response is as expectedd
      | success | true |
=======
      | abc@def.com | Hello world | John Smith | Tomato  |
    Then user verifies that the response is expectedd

>>>>>>> main


  Scenario:TC-002
    Given user connects to the "public/contact" with payload
      | email | message | name | subject |
      |       |         |      |         |
    Then user verifies that the response is expectedd

