package org.launch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {
	
	private void sample() throws IOException  {
		//File Access
		File testData = new File("C:\\Users\\Lenovo\\Desktop\\Sathish Notes\\FrameWork\\testdata.xlsx");
		
		//Accessing Workbook
		Workbook workbook = new XSSFWorkbook();
		
		workbook.createSheet()
		
		

	public static void main(String[] args) throws IOException {
		
		ReadingData data = new ReadingData();
		data.sample();
	}

}
