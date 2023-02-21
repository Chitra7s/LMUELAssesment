$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/todo.feature");
formatter.feature({
  "name": "To validate the to do items filed in application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the todo filed",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in homepage of application",
  "keyword": "Given "
});
formatter.match({
  "location": "TODOSteps.the_user_should_be_in_homepage_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to enter to do list in a text box and press enter",
  "keyword": "When "
});
formatter.match({
  "location": "TODOSteps.the_user_has_to_enter_to_do_list_in_a_text_box_and_press_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the the item is added in list",
  "keyword": "Then "
});
formatter.match({
  "location": "TODOSteps.verify_the_the_item_is_added_in_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user complete the todo work click a completed",
  "keyword": "When "
});
formatter.match({
  "location": "TODOSteps.the_user_complete_the_todo_work_click_a_completed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify the item marked as completed or strikeout",
  "keyword": "Then "
});
formatter.match({
  "location": "TODOSteps.to_verify_the_item_marked_as_completed_or_strikeout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user completes the work will delete that work from the list of items",
  "keyword": "When "
});
formatter.match({
  "location": "TODOSteps.the_user_completes_the_work_will_delete_that_work_from_the_list_of_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify the item was deleted in list of items",
  "keyword": "Then "
});
formatter.match({
  "location": "TODOSteps.to_verify_the_item_was_deleted_in_list_of_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the filetring option active it will show only active items",
  "keyword": "When "
});
formatter.match({
  "location": "TODOSteps.the_user_click_the_filetring_option_active_it_will_show_only_active_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click the completed fipleter it will show only completed items",
  "keyword": "And "
});
formatter.match({
  "location": "TODOSteps.the_user_click_the_completed_fipleter_it_will_show_only_completed_items()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});