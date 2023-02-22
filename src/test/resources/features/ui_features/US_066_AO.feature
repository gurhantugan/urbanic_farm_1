

#The user should be able to perform various operations in the basket.
#QUANTITY can be increased
#Are you sure you want to delete the product? warning should appear
#According to the Yes/No options, the alternatives should see the correct results.
#Total should change in product wraps
#It should give total correct results in product increases.


Feature: US_066 As a user, after entering valid information, I should be able to perform various actions in the Welcome Page

  Background: The user should be able to perform various operations in the basket.
  Given user goes to "basket" page after login as a buyer

  @US_066_TC_001
  Scenario: TC_001 Adding item to basket
    And user clicks on Add to Card button
    When user clicks on plus button
    And quantity should be increased
    Then user should see total correct results in product increases

  @US_066_TC_002
  Scenario: TC_002 Deleting item from basket
    When user clicks on delete button
    Then user should see message "Are you sure you want to delete the product?"

  @US_066_TC_003
  Scenario: TC_003 Deleting and cancelling item from basket
    When user clicks on delete button
    And user clicks on Yes button
    Then user verifies the item deleted from cart
    Then user should see Total change in product wraps
    When user clicks on delete button
    And user clicks on No button
    Then user verifies the item does not delete from cart










