Feature: To validate the to do items filed in application

  Scenario: To validate the todo filed
    Given The user should be in homepage of application
    When The user has to enter to do list in a text box and press enter
    Then Verify the the item is added in list
    When The user complete the todo work click a completed
    Then To verify the item marked as completed or strikeout
    When The user completes the work will delete that work from the list of items
    Then To verify the item was deleted in list of items
    When The user click the filetring option active it will show only active items
    And the user click the completed fipleter it will show only completed items
    