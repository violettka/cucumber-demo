@regression @categories
Feature: Discovery Categories Tests

    Scenario Outline: Discovery page Restaurant Categories
        Given I open a Discovery page in Berlin
        When I click on <menu_option> menu option
        Then I see <category_1> restaurant category
        And I see <category_2> restaurant category

        Examples:
            | menu_option | category_1 | category_2 |  |
            | Discovery   | Asian      | American   |  |
            | Restaurants | Burger     | Chicken    |  |

    @jobs_card
    Scenario: Discovery page "Join our team!" category
        Given I open a Discovery page in Ulm
        When I click on Next button in Join our team! category
        And I click on We want you card in Join our team! category
        Then I see text "Join us" on Jobs page

    @cards_categories
    Scenario Outline: Discovery page categories
        Given I open a Discovery page in Ulm
        When I click on Next button in <categories> category
        Then I should see <cards> card

        Examples:
            | categories                 | cards          |
            | Frequently asked questions | Order together |
            | Join our team!             | We want you!   |
            | Get inspired!              | Facebook       |
