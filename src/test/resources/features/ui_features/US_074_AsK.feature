Feature: US_074  To add an address by providing with invalid data
  Scenario: As a user, should not able to add an address successfully by providing with invalid data
  Given user goes to "My Events" page after login
  When user should able to create an event by clicking "Create Event" button on Event page
  When title should be at least two character and can not be blank if so user will see warning message "Please enter a valid title."
  And address should be at least ten character and can not be blank if so user will see warning message "Please enter a valid address."
  And city should be at least two character or select from dropdown and can not be blank if so user will see warning message "Please enter a valid city."
  Then state should be at least two character or select from dropdown and can not be blank if so user will see warning message "Please enter a valid state."
  And zip code should be five digits only and can not be blank if so user will see warning message "Please enter a valid postal/zip code."
  Then  user should able to cancel adding address by clicking Cancel button