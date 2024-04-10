package Com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Workbook1.xlsx");
		FileInputStream in = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(in);
		w.createSheet("Login_details").createRow(2).createCell(2).setCellValue("Username");
		w.getSheet("Login_details").getRow(2).createCell(3).setCellValue("Pass");
		w.getSheet("Login_details").createRow(3).createCell(2).setCellValue("priya.sk@gmail.com");
		w.getSheet("Login_details").getRow(3).createCell(3).setCellValue("PriyA@123");
		w.getSheet("Login_details").createRow(4).createCell(2).setCellValue("yogzzpriya.03@gmail.com");
		w.getSheet("Login_details").getRow(4).createCell(3).setCellValue("Poppy1103");
		w.getSheet("Login_details").createRow(5).createCell(2).setCellValue("manigandan1103@gmail.com");
		w.getSheet("Login_details").getRow(5).createCell(3).setCellValue("jash@123");
		FileOutputStream O = new FileOutputStream(f);
		w.write(O);
		System.out.println("Process completed");
		
	}

}
