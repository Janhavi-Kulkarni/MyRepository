package com.goolepage.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/* This class read data from excel and pass it to ScriptUtil as a stored result*/

public class ExcelReader {
	
	
	public static String datacontent;

	public String readExcel() throws FileNotFoundException
	{
		//initialoze file for reading data,provide file path
		File fi=new File("./GoogleSearch/SearchData.xlsx");
		FileReader fread=new FileReader(fi);
		

		//initialize workbook and sheet to read data
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.getSheetAt(0);
		
		//find total number of rows in sheet
		int row=sh.getPhysicalNumberOfRows();
		
		//code to retrive data from sheet
		for(int i=0;i<row;i++)
		{
			String datacontent=sh.getRow(row).getCell(0).getStringCellValue();
			
			
		}
		return datacontent;
	}

}
