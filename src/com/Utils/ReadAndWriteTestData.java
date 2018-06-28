package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteTestData {
	
	
	
	@SuppressWarnings({ "resource", "deprecation" })
	public static String getCellData(int RowNum,int CellNum) throws IOException{
					
            String home = System.getProperty("user.dir");
			
			File file = new File(home+"/Test Data/TestData.xlsx");
			
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
						
			XSSFSheet s  = wb.getSheetAt(0);
			
			Row row = s.getRow(RowNum);
			
			Cell cell = row.getCell(CellNum);
			
			cell.setCellType(Cell.CELL_TYPE_STRING);
			
			try {
			
			String CellData = cell.getStringCellValue();
			

			
			return CellData;
			
		} catch (NumberFormatException e) {
			
			String CellData = cell.getStringCellValue()+"";
			
			return CellData;
			
		}
			
		}
						
		
//	}
	
	
	public static void main(String agrs[]) throws InvalidFormatException, IOException{
		
//		ReadAndWriteTestData objectFile = new ReadAndWriteTestData();
		
		String BrowserName = getCellData(1, 0);
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		System.out.println(BrowserName+userName+password);
		
	}

}
