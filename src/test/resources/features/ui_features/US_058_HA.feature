#  As a user, after entering valid information, I should be able to perform various actions in the Your products/services section
#
#  Product Name, Price, Stock, Unit information about previously added products should be displayed.
#  One of the Approved, Review, Rejected options for each product should be visible on the file.
#  It should be possible to click on the product name on the file related to the previously added product.
#  When the product name is clicked, the update-delete page is displayed.
#  Product information should be able to be changed on this page
#  Organic, trade buttons should be functional
#  Update button should be visible
#  Delete button should be visible
#  When the update option is clicked after the necessary corrections, (.....) has been succesfully updated alert should be displayed.
#  When the Delete button is clicked
#  Yes/No options should appear.
#  One of the Yes/No options should be selected.
#  No option should cancel the operation
#  When Yes option is selected, the product should be removed from the page.
#  Go back button must be functional
#  When you click the go back button, you should go back to the previous page.

Business Need: Your products/services
  Rule: keyword is to represent one business rule that should be implemented
  is used to group together several scenarios that belong to this business rule
  should contain one or more scenarios that illustrate the particular rule.
    @UI
    @DB
    Scenario: As a user, after entering valid information, I should be able to perform various actions in the Your products/services section
      Given user goes to "account/hub" page after login
      And user click on random Hubs
      When user verifies product name, price, stock, unit information added products should be displayed
#      Then user verifies one of the approved, in-Review, rejected options for each product should be visible on the file
#      Then user verifies in-review should be visible on the added product
      Then user approves last added product from database
      Then user verifies approved should be visible on the added product
      Then verifies product name on the file related to the previously added product is clickable
      When user verifies product name is clicked, the update-delete page is displayed
      When user verifies product information should be able to be changed on this page
      When user verifies update is clicked after corrections, it has been succesfully updated alert should be displayed
      When user verifies delete button is clicked, yes- no options should appear
      Then user verifies yes - no options should appear
      When user verifies one of the yes - no options should be selected
      Then user verifies no option should cancel the operation
      When user verifies yes option is selected, the product should be removed from the page