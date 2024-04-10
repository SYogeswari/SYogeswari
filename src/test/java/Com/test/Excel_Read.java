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

public class Excel_Read {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\yogzz\\eclipse-workspace\\Automation_Test\\Excel\\WorkBook1.xlsx");
		FileInputStream in = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(in);
		Sheet Sh = w.getSheet("Sheet1");
		Row r = Sh.getRow(1);
		Row r1 = Sh.getRow(1);
		Cell C = r.getCell(2);
		Cell C1 = r1.getCell(3);
		CellType ct = C.getCellType();
		CellType ct1 = C1.getCellType();
		System.out.println("Maths & Science");
		System.out.println("1. Aarthi scores");

		if (ct.equals(ct.STRING)) {
			String S = C.getStringCellValue();
			System.out.println(S);
		} else if (ct.equals(ct.NUMERIC)) {
			double N = C.getNumericCellValue();
			int m = (int) N;
			System.out.println(m);

		}
		if (ct1.equals(ct1.STRING)) {
			String S1 = C1.getStringCellValue();
			System.out.println(S1);
		} else if (ct1.equals(ct1.NUMERIC)) {
			double N1 = C1.getNumericCellValue();
			int m1 = (int) N1;
			System.out.println(m1);
		}

		Row R = Sh.getRow(2);
		Row R1 = Sh.getRow(2);
		Cell c = R.getCell(2);
		Cell c1 = R1.getCell(3);
		CellType CT = c.getCellType();
		CellType CT1 = c1.getCellType();
		System.out.println();
		System.out.println("2. Prakash scores");
		if (CT.equals(CT.STRING)) {
			String S2 = c.getStringCellValue();
			System.out.println(S2);
		} else if (CT.equals(CT.NUMERIC)) {
			double N2 = c.getNumericCellValue();
			int m2 = (int) N2;
			System.out.println(m2);
		}
		if (CT1.equals(CT1.STRING)) {
			String S3 = c1.getStringCellValue();
			System.out.println(S3);
		} else if (CT1.equals(CT1.NUMERIC)) {
			double N3 = c1.getNumericCellValue();
			int m3 = (int) N3;
			System.out.println(m3);
		}
	}
}
