Feature:

    Scenario: Fill in the Form with not Valid Credentials
        Given User on Get started with Wolt at Work Page
        And On the open page User sees the title

        When User enters Credentials to the form
            | test@test.test | Examle Inc. |
        Then User clicks on contact Us Button
        And User sees Contact Form
#        And User sees entered Credentials


