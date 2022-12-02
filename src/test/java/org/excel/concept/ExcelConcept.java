package org.excel.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConcept 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkTasks\\Excel\\Data Sheet 1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook xssfWorkbook = new XSSFWorkbook(stream);
		Sheet sheet = xssfWorkbook.getSheet("Data Sheet");
		
		for (int i = 0; i <sheet.getPhysicalNumberOfRows() ; i++)
		{
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++)
			{
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				switch (cellType) 
				{
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell))
					{
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
						String format = dateFormat.format(dateCellValue);
						System.out.println(format);
					}
					else
					{
						double numericCellValue = cell.getNumericCellValue();
						 long value = (long)numericCellValue;
						 String valueOf = String.valueOf(value);
						 System.out.println(valueOf);
					}
					
					break;

				default:
					break;
				}
				
			}			
		}
		
			
		
		
	}

}
