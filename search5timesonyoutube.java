//Test the search field of the youtube search field
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class search5timesonyoutube 
{
	@DataProvider(name="names")
public Object[][]method1()
{
return new Object[][] {{"Alphabets"}, {"Suits"}, {"Cypress"}, {"Methods"}, {"JAVASCRIPT"}, {"DDT"}};
}
	@Test(dataProvider="names")
	public void testcase1(String names) throws InterruptedException
	{
		{
	WebDriver driver = new ChromeDriver();
	driver.get("https:\\www.youtube.com");
	System.out.println(driver.getWindowHandles());
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getTitle());
	driver.manage().window().maximize(); 
	WebElement w1=driver.findElement(By.xpath("//input[@id='search']"));
	w1.sendKeys(names);
	w1.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
}
}
}
