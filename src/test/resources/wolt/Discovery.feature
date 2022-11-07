@regression
Feature: Discovery Page

  Scenario Outline: Discovery page Restaurant Categories
    Given I open a Discovery page in Berlin
    When I click on <menu_option> menu option
    Then I see <category_1> restaurant category
    And I see <category_2> restaurant category

    Examples:
      | menu_option | category_1 | category_2 |  |
      | Discovery   | Asian      | American   |  |
      | Restaurants | Burger     | Chicken    |  |
