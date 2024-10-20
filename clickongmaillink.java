//138.Launch the google page and click on the gmail icon
package FirstDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickongmaillink 
{
	public static void main (String args[])
	{
ChromeDriver driver = new ChromeDriver();
driver.get("https:\\www.google.com");
WebElement w1 = driver.findElement(By.partialLinkText("Gmai"));
w1.click();
driver.quit();
      }
}