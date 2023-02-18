
#Delivery type-Seller flexible delivery
#All menus in the relevant area should be functional and appropriate options should be selected.
#Free Delivery Range (mile) should be 0-1000. Alert should be seen on different selections
#Minimum Order Amount For Free Delivery($) should be 0-10000. Alert should be seen on different selections
#Per Mile Cost ($) should be 0-5. Alert should be seen in different selections
#Maximum Delivery Range (mile) should be 0-1000. Alert should be seen on different selections
#A suitable day must be selected for the Order Begin menu.
#Time menu should work correctly
#A suitable day must be selected for the Order End menu.
#Time menu should work correctly
#A suitable day must be selected for the Deliver By menu
#Time menu should work correctly
#Your delivery settings have been succesfully updated alert should appear
@US_57_SK
  Feature:
  Background:
  Given User Login as Seller
    When user clicks on user name
    And user clicks on delivery and pickup settings
    And user clicks on seller flexible

    Scenario: TC001 - visibility & functionality
      Then user verifies following ids are visible
      |freeFlexibleDeliveryRange|
      |perMileCostFlex|
      |minFreeFlexibleDeliveryOrder|
      |minFreeFlexibleDeliveryOrder|
      |_deliveryBeginDay|
      |_deliveryEndDay|
      |_orderByDay|
      |_deliveryBeginTime|
      |_deliveryEndTime|
      |_orderByTime|
      |_deliveryEndDay|
      |_orderByDay|
      |_deliveryBeginTime|
      |_deliveryEndTime|
      |_orderByTime|
      Then user verifies following ids are clickable

