Feature: Successful Login

    Scenario: Create an account with appropriate credentials
        Given The user is on the login page
        When The user clicks the Sign Up / New Account button
        And The user types "Rev Star" into the Full name input
        And The user types "rev_star@revature.net" into the Email address input
        And The user types "pass1234" into the Password input
        And The user types "pass1234" into the Confirm Password
        And The user clicks the Sign Up button
        Then The user should be on their Profile page

    Scenario: Login with correct credentials
        Given The user is on the login page
        When The user types "rev_star@revature.net" into the Email address input
        And The user types "pass1234" into the Password input
        And The user clicks the Sign in button
        Then the user should be on their Home page
