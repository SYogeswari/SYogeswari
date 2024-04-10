package Com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Base_Class;

public class Mvn1_Project extends Base_Class {
	public static void main(String[] args) throws IOException, InterruptedException {
		browser_Launch();
		maxi();
		url("https://demoqa.com/select-menu");
		WebElement clr = driver.findElement(By.id("oldSelectMenu"));
		drop_down("text", clr, "Black");
		WebElement cars = driver.findElement(By.id("cars"));
		drop_down("index", cars, "3");
		sleep();
		deselect("value", cars, "audi");
	}

}
