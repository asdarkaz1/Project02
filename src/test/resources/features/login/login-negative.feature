Feature: Unsuccessful Login

    Scenario: Login correct email incorrect password
        Given The user is on the login page
        When The user types "rev_star@revature.net" into the email input
        And The user types "pass4321" into the Password input
        And The user clicks the Sign in button
        Then The user should see an alert saying Invalid Login Information

    Scenario: Login incorrect email correct password
        Given The user is on the login page
        When The user types "bev_star@revature.net" into the email input
        And The user types "pass1234" into the Password input
        And The user clicks the Sign in button
        Then The user should see an alert saying Invalid Login Information