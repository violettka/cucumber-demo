Feature: Country and city location selection

  Scenario: Choose another country and city
    Given I open a Discovery page in Berlin
    When I click logo icon
    Then I should see Homepage

    When I click All countries link
    Then I see list of countries

    When I click Sweden country option
    Then I see list of cities in Sweden

    When I click Malmö city option
    Then I see Malmö Discovery page