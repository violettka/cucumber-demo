Feature: Country and city location selection

    @city_country
    Scenario Outline: Choose different countries and cities
        Given I am on the Homepage
        When I click All countries link
        Then I see list of countries

        When I click <country> country option
        Then I see list of cities in <country>

        When I click <city> city option
        Then I see <city> Discovery page

        Examples:
            | country | city      |  |
            | Sweden  | Malmö     |  |
            | Sweden  | Stockholm |  |
            | Poland  | Gdańsk    |  |

    @city
    Scenario: Check city selection
        Given I am on the Homepage
        Then I see list of cities in Germany

        When I click Bonn city option
        Then I see Bonn Discovery page
