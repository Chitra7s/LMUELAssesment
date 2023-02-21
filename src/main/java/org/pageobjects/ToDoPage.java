package org.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.Utility;

public class ToDoPage extends Utility {
	public ToDoPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@ng-model='newTodo']")
	private WebElement todobox;

	@FindBy(xpath = "//ul[@class='todo-list']//li")
	private List<WebElement> todolistItems;

	@FindBy(xpath = "//ul[@class='todo-list']//label//preceding-sibling::input")
	private List<WebElement> listCheckboxes;
	
	

	@FindBy(xpath = "//button[@class='destroy']")
	private WebElement deletIcon;
	
	@FindBy(xpath = "//span[@class='todo-count']//strong")
	private WebElement todoCount;
	
	@FindBy(xpath = "//a[text()='Active']")
	private WebElement activeButton;
	
	@FindBy(xpath = "//a[text()='Completed']")
	private WebElement completedbutton;

	public WebElement getTodobox() {
		return todobox;
	}

	public List<WebElement> getTodolistItems() {
		return todolistItems;
	}

	public List<WebElement> getListCheckboxes() {
		return listCheckboxes;
	}

	public WebElement getDeletIcon() {
		return deletIcon;
	}

	public WebElement getTodoCount() {
		return todoCount;
	}

	public WebElement getActiveButton() {
		return activeButton;
	}

	public WebElement getCompletedbutton() {
		return completedbutton;
	}
	
	

}
