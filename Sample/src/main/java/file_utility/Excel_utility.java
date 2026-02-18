package file_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility 
{

	public String getExcel(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream("./src/main/resources/testdata/project.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("project");
		Row row = sh.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String data=cell.getStringCellValue();
		return data;
		
	}
	public String getExceldemo(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream("./src/main/resources/testdata/Demo.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("demo");
		Row row = sh.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String data=cell.getStringCellValue();
		return data;
		
	}
	public String getExcelemp(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream("./src/main/resources/testdata/emp.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("emp");
		Row row = sh.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String data=cell.getStringCellValue();
		return data;
		
	}
	
}
