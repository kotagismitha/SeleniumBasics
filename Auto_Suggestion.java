package FirstDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Auto_Suggestion 
{
	public static <TakesScreenshot> void main (String args[])
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https:\\www.google.com");
	    driver.manage().window().maximize(); 
	    driver.getTitle();
	    TakesScreenshot t1= driver;
	    File f1= 
	    File f2= new File ("C:\\Users\\windows\\eclipse-workspace\\SeleniumDemo\\src\\Screenshots\one.png");
	    FileHandler.copy(f1, f2);
	    
}
}
