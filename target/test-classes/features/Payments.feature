#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

Feature: Payments Page

	@smoke
  Scenario: Payments Page Functionaility
    Given Login in as a User 
    When Enter Valid Credentials with succesful login
    Then Validate the Payments Page
