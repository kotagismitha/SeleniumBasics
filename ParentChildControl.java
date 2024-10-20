//Search shoes on Amazon and add the first product to the cart
package FirstDemo;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ParentChildControl {
public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	   WebElement search= 		driver.findElement(By.xpath("(//input)[5]"));
	    search.sendKeys("Shoes");
	    search.sendKeys(Keys.ENTER);
	    WebElement e1 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	    e1.click();
	    
	  Set<String> s1=  driver.getWindowHandles();
	    Iterator<String> i1=s1.iterator();
	    String parentid=			i1.next();//parent winodw id
	    String childid=			i1.next();//any child id
	    System.out.println(parentid);
	    System.out.println(childid);
	    driver.switchTo().window(childid);
	   Thread.sleep(2000);
	   WebElement e3=	driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	   e3.click();
	   
	    

	   
	}
}