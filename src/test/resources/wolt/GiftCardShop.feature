Feature: Explore Wolt Gift Card Shop

    Scenario: Where on the Wolt Gift Card Shop page we need registration
        Given I open Wolt Homepage
        Then I choose Berlin in Germany
        And I see a Discovery page

        When I click on Send a gift link
        Then I click on VenueInformation Button
        And I see the City Map Pop-up

        Then I click on Login Button
        And I see the Create an account or log in Pop-up

        Then I click on Favorite Button
        And I see the Create an account or log in Pop-up



