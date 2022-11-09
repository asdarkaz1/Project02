Feature: Create Comment

  Scenario: Create a Comment
    Given The user is on the Home page
    When The user clicks on a Post
    Then The user is directed to the "Comment Page"
    When The user types a Comment into the input field with
    """
    This has to be one of the greater Post I have come across today!
    """
    When The user presses on the Comment button
    Then An Alert says "Your Comment Has Successfully Been Created"
    Then The Newly created Comment should appear at the bottom of the existing comments on the Comment Page under the respective Post