package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	 
	static String ExcelData(String label, String header) {
		String val = null;
		
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\Datasheet1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("DevopsUniv");
			int noofRows = sheet.getPhysicalNumberOfRows();
			int noofCols = sheet.getRow(0).getLastCellNum();
			System.out.println(noofRows);
			System.out.println(noofCols);
			String[] LabelValue = new String[noofRows];
			String[] HeaderValue = new String[noofCols];
			for(int i = 0; i< noofRows; i++) {
				LabelValue[i] = sheet.getRow(i).getCell(0).getStringCellValue();
				if(LabelValue[i].equalsIgnoreCase(label)) {
					for(int j=0; j<noofCols;j++) {
						HeaderValue[j] = sheet.getRow(0).getCell(j).getStringCellValue();
						if(HeaderValue[j].equalsIgnoreCase(header)) {
							val = sheet.getRow(i).getCell(j).getStringCellValue();
							break;
						}
						
					}
					break;
				}
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
	}
	
	public static void main(String[] args) {
		
		System.out.println(ExcelData("Facebook", "Password"));
			}
}
