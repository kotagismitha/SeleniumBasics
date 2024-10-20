//launch google and do double click on gmail
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class doubleclick {
	public static void main(String[] args) throws InterruptedException 
	{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement gmail= driver.findElement(By.linkText("Gmail"));
			Actions a1=new Actions(driver);
			a1.doubleclick(target gmail).perform();
}
}
