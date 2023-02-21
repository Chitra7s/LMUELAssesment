package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver;

	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void openUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static String getUrl() {
		return driver.getCurrentUrl();
	}

	public static String getText(WebElement e) {
		return e.getText();
	}

	public static String getAttribute(WebElement e, String attr) {
		return e.getAttribute(attr);
	}

	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void sendKeys(WebElement e, String va) {
		try {
			e.sendKeys(va);
		} catch (Exception ex) {
			jsSendKeys(e, va);
		}
	}

	public void pressEnter() {
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void jsSendKeys(WebElement ee, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + value + "')", ee);
	}

	public static void takesScreenShot(String file) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File ss = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + file + ".png"));
	}

	public static String getPropertyValue(String key) {
		String va = null;
		Properties p = new Properties();
		try {
			p.load(new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Config\\config.properties"));
			va = p.get(key).toString();
		} catch (IOException e) {
		}
		return va;
	}
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
}
