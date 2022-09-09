package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\June\\Excel.xlsx");
	FileInputStream is = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(is);
	Sheet s = w.getSheet("Sheet1");
	Sheet s1 = w.createSheet("Sheet2");
	for(int i=0; i<s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		Row r1 = s1.createRow(i);
		for(int j=0; j<r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			Cell c1 = r1.createCell(j);
			String stringCellValue = c.getStringCellValue();
			c1.setCellValue(stringCellValue);
		}
	}
	FileOutputStream out = new FileOutputStream(f);
	w.write(out);
}
}
