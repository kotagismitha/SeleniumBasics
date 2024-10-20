//Perform Google search using the data provider concept with 3 search criteria
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Dataproviderannotation 
{
@DataProvider(name="data1")
public Object[][] method1()
{
	return new Object[][] {{"Bandipur National Park"},{"Asssamese"},{" GIR Forest"}};
}
@Test(dataProvider="data1")
public void testcase1(String value) throws InterruptedException
{
WebDriver driver = new ChromeDriver();
driver.get("https:\\www.google.com");
System.out.println(driver.getWindowHandles());
System.out.println(driver.getWindowHandle());
System.out.println(driver.getTitle());
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys(value); 
WebElement w1 = driver.findElement(By.name("btnK"));
w1.sendKeys(Keys.ENTER);
Thread.sleep(2000);
driver.quit();
}
}
