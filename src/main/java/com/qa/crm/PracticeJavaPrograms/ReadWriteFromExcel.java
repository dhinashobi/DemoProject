package com.qa.crm.PracticeJavaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteFromExcel {
	static FileInputStream fis;
	static XSSFWorkbook xwb;
	static XSSFSheet sheet;
	
	
	public static void readWriteExcel() {
		
		try {
		fis = new FileInputStream("C:\\Users\\dgubend\\Desktop\\Dhina\\Selenium Project\\TestDataPractice1.1.xlsx");
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found replace with another file");
		}
		
		try {
			xwb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet = xwb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();  
		int colCount = sheet.getRow(1).getLastCellNum();
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(j);
				System.out.println(cell);	
			}
		}
	}

	public static void main(String[] args) {
		
		readWriteExcel();

	}

}
