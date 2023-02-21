package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pageobjects.ToDoPage;
import org.utilities.Utility;

import io.cucumber.java.en.*;

public class TODOSteps extends Utility {
	static ToDoPage to;
	List<WebElement> listItems;
	int completed_count;

	@Given("The user should be in homepage of application")
	public void the_user_should_be_in_homepage_of_application() {
		Assert.assertTrue("Verify the url of Homepage", getUrl().contains("todo"));
	}

	@When("The user has to enter to do list in a text box and press enter")
	public void the_user_has_to_enter_to_do_list_in_a_text_box_and_press_enter() {
		to = new ToDoPage();
		sendKeys(to.getTodobox(), "Drink tea at 5pm");
		pressEnter();
		sendKeys(to.getTodobox(), "Do jogging at 6PM");
		pressEnter();
		sendKeys(to.getTodobox(), "Complete the office work before 6PM");
		pressEnter();
		sendKeys(to.getTodobox(), "Fix the issue");
		pressEnter();
	}

	@Then("Verify the the item is added in list")
	public void verify_the_the_item_is_added_in_list() {
		listItems = to.getTodolistItems();
		WebElement todoCount = to.getTodoCount();
		Assert.assertEquals("verify the list of items added or not", Integer.parseInt(getText(todoCount)), listItems.size());
		for (WebElement x : listItems) {
			System.out.println(getText(x));
		}
	}

	@When("The user complete the todo work click a completed")
	public void the_user_complete_the_todo_work_click_a_completed() {
		List<WebElement> listCheckboxes = to.getListCheckboxes();

		click(listCheckboxes.get(0));
		click(listCheckboxes.get(2));

	}

	@Then("To verify the item marked as completed or strikeout")
	public void to_verify_the_item_marked_as_completed_or_strikeout() {
		completed_count = 0;
		for (WebElement x : listItems) {
			if (getAttribute(x, "class").contains("completed")) {
				completed_count++;
			}

		}

	}

	@When("The user completes the work will delete that work from the list of items")
	public void the_user_completes_the_work_will_delete_that_work_from_the_list_of_items() {
		moveToElement(listItems.get(0));
		click(to.getDeletIcon());

	}

	@Then("To verify the item was deleted in list of items")
	public void to_verify_the_item_was_deleted_in_list_of_items() {
//		Assert.assertFalse("Veriy the todo lis deleted ", listItems.size());

	}

	@When("The user click the filetring option active it will show only active items")
	public void the_user_click_the_filetring_option_active_it_will_show_only_active_items() {
		click(to.getActiveButton());
		Assert.assertEquals("Only shows active",listItems.size(),Integer.parseInt(getText(to.getTodoCount())));
		System.out.println("Shows Only Active");
		for (WebElement active : listItems) {
			System.out.println(getText(active));
		}
	}

	@When("the user click the completed fipleter it will show only completed items")
	public void the_user_click_the_completed_fipleter_it_will_show_only_completed_items() {
		click(to.getCompletedbutton());
		System.out.println("Shows Only Competed");
		int ct=0;
		for (WebElement x : listItems) {
			if (getAttribute(x, "class").contains("completed")) {
				ct++;
				System.out.println(getText(x));
			}

		}
		Assert.assertEquals("Only shows Completed",listItems.size(),ct);
	}

}
