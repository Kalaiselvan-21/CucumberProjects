Feature: This is the login feature for Orange HRM
Scenario: Login feature
	Given user is navigating to the login page
	When the user enters valid username as "Admin"
	And the user enters valid password as "admin123"
	Then User should be able to land in Home page
	
