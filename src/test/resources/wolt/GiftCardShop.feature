Feature: Explore Wolt Gift Card Shop

    Scenario: Where on the Wolt Gift Card Shop page we need registration
        Given I open Wolt Homepage
        Then I choose Berlin in Germany
        And I see a Discovery page

        When I click on Send a gift link
        Then I click on VenueInformation Button
        And I close the City Map Pop-up

        Then I click on Login Button
        And I close the Create an account or log Pop-up

        Then I click on Favorite Button
        And I close the Create an account or log Pop-up

        Then I see 10€ Wolt Guthaben Card and click on it
        And I close Gift Card Pop-up

        Then I see 10€ Wolt Guthaben Card and click on it
        Then I click on Add To Order Button
        Then I click on Login To Order Button
        And I close the Create an account or log Pop-up
        And I Remove from order Gift Card

        Then I click on Gifts Categories
        And I see Gifts page

