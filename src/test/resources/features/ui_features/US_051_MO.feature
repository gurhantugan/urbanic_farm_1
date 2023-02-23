 @US_051
   @smog
   @regression
   Feature:Various actions in address section
     Background:
       Given user goes to "account/address" page after login
       Then  user clicks on Delivery Address button

     Scenario:As a user, after entering valid information,
              I should be able to edit in the Address section.

       When user should see address edit and remove button on the Address page
       Then user clicks to edit button
       Then user clicks on AddressTitle button
       Then user enter valid address
       Then user clicks on submit button
       Then user should be able to see warning message"Your Address successfully updated"


     Scenario: Address deleted
       Given user on the Address page
       When  user clicks on Remove button
       Then  pop up should be seen"Are you sure to delete the address?"
       When  user clicks on No button
       Then  user should be go back to Address page
       When  user clicks on Remove button
       And   user clicks on Yes button
       Then  user should see the message "Address deleted"




