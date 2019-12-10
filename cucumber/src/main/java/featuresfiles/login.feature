Feature: Verify OrangeHRM


Scenario: OrangeHrm
Given OpenHRM WebPage 
Then User verified home page
	And verify user name
	And verify password
When I Enter user name
	And Enter password
	And Click on login
Then Check OrangeHRM Page
	And Click on logout