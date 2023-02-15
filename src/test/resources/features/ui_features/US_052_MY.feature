Feature: Various actions in adress section
  Scenario: As a user, after entering valid information, I should be able to perform various actions in the Address section
	Given user goes to url
    When user clicks on login button
    Then user enter seller credentials and clicks login button
    And user clicks on account name link
    When user selects adress bar and clicks on it
    And user clicks on My Sales Adress
    When user clicks to edit button
    When user is able to change Sales Adress by clicking the tick and click submit button
    Then user should see the adress in Non Selected Adress
    Then user clicks on Cancel button to see nothing was editted








