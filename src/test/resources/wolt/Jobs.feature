Feature: Discovery/Jobs Page

  @jobs_card

  Scenario: Discovery page "Join our team!" category

    Given I am opening a Homepage
    When I am clicking on Logo on Homepage
    And I click on Next button in Join our team! category on Discovery page
    And I click on We want you card in Join our team! category on Discovery page
    Then I see text "Join us" on Jobs page
