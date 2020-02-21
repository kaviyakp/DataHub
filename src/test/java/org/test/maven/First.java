package org.test.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class First {
	public static void main(String[] args) throws IOException {
File f=new File("C:\\Users\\kavi\\eclipse-workspace\\Kavi\\framework\\MavenFirst\\TestData\\file.xlsx");
FileInputStream s = new FileInputStream(f);//To convert into java obj
Workbook w = new XSSFWorkbook(s);//to refer workbook
Sheet ss = w.getSheet("Sheet1");//to refer sheet
Row r = ss.getRow(1);//to get row value
Cell c= r.getCell(1);//to get cell value
System.out.println(c);//to print the particular cell value
	}
}
