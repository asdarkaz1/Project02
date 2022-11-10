Feature: Create Post

  Scenario: Create a New Post
    Given The user is on the Dashboard
    When The user clicks on the Create New Post button
    Then The post form appear
    When The user types a Post Title into the input with
    """
    How To Generate Smart Blog Post Ideas
    """
    When The user types a Post Description into the input field with
    """
    1. Have a writing schedule.
    2. Have a goal, thus targets.
    3. Be passionate about what you’re going to write.
    4. Free up time, so you can brainstorm ideas.
    5. Know your readers or the niche you tapped in.
    6. Don't be desperate.
    7. Learn to like writing.
    """
    When The user presses on the Post button
    Then An Alert says "Your Post Has Successfully Been Created"
    Then The post form disappear
    Then The Post should appear on the Dashboard page
    When The user navigate to the Home page
    Then The Post should appear on the Home page

  Scenario: Create a New Post with a Picture
    Given The user is on the Dashboard
    Given The user is on the Dashboard
    When The user clicks on the Create New Post button
    Then The post form appear
    When The user types a Post Title into the input field with
    """
    This Has To Be The Picture Of The Day
    """
    When The user the Plus (+) icon
    Then The user picture folder from user desktop is pulled
    When The user clicks on a picture
    Then The picture is uploaded to the Post body
    When The user presses on the Post button
    Then An Alert says "Your Post Has Successfully Been Created"
    Then The post form disappear
    Then The Post including the picture should appear on the Dashboard page
    When The user navigate to the Home page
    Then The Post including the picture should appear on the Home page

  Scenario: No Post Title
    Given The user is on the Dashboard
    When The user clicks on the Create New Post button
    Then The post form appear
    When The user types No Post Title into the input field
    When The user types a Post Description into the input field with
    """
    1. A spoken or written representation or account of a person, object, or event.
    2. The action of giving a spoken or written representation or account.
    """
    When The user presses on the Post button
    Then An Alert says "You Must Have a Post Title"
    Then The Post was not created

  Scenario: No Post Body
    Given The user is on the Dashboard
    When The user clicks on the Create New Post button
    Then The post form appear
    When The user types No Post Title into the input field with
    """
    This Post Will Have No Description or Image
    """
    When The user types No Post Description into the input field nor upload an Image
    When The user presses on the Post button
    Then An Alert says "You Must Have a Post Description"
    Then The Post was not created