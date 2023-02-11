@regression @UI @US_031
Feature: Check valid and invalid name, surname, email.
Background:
  Given user is on the Urbanic_Farm page
  When user clicks on Register

  Scenario:As a user, I should be able to check valid and invalid name, surname, email.
    And user hover over the first name box
    And user should see the alert
    Then user writes to First name box and checks the valid or red color with invalid message is coming
      | 34rth        |
      |mesut£^       |
      |12klm         |
      |yavuz@t3      |

  Scenario:As a user, I should be able to check valid and invalid name, surname, email.
    And user hover over the Middle name box
    And user should see the alert
    Then user writes to MiddleName  box and checks the valid or red color with invalid message is coming
      | selam54      |
      |£^mesut       |
      |ghr127        |
      |yavuz@t3      |

  Scenario:As a user, I should be able to check valid and invalid Last name
    And user hover over the Last name box
   And user should see the alert
    Then user writes to Last name box and checks the valid or red color with invalid message is coming
      | fatih45        |
      |mesu698         |
      |12klm           |
      |yavuz@t3        |

  Scenario: As a user,I should be able to  enter a valid email with the extensions "@", ".<something>"
    And the user hover over the email box
    Then the user writes a valid email with a black background color
    Then A alert should appear if no valid email has been entered: "Please include an '@' in the email address. "

  Scenario:  Zipcode should contain five digits number
    And the user hover over zip code box and sees "This field should only contains numbers with 5 characters"
    And the user clicks and  gets "This field should only contains numbers with 5 characters" with invalid numbers
    |12k45|
    |02*45|
    |abs12|
    |89hj3|
    |?????|






















