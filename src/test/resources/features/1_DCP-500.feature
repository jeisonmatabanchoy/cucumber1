@DCP-537
Feature: simple integer addition

	@TEST_DCP-500
	Scenario: simple integer addition
		Given I have entered 1 into the calculator
		And I have entered 2 into the calculator
		When I press add
		Then the result should be 3 on the screen
