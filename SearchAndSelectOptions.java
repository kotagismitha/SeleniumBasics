//Google search and select 3rd item from the auto-suggestion
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchAndSelectOptions 
{
public static void main (String args[]) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
    driver.get("https:\\www.google.com");
    System.out.println(driver.getWindowHandles());
    System.out.println(driver.getWindowHandle());
    System.out.println(driver.getTitle());
    driver.manage().window().maximize();
    driver.findElement(By.name("q")).sendKeys("India");
    Thread.sleep(2000);
    WebElement e1=	driver.findElement(By.name("q"));
    e1.sendKeys(Keys.ARROW_DOWN+" "+Keys.ARROW_DOWN);
    Thread.sleep(3000);
    e1.sendKeys(Keys.ENTER);
    //driver.quit();
}
}
