@US_049

Feature: Address

  US:
  As a user, after entering valid information, I should be able to perform various actions in the Address section

  AC 1:
  In the Add New Address page;
  "Address Title, Address, State,City, Post/Zip and Mark as delivery address,
  Mark as sales address options should appear"
  AC 2:
  All titles and menus must be functional and additable
  AC 3:
  After adding the address, the warning Your address has been successfully added should appear.
  AC 4:
  The added address should appear in the relevant section according to the selected transaction
  (Delivery address or My Sales address)

  Background: User should be on add new address page
    Given User goes to Home Page
    When User clicks the login link
    Then User enters valid email address
    Then User enters valid password
    Then User clicks the login button
    Then User clicks the account home button
    Then User clicks the address button on left column
    Then User clicks add new address button
    Then user clicks search places text box
    Then user enters the part of address
    Then user selects the address from opened menu

  @US_049-TC001
  Scenario: Address Title, Address, State,City, Post/Zip and Mark as delivery address,
  Mark as sales address options should appear

    Then user asserts variable titles are visible
      | Address Title*   |
      | Address*         |
      | State*           |
      | City*            |
      | Postal/Zip*      |
      | delivery address |
      | sales address    |

  @US_049-TC002
  Scenario: All titles and menus must be functional and additable

    Then user asserts all titles and menus must be functional and additable
      | addressTitle           |
      | address                |
      | states                 |
      | citiesDataIdAddAddress |
      | postal                 |
      | isDefault              |
      | isSellerAddress        |

  @US_049-TC003
  Scenario: After click the submit button, the warning Your address has been successfully added should appear.

    Then user clicks submit button
    Then user asserts Your address has been successfully added should appear


  @US_049-TC004
  Scenario: The added address should appear in the relevant section according to the selected transaction
  (Delivery address or My Sales address)

    Then user selects Mark as a delivery address
    Then user clicks submit button
    Then user asserts Your address has been successfully added should appear
    Then user clicks delivery address button
    Then user asserts delivery address is visible

  @US_049-TC005
  Scenario: The added address should appear in the relevant section according to the selected transaction
  (Delivery address or My Sales address)

    Then user selects Mark as a sales address
    Then user clicks submit button
    Then user asserts Your address has been successfully added should appear
    Then user clicks my sales address button
    Then user asserts sales address is visible











