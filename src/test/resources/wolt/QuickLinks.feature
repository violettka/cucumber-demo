@regression
Feature: Explore quick links

    Scenario Outline: Quick links Categories
        Given I open a Discovery page in Berlin
        When I see <quick link> link
        Then I click on <quick link> link
        And On the open page I see the title <header text>
        Examples:
            | quick link            | header text                        |  |
            | Send a gift           | Wolt Gift Card Shop Germany        |  |
            | Legal notice          | Impressum                          |  |
            | User Terms of Service | User Terms of Service and Purchase |  |
 #           | Privacy Policy        | WOLT PRIVACY STATEMENT             |  |

 #   Scenario Outline: Quick links of Privacy Policy
 #       Given I open a Discovery page in Berlin
 #       When I see <quick link> link
 #       Then I click on <quick link> link
 #       Then I click <header module> on header menu
 #       And On the open page I see the title <header text>
 #       Examples:
 #           | quick link     | header module   | header text                                        |
 #           | Privacy Policy | For couriers    | Apply as a Wolt courier now!                       |
 #           | Privacy Policy | For restaurants | Reach new customers and get more orders with Wolt. |
 #           | Privacy Policy | For stores      | Reach new customers and get more orders with Wolt. |
 #           | Privacy Policy | For companies   | Wolt at Work – eating at the office done right     |
 #           | Privacy Policy | Jobs            | Attention all doers                                |
 #           | Privacy Policy | Support         | Wolt help and support                              |
 #           | Privacy Policy | Wolt Drive      | Wolt Drive - last-mile logistics for business      |
