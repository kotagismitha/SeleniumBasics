//134.Login to Facebook
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook_Login {
public static void main (String args[])
{
	ChromeDriver driver = new ChromeDriver();
    driver.get("https:\\www.facebook.com");
    System.out.println(driver.getWindowHandles());
    System.out.println(driver.getWindowHandle());
    System.out.println(driver.getTitle());
    driver.manage().window().maximize();  
 /*   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("smithabvb@gmail.com");  //ID does not work, so take name
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("900883212@5");
    driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
 */ 
    
    driver.findElement(By.cssSelector("#email")).sendKeys("smithabvb@gmail.com");  //ID does not work, so take name
    driver.findElement(By.cssSelector("#pass")).sendKeys("900883212@5");
    driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
  
    driver.quit();
}
}