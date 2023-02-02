
@US006
  @smoke
   Feature: US_006 User should be able to perform various operations on homepage
     Scenario: TC_001 Contact Us should be clickable and relevant page should be visible
       Given user is on the Urbanic_Farm page
       When user clicks on contact us link
       Then user verifies that relevant page is "https://test.urbanicfarm.com/contact-us"
