package FirstDemo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class searchModiOnyoutube {
public static void main (String args[]) throws InterruptedException
	{
ChromeDriver c1= new ChromeDriver();
c1.get("https://www.youtube.com/");
//Thread.sleep(2000);
WebElement w1 = c1.findElement(By.xpath("//input[@id='search']"));
w1.sendKeys("Modi ");
w1.sendKeys(Keys.BACK_SPACE);
List<WebElement> w2= w1.findElements(By.className("sbsb_c gsfs"));
System.out.println(w2.size());
w1.sendKeys(Keys.ENTER);
Thread.sleep(2000);
}
}
