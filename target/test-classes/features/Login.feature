#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

Feature: Login Functionality

	Background:
	  Given Launch the Application URL
    When Click on Login button
    
	@smoke
  Scenario: Validate the Login Page
    Then Verify the Login Page
  
  Scenario Outline:
  And Enter valid "<user>" and "<password>"
  Then Verify the Login Page
  
  Examples:
  |  user   					|  password 		|
  |  cnr465@xyz.com		|  cnr@123			|
  |	 Raman@man.com		|	 man@456      |
  |  Rajan@yamn.com   |  Ranja@yaman20|
  
  Scenario: Validate with Data Table Example
  Given Launch the Application URL
  When validate with below Data
  | firstName | lastName | emailID      | student | location |
  | chandra   | Narayana | cnr45@xyz.com| Yes     | Hyd      |
  | rajan     | Ranjan   | ran@67.com   | No      | Banglore |
  | GanGan    | Raju     | gang@raj.com | Yes     | Checnnai |
  Then Verify the Login Page
  
   
  Scenario: validate with File path Details
  Given Launch the Application URL
  When Enter the File Path Details
  | Login     | src\test\resources\filePaths\login.txt     |
  | Dashboard | src\test\resources\filePaths\userCount.txt |
  Then Validate the Fiels and print Details
  
  @smoke @DB
  Scenario Outline: Read the properties file
  Given Read the Properties file
  When Read the db vallues from properties "<filePath>"
  Then Prepare for the JDBC login with Oracle DB
  Examples:
  |filePath|
  |src\test\resources\configs\config.properties|
  
  @DB @smoke
  Scenario: Connect to JDBC with Oracle
  Given Make Connectino with JDBC using Oracle
  When Pass the Credentials
  Then Verify the Connection is Established or not
  And read teh Dept Details and Print

  
  
  
  
  
    
    
    
    
    
    
