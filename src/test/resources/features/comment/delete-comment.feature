Feature: Delete Comment

  Scenario: Delete a Comment
    Given The user is on the Comment page
    When The user clicks on a Comment
    Then A modal should appear
    Then The user Should see an "Update", a "Delete", and a "Cancel" button
    When The user presses on the Delete button
    Then An Alert says "Your Comment Has Successfully Been Deleted"
    Then The user should no longer see the Comment under the respective Post