package com.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;

	public static void browser_Launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maxi() {
		driver.manage().window().maximize();
	}

	public static void url(String site) {
		driver.get(site);
	}

	public static void next(String flip) {
		driver.navigate().to(flip);
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void clear(WebElement cl) {
		cl.clear();
	}

	public static void button(WebElement L) {
		L.click();
	}

	public static void input(WebElement e, String l) {
		e.sendKeys(l);
	}

	// sleep
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);

	}

	// dropdown
	public static void drop_down(String options, WebElement elem, String Value) {
		Select ss = new Select(elem);
		if (options.equalsIgnoreCase("Value")) {
			ss.selectByValue(Value);
		} else if (options.equalsIgnoreCase("index")) {
			int n = Integer.parseInt(Value);
			ss.selectByIndex(n);
		} else if (options.equalsIgnoreCase("text")) {
			ss.selectByVisibleText(Value);
		}
	}

	// first selected
	public static void first_selected(WebElement fs) {
		Select S = new Select(fs);
		WebElement ff = S.getFirstSelectedOption();
		String f = ff.getText();
		System.out.println(f);
	}

	// deselect
	public static void deselect(String options, WebElement ds, String Value) {
		Select ss = new Select(ds);
		if (options.equalsIgnoreCase("value")) {
			ss.deselectByValue(Value);
		} else if (options.equalsIgnoreCase("index")) {
			int a = Integer.parseInt(Value);
			ss.deselectByIndex(a);
		} else if (options.equalsIgnoreCase("text")) {
			ss.deselectByValue(Value);
		}
	}

	// screenshot
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\yogzz\\eclipse-workspace\\Automation_Test\\screenshot" + name + ".png");
		FileUtils.copyFile(source, des);

	}

	// Java script executor_click
	public static void javascript_Click(WebElement target) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", target);
	}

	// Java script executor_specific element
	public static void javascript_specelem(WebElement target) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", target);

	}

	// Java script executor_scrollup
	public static void javascript_Scrollup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1500)");
	}

	// Java script executor_scrolldown
	public static void javascript_Scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3500)");
	}

//win handle
	public static void con_Click(WebElement wb) {
		Actions A = new Actions(driver);
		A.contextClick(wb).build().perform();
	}

	public static void dou_Click(WebElement wb) {
		Actions A = new Actions(driver);
		A.doubleClick(wb).build().perform();
	}

	public static void move_To(WebElement wb) {
		Actions A = new Actions(driver);
		A.moveToElement(wb).build().perform();
	}
	public static void robot_Down() throws AWTException {
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		
	}
	public static void robot_Enter() throws AWTException {
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void switch_Windows(int i) {
		Set<String> wh = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(wh);
		 String t = driver.switchTo().window(list.get(i)).getTitle();
		 System.out.println(t);

	}
}
