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
Feature:US 057

  Scenario: All menus in the relevant area should be functional and appropriate options should be selected
    Given User Login as Seller
   #When user clicks on user name
   # And user clicks on delivery and pickup settings
    And user clicks on seller flexible

    Then user verifies following ids are visible
      | freeFlexibleDeliveryRange    |
      | minFreeFlexibleDeliveryOrder |
      | perMileCostFlex              |
      | maxFlexibleDeliveryRange     |
      | _deliveryBeginDay            |
      | _deliveryBeginTime           |
      | _deliveryEndDay              |
      | _deliveryEndTime             |
      | _orderByDay                  |
      | _orderByTime                 |





    Then user verifies following ids are clickable

      | freeFlexibleDeliveryRange    |
      | minFreeFlexibleDeliveryOrder |
      | perMileCostFlex              |
      | maxFlexibleDeliveryRange     |
      | _deliveryBeginDay            |
      | _deliveryBeginTime           |
      | _deliveryEndDay              |
      | _deliveryEndTime             |
      | _orderByDay                  |
      | _orderByTime                 |


    Then user should have page that only selected box SellerFlexible
      | #BUYER_PICKUP_FROM_BRANCH |
      | #BUYER_PICKUP             |
      | #SELLER_DELIVERY          |


    Then user verifies on the page that if enter out of boundry alert should be seen

      | -1 | 1001  | #freeFlexibleDeliveryRange    | rgb(206, 212, 218)  |
      | -1 | 10001 | #minFreeFlexibleDeliveryOrder | rgb(206, 212, 218)  |
      | -1 | 6     | #perMileCostFlex              | rgb(206, 212, 218)  |
      | -1 | 1001  | #maxFlexibleDeliveryRange     | rgb(206, 212, 218)) |

    Then user verifies that menu should work with the suitable date and time
      | 1 | #freeFlexibleDeliveryRange    |
      | 1 | #minFreeFlexibleDeliveryOrder |
      | 1 | #perMileCostFlex              |
      | 1 | #maxFlexibleDeliveryRange     |

  Scenario Outline:
    When user selects "<orderBegin>" for orderBegin
    And user enters input to order begin "<beginTime>"
    When user selects "<orderEnd>" for orderEnd
    And user enters input to order end "<endTime>"
    When user selects "<deliverBy>" for deliveryBy
    And user enters input to deliver by "<deliverTime>"
    And user clicks on update button
    Scenarios:
      | orderBegin | beginTime | orderEnd | endTime | deliverBy | deliverTime |
      | 6          | 0303pm    | 3        | 0404pm  | 2         | 0505pm      |
      | 2          | 0303pm    | 3        | 0404pm  | 2         | 0505pm      |
      | 2          | 0303pm    | 2        | 0303pm  | 2         | 0505pm      |