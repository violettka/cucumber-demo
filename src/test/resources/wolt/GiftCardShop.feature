Feature: Explore Wolt Gift Card Shop

    Scenario Outline: Unregistered user, create a Gift Card
        Given I open Gift card shop in Berlin in Germany
        And On the open page I see the title Wolt Gift Card Shop Germany

        When I click on <value> Card
        Then I see <Wolt Guthaben> pop-up

        When I click on Add To Order Button
        Then I see Login To Order Button
        And I Remove from order Gift Card

        Examples:
            | value  | Wolt Guthaben     |  |
            | €10.00 | 10€ Wolt Guthaben |  |
            | €20.00 | 10€ Wolt Guthaben |  |
