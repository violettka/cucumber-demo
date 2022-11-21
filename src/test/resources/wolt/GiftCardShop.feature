@regression
Feature: Explore Wolt Gift Card Shop

    Scenario Outline: Unregistered user, create a Gift Card
        Given I open Gift card shop in Berlin
        And On the open page I see the title Wolt Gift Card Shop Germany

        When I click on <value> Card
        Then I see <Wolt Guthaben> pop-up

        When I click on Add To Order Button
        Then I see Login To Order Button
        And I Remove from order Gift Card

        Examples:
            | value  | Wolt Guthaben     |  |
            | €10.00 | 10€ Wolt Guthaben |  |
            | €20.00 | 20€ Wolt Guthaben |  |

    @DataTableTest
    Scenario: Unregistered user, create few Gift Cards
        Given I open Gift card shop in Berlin
        And On the open page I see the title Wolt Gift Card Shop Germany

        When I select a Gift Card with values:
            | €10.00 | 2 |
        And I click on Add To Order Button
        Then I see Login To Order Button
