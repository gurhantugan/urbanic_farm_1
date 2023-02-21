@US_059
  Feature: Your products/services

    Scenario: As a user, after entering valid information, I should be able to perform various actions in the Your products/services section
      Given user login as Seller
      When user click on product services
      Then various products should be display
      * One of the Approved-In, Review, Rejected options should be visible
      * Product Name, Price, Stock, proviously added products should be displayed
      When product is clicked
      Then update-delete page is displayed
      * Product information should be able to be changed on this page
      * Organic, trade buttons should be functional
      * Update-Delete buttons should be functional
      When update option is clicked
      Then " has been successfully updated" alert should be displayed
      When delete button is clicked
      Then Yes No options should appear and One of the Yes No options should be selected.
      * No option should cancel the operation
      * Yes option should remove the product from the page.
      * alert should be displayed.
