package repository;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainRepository {

	
	public static String Exceldata(String excelFileName,String SheetName, String columnName, String RowId) throws IOException{
		
			String op=null;
			FileInputStream xlxsFile =new FileInputStream(excelFileName);
			XSSFWorkbook workbook = new XSSFWorkbook(xlxsFile);
			XSSFSheet sheet = workbook.getSheet(SheetName);
			boolean columnFound = false ;
			boolean profileFound = false;
			int columnNumber  = -1;
			int rowNumber = -1;
			
			int intTotalColumnCount = sheet.getRow(0).getLastCellNum();
			int intTotalRowCount=sheet.getLastRowNum();
			for(int firstRow=0;firstRow<=intTotalColumnCount;firstRow++)
			{
				String nameString=sheet.getRow(0).getCell(firstRow).getStringCellValue();
				if(nameString.equals(columnName))
				{
					columnFound=true;
					columnNumber=firstRow;
					break;
				}
			}
			
		for(int profileCount=0;profileCount<=intTotalRowCount;profileCount++)
		{
			String profileName=sheet.getRow(profileCount).getCell(0).getStringCellValue();
			if(profileName.equals(RowId))
			{
				profileFound=true;
				rowNumber=profileCount;
				break;
			}
		}
		
		if(profileFound && columnFound)
		{
			op=sheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
			
		}
		return op;
	}
}
