Feature: Discovery/Jobs Page

  Background:
    Given I open a Discovery page in Berlin

  @jobs_card
  Scenario: Discovery page "Join our team!" category

    When I click on Next button in Join our team! category
    And I click on We want you card in Join our team! category
    Then I see text "Join us" on Jobs page

  @cards_categories
  Scenario Outline: Discovery page categories

    When I click on Next button in <categories> category
    Then I should see <cards> card in <categories> category

    Examples:
      | categories                 | cards          |
      | Frequently asked questions | Order together |
      | Join our team!             | We want you!   |
      | Get inspired!              | Facebook       |
