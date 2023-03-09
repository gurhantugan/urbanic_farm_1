@API
  @US_083
  Feature: user should be able to contact to Urbanic Farm
    Scenario:
    User should be able to contact to Urbanic Farm
    https://test.urbanicfarm.com/api/public/contact

      /*
    "email": "string",
    "message": "string",
    "name": "string",
    "subject": "string"
    }
      */
      Given user connects to the "public/contact" with payload
        | email         |message      | name      | subject |
        | abc@def.com   | Hello world | John Smith| Tomato  |