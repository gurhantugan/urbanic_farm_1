@API
@US_083
Feature: user should be able to contact to Urbanic Farm

  Scenario:TC-001
    Given user connects to the "public/contact" with payload

   #  | email       | message     | name       | subject |
    # | abc@def.com | Hello world | John Smith | Tomato  |
    Then user verifies that the response is expectedd



  Scenario:TC-002
    Given user connects to the "public/contact" with payload
      | email | message | name | subject |
      |       |         |      |         |
    Then user verifies that the response is expectedd

