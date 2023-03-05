@UI
  @US_071
  @regression
  Feature:

    Scenario:
      Given user goes to "account/events-i-organize" page after login
      When user clicks the new Events
      And user adds a title for the event
      And user adds an address for the event
      And user enters new address for the event
      And user enters valid event date
      And user enters a time for the event
      And user enters fee for the event
      And user enters duration of event
      And user enters attendee limit for the event
      And user optionally enters schedule for the event
      And user optionally enters description for the event
      And user enters terms and conditions for the event
      When user clicks "Submit" button event
      Then user verifies "Event created" success message
      When user user click on events link
      Then user verifies created event with sign of NEW text is listed on events page








