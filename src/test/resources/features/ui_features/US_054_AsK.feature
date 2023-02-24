Feature:US_054 Various actions in the Delivery & Pick up settings  section

  Scenario:As a user,I should be able to perform various actions in the Delivery & Pick up settings  section
    Given user goes to "account/delivery" page after login as a buyer
#    Given user goes to url
#    When user clicks on login button header
#    And user enters valid email address
#    And user enters valid password
#    And user clicks login button
#    And user click buyer name button and click
#    And user click delivery and pick up setting
    Then user picks up on the vine checkbox should be clickable
    When user while clicking picks up on the vine checkbox should show "Your available hours" menu functional and visible
    When user chose same hours and click update button
    Then "Start time cannot be greater than end time at the Buyer picks up on the vine field." alert massage should be visible
    When Your available hours is selected and click update button
    Then "Your delivery settings have been successfully updated" alert message should be visible
