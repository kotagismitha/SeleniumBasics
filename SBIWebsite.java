//Launch the SBI website where right click is disabled and click on continue to login button using LinkText or PartialLinkText and add UserName and Password
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SBIWebsite 
{
public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
		   driver.get("https://www.onlinesbi.sbi/");
		    System.out.println(driver.getTitle());
		    driver.manage().window().maximize();
		    WebElement w1 = driver.findElement(By.xpath("//span[.='LOGIN']"));
		    w1.click();
		    WebElement w2 = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		    w2.click();
		    WebElement w3 = driver.findElement(By.id("username"));
		    w3.sendKeys("Anamikha");
		    WebElement w4 = driver.findElement(By.name("password"));
		    w4.sendKeys("Anamikha_9001");
		    Thread.sleep(2000);
		    driver.quit();
}
}

