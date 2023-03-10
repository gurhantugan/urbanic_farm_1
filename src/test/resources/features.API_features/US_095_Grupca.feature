#"Products & Services
#User should be able to create a hub.
#https://test.urbanicfarm.com/api/account/hub/create
#Details on the swagger document."
Feature: User should be able to create a hub

  Scenario:
    Given user connects to the "account/hub/create" with token and payload
      | hubUniqueName |
      | SEED_HUB      |
   # Then user verifies that the response is as expected status code

