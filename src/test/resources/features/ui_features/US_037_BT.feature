Feature: US_037 As a user Forgot your password? and I should be able to check the new password creation process

  Scenario: TC_001 As a user Forgot your password? and I should be able to check the new password creation process
    Given The user is on the login page
    When Forgot Password button should be clickable and the user presses the Forgot Password button
    Then The "Please verify your email." message should appear
    When The user enters the valid email in the "Please verify your email." window
    Then Verify Email button should be clickable
    When The user press the Verify Email button
    Then Email should be sent to the user's mailbox and "We have sent the password reset link to your email. Check your mail box." message should appear
    When The user comes to the mailbox
    Then The user sees the password reset link in the mailbox and Reset Your Password button must be clickable
    When The user presses the Reset Your Password link
    Then Change Password screen and Confirm Password menus should be appeared
    And New Password and Confirm Password textbox should be functional
    When The user enters the new valid password to New Password textbox and Confirm Password textbox
    Then Press the submit button with valid and new credentials and Login Page should be appeared
  Bbthigghq2234