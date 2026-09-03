#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments


Feature: Dashboard Page

	Background:
    Given Login in as a User
    When Enter Valid Credentials with succesful login 

	@smoke @sanity
  Scenario: Validate Dashbaord page
    Then Validate the Dashboard Page with "Testing"
