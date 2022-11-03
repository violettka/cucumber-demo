Feature: Sign up

  @incorrect_login
  Scenario Outline: Check that it is impossible to register with an incorrect login
    Given I open a Discovery page in Berlin
    When I click on Sign up button
    And I input <incorrect login> incorrect email
    And I click on Next button
    Then I see error message

    Examples:
      | incorrect login   |
      | fjkksoifjglsfomnj |
      | 12345040503840303 |
      | @#$%^&*()_+*&&&## |