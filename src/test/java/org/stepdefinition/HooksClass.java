package org.stepdefinition;

import java.io.IOException;

import org.utilities.Utility;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class HooksClass extends Utility {

	@Before
	public void setup() {
		openBrowser();
		openUrl(getPropertyValue("url"));
		implicitWait(20);
		

	}
	
	@After
	public void tearDown(Scenario sc) throws IOException {
		takesScreenShot(sc.getName());
		closeBrowser();
	}
}
