package newFile;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex12{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		File flk=new File("C:\\Users\\Sai\\eclipse-workspace\\Selenium_new\\ExelFile\\16JulyEve.xlsx");
		
		Sheet sheetm = WorkbookFactory.create(flk).getSheet("Sheet2");
		
	int cellva = sheetm.getLastRowNum();
			
		int celltime = sheetm.getRow(0).getLastCellNum()-1;
		System.out.println(celltime);
		System.out.println(cellva);
	
	for(int i=0;i<=cellva;i++)
	{
		for(int j=0; j<=celltime;j++)
		{
			
			CellType dataType = sheetm.getRow(i).getCell(j).getCellType();
			
			
			
			if(dataType==CellType.STRING)
			{
			String value = sheetm.getRow(i).getCell(j).getStringCellValue();	
				System.out.print(value+" ");
			}
			else if(dataType==CellType.NUMERIC)
				
			{
			 double value = sheetm.getRow(i).getCell(j).getNumericCellValue();
			System.out.print(value+" ");
			}
			else if (dataType==CellType.BOOLEAN)
			{
			boolean value = sheetm.getRow(i).getCell(j).getBooleanCellValue();
			System.out.println(value+" ");
				
			}
			
			else if(dataType==CellType.BLANK)
			{
				System.out.println();
			}
			
		}
		System.out.println();
		
	}
	
	
	
	
	
	}

}
