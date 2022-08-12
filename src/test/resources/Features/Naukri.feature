#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Naukri feature
  I want to use this template for my feature file
	@Create
  Scenario: Naukri Registraion Process
    Given User Launch Naukri Application
    When User Should click and Enter the Name Required Field
    And User Should click and Enter the Email Required Field
    And User Should click and Enter the Password Required Field
    And User Should click and Enter the Mobile Number Required Field
    And User Should able to click the work status
    Then User Should able to click the RegisterNow for Id Creation
  @Login  
  Scenario: Naukri Login
  	Given User Launch the Naukri Application
  	When User Login the Naukri Application
  	And User Search and Select the Job
  	And User get the jobs 
  	
  	
    

 