
Feature: Profile

  Scenario: New User Creates Profile
    Given The user is on the home page.
    When  The user clicks sign up.
    Then  The user will be navigated to the profile page.
    When  The user types in "Jasdhir" in the First Name and "Singh" in Last Name.
    When  The user types in "JSingh@revature.net".
    When  The user selects "coding".
    When  The user presses "submit".
    Then  The user will be navigated to the home page.

  @profile
  Scenario: Registered User Updates Profile
    Given The user is on the homepage.
    When  The user clicks login and types in their credentials.
    Then  The user should be navigated to their profile page.
    When  The user clicks on edit button on the profile page.
    Then  The user should be able to edit their profile "username" and "interests".
    When  The user presses submit, their information should be saved.
    Then  The user is navigated to their home page with the updated information.

  Scenario: A Registered user resets their choices on the Profile page
    Given The user has logged in.
    When  The user changes their interests from "coding" to "travel".
    When  The user presses reset.
    Then  The user should see the fields repopulate to their original values.

  Scenario: Registered types in custom interests.
    Given The user is on the homepage.
    When  The user clicks login and types in their credentials.
    Then  The user should be navigated to their profile page.
    When  The user clicks on edit button on the profile page.
    Then  The user edits their interest to "basket weaving".
    When  The user presses submit, their information should be saved.
    Then  The user is navigated to their home page with the custom interest.

  Scenario: Guest user is directed to their news feed.
    Given A user signs in as guest.
    Then  The user should be navigated directly to their profile page.
