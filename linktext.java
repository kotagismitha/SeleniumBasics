//Display all the links and linktexts on the amazon page
package FirstDemo;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class linktext 
{
	public static void main(String[] args) throws InterruptedException 
		{

			ChromeDriver driver = new ChromeDriver();
		    //driver.get("https://www.amazon.in/");
		    driver.get("https://www.google.in/");
		    driver.manage().window().maximize();
		    List<WebElement> l1= driver.findElements(By.tagName("a"));
		    int count =l1.size();
		    System.out.println(count);
		    for (int i=0;i<count;i++)
		    {
		    WebElement e1= l1.get(i);
		    String url=e1.getAttribute("href");
		    String linktext=e1.getText();
		    System.out.println(linktext);
		    System.out.println(url);
		    driver.quit();
		}
		}
	
}
