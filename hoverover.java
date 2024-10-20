//Launch Amazon India, hover over accounts and lists and sign in
package FirstDemo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class hoverover
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    WebElement e1 = driver.findElement(By.id("nav-link-accountlist"));
	    Actions a1= new Actions(driver);
	    a1.moveToElement(e1).perform();
	    
	}
}



/*public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();*/