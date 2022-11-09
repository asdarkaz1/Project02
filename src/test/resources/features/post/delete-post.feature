Feature: Delete Post

  Scenario: Delete a Post
    Given The user is on the Dashboard
    When The user clicks on the Delete icon (bin image)
    Then A modal pop up with a "Confirm Deletion" and a "Cancel" button
    When The user presses on the Delete button
    Then An Alert says "Your Post Has Successfully Been Deleted"
    Then The modal closes