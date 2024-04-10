package Com.test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Base_Class;

public class Task_1 extends Base_Class {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		browser_Launch();
		maxi();
		url("https://www.amazon.in/");
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		con_Click(mob);
		robot_Down();
		robot_Enter();
		WebElement minitv = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		con_Click(minitv);
		robot_Down();
		robot_Enter();
		switch_Windows(0);
		switch_Windows(1);
		switch_Windows(2);
		sleep();
		WebElement box = driver.findElement(By.xpath("(//span[text()='Made for Amazon'])[2]"));
		button(box);
		WebElement prod = driver.findElement(By.xpath(
				"//span[contains(text(),'Tukzer Universal Stylus Pen for Smartphone/Tablet/iPad/Pro/Air/iPhone/iOS/Android/All Touch Screens Devices| Fine Point Disc Tip, Lightweight Aluminum Body Magnetic Cap Drawing Writing (G')]"));
		javascript_specelem(prod);
		sleep();
		javascript_Click(prod);
		switch_Windows(3);
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		javascript_Click(checkbox);
		sleep();
		WebElement qty = driver.findElement(By.id("quantity"));
		drop_down("Value", qty, "2");
		WebElement cart = driver.findElement(By.xpath("//input[@type='button']"));
		button(cart);
		screenshot("cart_order");

	}

}
