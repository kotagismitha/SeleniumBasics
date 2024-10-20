/*Complete the assignment of selecting the 4th auto suggestion item on the flipkart 
application by searching shoes*/
package FirstDemo;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class assignmentFlpkart 
{
	public static void main(String args[])throws InterruptedException, IOException 
	{
	ChromeDriver c1= new ChromeDriver();
	c1.get("https://www.flipkart.com/");
	c1.manage().window().maximize();
	c1.findElement(By.name("q")).sendKeys("Shoes");
	//Thread.sleep(2000);
List<WebElement> autosuggestion = c1.findElements(By.xpath("//li[@class='AgOexi']/div/a"));
int count  = autosuggestion.size();
autosuggestion.get(3).click();
}
}
