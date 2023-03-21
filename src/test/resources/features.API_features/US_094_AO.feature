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
    Then user verifies that the response is as expected
      | hubs[0].uniqueName | VEGETABLES_AND_FRUITS_HUB |
      | hubs[1].uniqueName | DAIRY_HUB                 |
      | hubs[2].uniqueName | GARDENING_SERVICES_HUB    |
      | hubs[5].uniqueName | SEED_HUB                  |

  # Bu methot dinamik olmadığı için çok tavsiye edilmez.
#  Assert.assertEquals(expectedData.get(0), response.jsonPath().getString(paths.get(0)));
#  Assert.assertEquals(expectedData.get(1), response.jsonPath().getString(paths.get(1)));
#  Assert.assertEquals(expectedData.get(2), response.jsonPath().getString(paths.get(2)));
#  Assert.assertEquals(expectedData.get(3), response.jsonPath().getString(paths.get(3)));
