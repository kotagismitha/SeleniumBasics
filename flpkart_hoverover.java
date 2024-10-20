//Launch flipkart.com, hover over fashion and open men's t-shirt
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class flpkart_hoverover
	{
		public static void main (String args[]) throws InterruptedException
		{
			ChromeDriver driver = new ChromeDriver();
		    driver.get("https:\\www.flipkart.com");
		    System.out.println(driver.getTitle());
		    driver.manage().window().maximize();
		    WebElement e1 = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		    Actions a1= new Actions(driver);
		    a1.moveToElement(e1).perform();
		    WebElement e2 = driver.findElement(By.linkText("Men's T-Shirts"));
		    e2.click();
		    
		    
		    
		    
		}
		
	}


