Feature: Interests

  Scenario: User should see posts on their timeline based on their interests
    Given The user is signed into their account.
    When  The user clicks the submit button on the profile page.
    Then  The user should be navigated to a news feed with the interests as the title.


  Scenario: Guests should be directed to a default newsfeed.
    Given A user is logged in as guest.
    Then  The user should be navigated to a default news feed with no interests as the title.