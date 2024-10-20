//Launch the google page, type "India" in the search field only if the search bar is visible and enabled
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledAndavailable 
{
	public static void main (String args[])
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https:\\www.google.com");
	    driver.manage().window().maximize(); 
	   WebElement e1= driver.findElement(By.name("q"));
	   if ((e1.isDisplayed()&& e1.isEnabled()))
			   {
		   e1.sendKeys("India");
		   e1.sendKeys(Keys.ENTER);
		   driver.close();
			   }
	    
}
}