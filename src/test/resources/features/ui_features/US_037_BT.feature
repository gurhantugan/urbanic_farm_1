@US_037
Feature: US_037 As a user Forgot your password? and I should be able to check the new password creation process

  Scenario: TC_001 As a user Forgot your password? and I should be able to check the new password creation process
    Given User is on the login page
    When Forgot Password button should be clickable and user presses the Forgot Password button
    Then "Please verify your email." message should appear
    When User enters the valid email in the "Please verify your email." window
    Then Verify Email button should be clickable
    When User click on the Verify Email button
    Then Email should be sent to the user's mailbox and "We have sent the password reset link to your email. Check your mail box." message should appear
    When User comes to the mailbox
    Then User sees the password reset link in the mailbox and Reset Your Password button must be clickable
    When User clicks on the Reset Your Password link
    Then Change Password screen and Confirm Password menus should appear
    And New Password and Confirm Password textbox should be functional
    When User enters the new valid password to New Password textbox and Confirm Password textbox
    Then Click on the submit button with valid and new credentials and Login Page should appear
    And verify password is not the old one
