Feature: Discovery Page


  Scenario: Discovery page Join our team! category

    Given I open a Discovery Page in Berlin
    When I click on NextBtn
    And I click on WeWantYouCard Join our team! category
    Then I see CategoryField on JobsPage