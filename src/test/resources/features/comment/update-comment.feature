Feature: Update Comment

  Scenario: Update a Comment
    Given The user is on the Comment page
    When The user clicks on a Comment
    Then A modal should appear
    Then The user Should see an "Update", a "Delete", and a "Cancel" button
    When The user types in or remove from the Comment input field
    When The user presses on the Update button
    Then An Alert says "Your Comment Has Successfully Been Updated"
    Then The user is able to see the Updated Comment under the respective Post