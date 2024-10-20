package FirstDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class DDT1 
{
public static void main (String args[]) throws FileNotFoundException
{
	FileInputStream f1= new FileInputStream ();
	Workbook w1= WorkbookFactory.create(f1);
	Sheet s1= w1.getSheet("login");
	Row r1= s1.getrow(1);
	Cell c1= r1.getCell(1);
	String password = c1.getStringCellValue();
	System.out.println(password);
	
	}
}
