@Registration
Feature: As a site visitor
I want to go to the registration page to add my all information
 so that i can access my account regualarly
Scenario: Register a user succesfully

Given as a user i am on www.macys.com registration page.
When I enter First name,last name,user id ,password, confirm password
And i click on create account button
Then i received a user registration confirmation
