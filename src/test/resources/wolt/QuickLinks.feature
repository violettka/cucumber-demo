@regression
Feature: Explore quick links

    Scenario Outline: Quick links Categories
        Given I see <quick link> link on Discovery Page in Berlin
        When I click on <quick link> link
        And On the open page I see the title <header text>
        Examples:
            | quick link            | header text                        |  |
            | Send a gift           | Wolt Gift Card Shop Germany        |  |
            | Legal notice          | Impressum                          |  |
            | User Terms of Service | User Terms of Service and Purchase |  |
