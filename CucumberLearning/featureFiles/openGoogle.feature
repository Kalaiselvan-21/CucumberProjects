Feature: this is to test Google search
Scenario: Google search scenario
		Given user is entering google.co.in
		When user is typing the search terms "LinkedIn"
		And enters the return key
		Then the user should see the search results
		