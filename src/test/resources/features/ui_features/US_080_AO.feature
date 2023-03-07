#As a user, I should be able to perform various operations on the Contact us page
#
#Contact us
#The Contact us head at the top of the Welcome Page should appear
#Contact us head should be clickable
#When the Contact us head is clicked, the Get in Touch page should appear
#When SEND MESSAGE is clicked without entering any information, alerts such as "Please enter a valid name, Please enter a valid email address, Please enter a message with at least 10 characters." should be displayed.
#After entering the required information, click SEND MESSAGE
#After the message is sent, an alert should appear that the message has been successfully delivered. ''Thanks for your message. It has been sent to us


@US_080_TC_001

Feature: As a user, I should be able to perform various operations on the Contact us page

  Scenario: The Contact us head at the top of the Welcome Page should appear
    Given user goes to "account/hub" page after login
    Then Contact us head at the top of the Welcome Page should appear
    Then Contact us head should be clickable
    When user clicks Contact us
    Then get in touch page should appear
    When user clicks Send Message without entering any information
    Then user should see these allerts "Please enter a valid name, Please enter a valid email address, Please enter a message with at least 10 characters."
    When user entering the required information
    And user clicks Send Message
    Then user should see the allert "Thanks for your message! It has been sent to us."