#  As a user, I should be able to click on the notifications button and perform various actions
#
#


Feature: As a user, I should be able to click on the notifications button and perform various actions
  Scenario: Notification button
  user clicks notification icon and see notification page
  there should be an option View All if  there is no any notifications
  if there is any notification listed there should be options as "mark all as read" "view all" and "mark read"
  there should be opntion to make notification read or unread

#    Given user login as BuyerHuseyin
#    Then user clicks on notifications
#    Then user verifies that the notications header
#    Then user verifies view all option if there is no notifications
    Given user login as Buyer
    Then user verifies options should be visible and functional if there are notifications
        | filter by unread | mark all as read | view all | mark read |
    Then user verifies options visible and functional
        | make notification read | make notification unread |