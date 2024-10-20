package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class twoD_dataprovider 
{
@DataProvider(name="names")
public Object[][] method1()
{
	return new Object[][] { {"Anusha"}, {"Ashwath"}, {"Ashwini"} };
}
	@Test(dataProvider="names")
	public void testcase1(String names)
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https:\\www.google.com");
	    System.out.println(driver.getWindowHandles());
	    System.out.println(driver.getWindowHandle());
	    System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
	    driver.findElement(By.name("q")).sendKeys(names); 
	    driver.quit();	
}
}