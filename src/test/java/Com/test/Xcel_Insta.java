package Com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.main.Base_Class;

public class Xcel_Insta extends Base_Class {
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("C:\\Users\\yogzz\\eclipse-workspace\\Automation_Test\\Excel\\WorkBook1.xlsx");
		FileInputStream in = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(in);
		Sheet s3 = w.getSheetAt(2);
		//name
		Row Uname = s3.getRow(3);
		Cell c = Uname.getCell(2);
		CellType ct = c.getCellType();
		String u1 = c.getStringCellValue();
		
		Row Uname1 = s3.getRow(4);
		Cell c1 = Uname1.getCell(2);
		String u2 = c1.getStringCellValue();
		
		Row Uname2 = s3.getRow(5);
		Cell c2 = Uname2.getCell(2);
		String u3 = c2.getStringCellValue();
		
		//pass
		Row pass = s3.getRow(3);
		Cell C = pass.getCell(3);
		String p1 = C.getStringCellValue();
		
		Row pass1 = s3.getRow(4);
		Cell C1 = pass1.getCell(3);
		String p2 = C1.getStringCellValue();
		
		Row pass2 = s3.getRow(5);
		Cell C2 = pass2.getCell(3);
		String p3 = C2.getStringCellValue();

		browser_Launch();
		maxi();
		url("https://www.instagram.com/");
		//WebElement user = driver.findElement(By.name("username"));
		//WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		//input(pwd, p1);
		//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		//button(login);
		//sleep();
		//screenshot("Login1");
		
		WebElement user1 = driver.findElement(By.name("username"));
		input(user1, u2);
		WebElement pwd1 = driver.findElement(By.xpath("//input[@type='password']"));
		input(pwd1, p2);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		button(login);
		sleep();
		screenshot("login2");
		
		
		//WebElement user2 = driver.findElement(By.name("username"));
		//input(user2, u3);
		//WebElement pwd2 = driver.findElement(By.xpath("//input[@type='password']"));
		//input(pwd2, p3);
		//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		//button(login);
		//sleep();
		//screenshot("login3");
		
		
		
		
		
		
		
		
		
		

	}

}
