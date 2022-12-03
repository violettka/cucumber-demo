@regression
Feature: Sign up

    @incorrect_login
    Scenario Outline: Check that it is impossible to register with an incorrect login
        Given I open a Discovery page in Berlin
        When I click on Sign up button
        And I input <email> email
        And I click on Next button
        Then I see error message

    """
    Please enter a valid email.
    """

        Examples:
            | email          |
            | qwertyasdfgh   |
            | 12345040503840 |
            | @#$%^&*()_+*&# |
            | x2xmail.ru     |
            | x2x@mailru     |
            | x2x@mail..ru   |
            | x2x  @mail.ru  |
