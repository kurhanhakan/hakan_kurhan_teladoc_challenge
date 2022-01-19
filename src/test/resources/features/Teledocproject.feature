Feature: Teledoc Project

  #Background:
  #	Given User able to navigate to website
  Scenario Outline: Adding User
    When User able to click add button
    And User able provide "<name>", "<lastName>", "<username>", "<password>"
    And User able to pick company
    And User able to pick role
    And User able provide "<email>","<mobile>"
    And User able to click save
    Then User able to validate "<username>"

    Examples: 
      | name  | lastName | username    | password | email          | mobile     |
      | Hakan | Kurhan   | hakankurhan |   123456 | test@testo.com | 6575311501 |

  Scenario: Delete User Novak
    Given user able to delete username
    Then user validates user removed "novak"
