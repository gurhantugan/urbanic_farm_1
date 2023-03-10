@API
@US_083
Feature: user should be able to contact to Urbanic Farm

  Scenario:
    Given user connects to the "public/contact" with payload
#      | email       | message     | name       | subject |
#      | abc@def.com | Hello world | John Smith | Tomato  |
    Then user verifies that the response is as expected
      | success | true |