package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		 // read multiple data/value from sheet
		
		for(int i=1; i<=5; i++) {
			FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);//make the file ready 
			Sheet sheet = wb.getSheet("IPL");// provide sheet name
			  Row row = sheet.getRow(i);//get the desired row
			Cell cell = row.getCell(0);// get into the desired cell/column
			String data = cell.getStringCellValue();// it will read the value
			Thread.sleep(2000);
			System.out.println(data);
			
			
		}
	}
}


