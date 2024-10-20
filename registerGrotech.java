/*141 .On regisration page of grotech minds copy the value in the name field and paste the 
same in the lastname field*/
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class registerGrotech 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://grotechminds.com/registration/");
	    System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
	    WebElement e1= driver.findElement(By.id("fname"));
	    e1.sendKeys("Smitha");
	    e1.sendKeys(Keys.CONTROL+"A");
	    e1.sendKeys(Keys.CONTROL+"C");
	    WebElement e2= driver.findElement(By.id("lname"));
	    e2.sendKeys(Keys.CONTROL+"V");
	    driver.close();
}
}