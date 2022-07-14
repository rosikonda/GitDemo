Feature: Application Login  

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into the application with "Arun" and password "1234"
Then Home Page is populated
And cards displayed are "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into the application with "cnu" and password "4321"
Then Home Page is populated
And cards displayed are "false"

