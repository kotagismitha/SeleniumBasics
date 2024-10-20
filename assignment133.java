//133.Launch the google page search for India and click using name Locator
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class assignment133
{
public static void main (String args[]) throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
    driver.get("https:\\www.google.com");
    System.out.println(driver.getWindowHandles());
    System.out.println(driver.getWindowHandle());
    System.out.println(driver.getTitle());
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
    driver.quit();
} 
}
