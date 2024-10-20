package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscribeToGrotech 
{
	public static void main (String args[]) throws InterruptedException
	{
WebDriver driver = new ChromeDriver();
driver.get("https:\\www.youtube.com");
System.out.println(driver.getWindowHandles());
System.out.println(driver.getWindowHandle());
System.out.println(driver.getTitle());
driver.manage().window().maximize(); 
WebElement w1=driver.findElement(By.xpath("//input[@id='search']"));
w1.sendKeys("GrotechMinds");
w1.sendKeys(Keys.ENTER);
Thread.sleep(3000);
//driver.findElement(By.xpath("//*[@aria-label='Subscribe']")).sendKeys(Keys.ENTER);
driver.findElement(By.partialLinkText("subscribe")).sendKeys(Keys.ENTER);
Thread.sleep(3000);
//w1.sendKeys(Keys.ENTER);
driver.findElement(By.name("identifier"));
//driver.close();

}
}


