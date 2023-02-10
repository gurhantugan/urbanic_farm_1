Feature:US_035 As a user I should be able to login with my account

  Scenario:
  Email address and password button should be functional
  Valid email and password must be entered
  Successful login after valid information is entered

  Given user is on homepage
  When user is on login page
  Then user verifies email address button is visible
  And user verifies password button is visible
  When user enter valid email and password
  Then user clicks login button
  And user should be able to verify to login successfully



