Feature: Restaurant menu

  @menu_navigation
  Scenario Outline: Check that menu navigation works correctly
    Given I am on the Restaurant page in Berlin
    When I click <menu category> menu category
    Then I see <menu title> menu title


    Examples:
      | menu category           | menu title
      | LUNCH                   | LUNCH
      | STARTERS & SMALL DISHES | STARTERS & SMALL DISHES
      | SASHIMI                 | SASHIMI
      | HOUSE ROLL              | HOUSE ROLL
