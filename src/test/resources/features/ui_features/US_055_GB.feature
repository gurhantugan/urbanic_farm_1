@UI
@US_055
  @DB
  Feature: US_055
Scenario: US_055 TC_001 As a user, after entering valid information, I should be able to perform various actions in the Delivery & Pick up settings  section



  Given user goes to "account/delivery" page after login as a buyer
  Then user verifies all checkboxes are clickable
  When user clicks on the Buyer picks up checkbox
  Then user verifies show Your available hours menu functional



#Buyer picks up checkbox should be clickable
#Clicking the Buyer picks up checkbox should show Your available hours menu functional
 # When Your available hours is clicked, suitable hours should be selected from the menu
#If the start is after the end (like 10:00 am-06:00am), an error should be seen.