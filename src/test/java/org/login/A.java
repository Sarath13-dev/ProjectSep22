package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {
	
	public static void main(String[] args) throws  IOException {
		Workbook w = new XSSFWorkbook(new FileInputStream(new File("C:\\June\\Excel.xlsx")));
		String stringCellValue = w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(stringCellValue);
	}

}
