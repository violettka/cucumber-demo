@regression
Feature: Explore quick links

    Scenario Outline: Quick links Categories
        Given I open a Discovery page in Berlin
        When I see <quick link> link
        Then I click on <quick link> link
        And On the open page I see the title <header text>

        Examples:
            | quick link                         | header text                        |  |
            | Send a gift                        | Wolt Gift Card Shop Germany        |  |
            | Legal notice                       | Impressum                          |  |
            | User Terms of Service and Purchase | User Terms of Service and Purchase |  |
