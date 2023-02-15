# As a user I should be able to see the functionality of the register page
# Name, Surname, Email, Password fields must be functional
# Name, surname, email and password should not be able to left blank.
@US030
Feature: Register Page
Background: User should be on the Urbanic_Farm page
Given user on the Urbanic_Farm page "https://test.urbanicfarm.com/explore"
When user click on register button
Then user should see First name

@US_030-TC001
Scenario: Name, Surname, Email, Password fields must be functional

Then assert First name field is enabled
Then assert Last name field is enabled
Then assert Email field is enabled
Then assert Password field is enabled

@US_030-TC002
Scenario Outline: First name, Last name, Email and Password should not be able to left blank.

  When user enters "<First name>" in First name field
  And user enters "<Last name>" in Last name field
  And user enters "<Email>" in Email field
  And user enters "<Password>" in Password field
  And user clicks on registertwo button
Then user gets "Please fill in this field." warning message
  Examples:
    | First name | Last name | Email                    | Password        |
    |            | Urban     | seller_urban@mailsac.com | VHt*zzt*wQNu6XS |
    | Test       |           | seller_urban@mailsac.com | VHt*zzt*wQNu6XS |
    | Test       | Urban     |                          | VHt*zzt*wQNu6XS |
    |            |           | seller_urban@mailsac.com | VHt*zzt*wQNu6XS |
    |            | Urban     |                          | VHt*zzt*wQNu6XS |
    | Test       |           |                          | VHt*zzt*wQNu6XS |
    |            |           |                          | VHt*zzt*wQNu6XS |
    | Test       |           | seller_urban@mailsac.com |                 |
    |            | Urban     |                          |                 |

  #  When user enters "<First name>" in First name field
#  And user enters "<Last name>" in Last name field
#  And user enters "<Email>" in Email field
#  And user enters "<Password>" in Password field




