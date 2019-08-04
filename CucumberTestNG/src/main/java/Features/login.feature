Feature: Free CRM Login feature

Scenario Outline: Free CRM Login test Scenario

Given user is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on the home page
Then close the browser

Examples:
	|username|password|
	|yswathi |test@123|