package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import dev.failsafe.internal.util.Assert;
public class assertiontestng 
{
public static void main (String args[]) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
    driver.get("https:\\www.google.com");
    System.out.println(driver.getWindowHandles());
    System.out.println(driver.getWindowHandle());
    System.out.println(driver.getTitle());
    driver.manage().window().maximize();
    WebElement e1 = driver.findElement(By.name("q"));
    e1.sendKeys("India");
    Thread.sleep(2000);
    Assert.isTrue(false, null, args);
}
}	
