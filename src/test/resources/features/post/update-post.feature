Feature: Update Post

  Scenario: Update a Post
    Given The user is on the Dashboard
    When The user clicks on the update icon (pen image)
    Then The user is directed to the "Update Post Page"
    When The user types in or remove from the Post Title text field
    When The user types in or remove from the Post Body field
    When The user presses on the Update button
    Then An Alert says "Your Post Has Successfully Been Updated"
    Then The Updated Post should appear on the Dashboard page
    When The user navigate to the Home page
    Then The Updated Post should appear on the Home page

  Scenario:  Cancel Post Update
    Given The user is on the Dashboard
    When The user clicks on the update icon (pen image)
    Then The user is directed to the "Update Post Page"
    When The user types in or remove from the Post Title text field
    When The user types in or remove from the Post Body field
    When The user presses on the Cancel button
    Then The user is directed to the "Dashboard"
    Then The Post should not be Updated on the Dashboard page
    When The user navigate to the Home page
    Then The Post should not be Updated on to the Home page
