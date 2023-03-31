@DCP-537
Feature:  As a user, I can multiply two numbers
@TEST_DCP-500
Scenario: simple integer multiplication
        Given I have entered 3 into the calculator
        And I have entered 1 into the calculator
        When I press multiply
        Then the result should be 3 on the screen
