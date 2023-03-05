@abd_56
Feature:US_56

  Scenario Outline: US_056_TC_001 Positive Test As a user, after entering valid information,I should be able to perform various actions in the Delivery & Pick up settings  section
    Given user goes to "account/delivery" page after login
    When user clicks Seller delivers the products checkbox
    And  user enters valid or invalid credentials to "<Free Delivery Range>" (mile) textbox
    And  user enters valid or invalid credentials to "<Minimum Order>" textbox
    And  user enters valid or invalid credentials to "<Per Mile Cost>" $ textbox
    And  user enters valid or invalid credentials to "<Maximum Delivery Range>" mile textboxx
    And  user enters valid or invalid credentials to "<Estimated Delivery Time>" menu
    And  user enters valid or invalid credentials to "<Up to>" (mile) menu
    And user clicks plus button and enters valid credentials to Estimated Delivery Time menu and Up to (mile) menu
    Then  user clicks update button and verifies to update succesfully
    Examples:
      | Free Delivery Range | Minimum Order | Per Mile Cost | Maximum Delivery Range | Estimated Delivery Time | Up to |
      | 0                   | 10            | 0             | 1000                   | 1 hour                  | 5     |
      | 1000                | 1000          | 5             | 0                      | 2 hours                 | 20    |
      | 1                   | 10            | 2             | 999                    | 3 hours                 | 35    |
      | 999                 | 990           | 1             | 1                      | 5 hours                 | 98    |
      | 599                 | 500           | 4             | 963                    | 3 day                   | 500   |

  Scenario Outline: US_056_TC_002 Negative Test As a user, after entering invalid information,I should be able to perform various actions in the Delivery & Pick up settings  section

    Given user goes to "account/delivery" page after login
    When user clicks Seller delivers the products checkbox
    And  user enters valid or invalid credentials to "<Free Delivery Range>" (mile) textbox
    And  user enters valid or invalid credentials to "<Minimum Order>" textbox
    And  user enters valid or invalid credentials to "<Per Mile Cost>" $ textbox
    And  user enters valid or invalid credentials to "<Maximum Delivery Range>" mile textboxx
    And  user enters valid or invalid credentials to "<Estimated Delivery Time>" menu
    And  user enters valid or invalid credentials to "<Up to>" (mile) menu
    Then  user clicks update button and verifies "Değer 0 veya daha büyük olmalıdır." error message
    Examples:
      | Free Delivery Range | Minimum Order | Per Mile Cost | Maximum Delivery Range | Estimated Delivery Time | Up to |
      | -1                  | 10            | 0             | 1000                   | 1 hour                  | 5     |
      | 1000                | -999          | 5             | 0                      | 2 hours                 | 20    |
      | 1                   | 10            | -10           | 999                    | 3 hours                 | 35    |
      | 999                 | 990           | 1             | 1                      | 5 hours                 | -9    |
      | 909                 | 9900          | 2             | -1                     | 1 day                   | 11    |

  Scenario Outline: US_056_TC_003 Negative Test As a user, after entering invalid information,I should be able to perform various actions in the Delivery & Pick up settings  section
    Given user goes to "account/delivery" page after login
    When user clicks Seller delivers the products checkbox
    And  user enters valid or invalid credentials to "<Free Delivery Range>" (mile) textbox
    And  user enters valid or invalid credentials to "<Minimum Order>" textbox
    And  user enters valid or invalid credentials to "<Per Mile Cost>" $ textbox
    And  user enters valid or invalid credentials to "<Maximum Delivery Range>" mile textboxx
    And  user enters valid or invalid credentials to "<Estimated Delivery Time>" menu
    And  user enters valid or invalid credentials to "<Up to>" (mile) menu
    Then  user clicks update button and verifies "veya daha küçük olmalıdır." error message
    Examples:
      | Free Delivery Range | Minimum Order | Per Mile Cost | Maximum Delivery Range | Estimated Delivery Time | Up to |
      | 1001                | 10            | 0             | 1000                   | 1 hour                  | 5     |
      | 1000                | 50000         | 5             | 0                      | 2 hours                 | 20    |
      | 1                   | 300           | 6             | 999                    | 3 hours                 | 35    |
      | 999                 | 400           | 4             | 1001                   | 5 hours                 | 40    |


















