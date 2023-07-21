package newFile;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel_p 
{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File flk=new File("C:\\Users\\Sai\\Selenium\\16JulyEve.xlsx");
		Workbook mybook = WorkbookFactory.create(flk);
		Sheet mysheet = mybook.getSheet("Sheet1");		
	  Row myrao = mysheet.getRow(0);
		Cell mycell = myrao.getCell(0);
				
		
		String cello = mycell.getStringCellValue();
		System.out.println(cello);
		
		System.out.println("====================");
		
		Row myRow1 = mysheet.getRow(0);
		
	String myty = mysheet.getRow(0).getCell(2).getStringCellValue();	
		
		System.out.println(myty);
		
		System.out.println("==============");
		
		
		Row myr = mysheet.getRow(2);
		
		Cell cle = myr.getCell(0);
		String cellt = cle.getStringCellValue();
		System.out.println(cellt);
		
		
		
		
		
		
		
		
	}
}
