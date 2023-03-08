#As a user, I should be able to get existing hubs' information.

#"Products & Services
#User should be able to get existing hubs' information.
#https://test.urbanicfarm.com/api/account/hub/getMyHubs
#Details on the swagger document."
Feature:
@US094

Scenario: As a user, I should be able to get existing hubs' information.
Given User logs in as as seller with API
Then User gets all existing hubs' information


