package FirstDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class subscrGrotech {
	public static void main (String args[]) throws InterruptedException
	{
ChromeDriver c1= new ChromeDriver();
c1.get("https://www.youtube.com/");
//Thread.sleep(2000);
WebElement w1 = c1.findElement(By.xpath("//input[@id='search']"));
w1.sendKeys("Grotechminds");
w1.sendKeys(Keys.ENTER);
Thread.sleep(2000);
WebElement w3 = c1.findElement(By.partialLinkText("Subscribe"));
Thread.sleep(2000);
w3.sendKeys(Keys.ENTER);
WebElement w4 = c1.findElement(By.name("identifier"));
w4.sendKeys("smithabvb@gmail.com");
	}
}
