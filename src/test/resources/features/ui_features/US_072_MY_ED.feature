Feature: US_072

  Scenario:As a user, should not able to create Event(s) providing invalid data

  Given user goes to Home Page
  When user enter the Login button
  And user enter "seller_urban1@yopmail.com" and "Seller1/" as login credentials and clicks login
  And user goes to account page and clicks on My Events
  And user clicks the new Events

















# Create Event
# user should able to create an event by clicking "Create Event" button on Event page
# if user not provide valid data to the reqired field and clicks submit button should not able to create an event by seeing warnig message.
# title box cannot be blank if so user will see warning message "Please enter a valid title."
# address box cannot be blank if so user will see warning message "Please select an address."
# date box cannot be blank if so user will see warning message "Please select a date."
# time box cannot be blank if so user will see warning message "Please enter a time."
# fee box cannot be blank if so user will see warning message "Please provide a fee."
# duration box cannot be blank if so user will see warning message "Please enter a valid duration."
# attendee limit box cannot be blank if so user will see warning message "Please enter a valid attendee limit."
# terms and condition box cannot be blank if so user will see warning message "Please enter a valid terms and conditions."
# user should able to cancel create event by clickng GO Back button