Feature: US_074

  Scenario:As a user, should not able to add an address successfully by providing with invalid data

    Given user goes to Home Page
    When user enter the Login button
    And user enter "seller_urban1@yopmail.com" and "Seller1/" as login credentials and clicks login
    And user goes to account page and clicks on My Events
    When user should able to add an address by clicking add button on create event page
    And user should provide Title for the event and title should be at least two character
    And user should provide address for the event and address should be at least ten character
    And user should type or select the city for the event and city should be at least two character
    And user should type or select the state for the event and state should be at least two character
    And user should provide Zip code for the event and zip code should be five digits only
    Then user should able to cancel adding address by clicking Cancel button




#  Create Event
#  title should be at least two character and can not be blank if so user will see warning message "Please enter a valid title."
#  address should be at least ten character and can not be blank if so user will see warning message "Please enter a valid address."
#  city should be at least two character or select from dropdown and can not be blank if so user will see warning message "Please enter a valid city."
#  state should be at least two character or select from dropdown and can not be blank if so user will see warning message "Please enter a valid state."
#  zip code should be five digits only and can not be blank if so user will see warning message "Please enter a valid pstal/zip code."
#  user should able to cancel adding address by clicking Cancel button

