package FirstDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ddt2 
{
	public static void main (String args[]) throws FileNotFoundException
	{
		FileInputStream f1= new FileInputStream ("C:\\Users\\windows\\eclipse-workspace\\SeleniumDemo\\src");
		Workbook w1= WorkbookFactory.create("C:\\Users\\windows\\eclipse-workspace\\SeleniumDemo\\src");
		String username= w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String password= w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		//write login prog below to login
		
		}
	}

}
