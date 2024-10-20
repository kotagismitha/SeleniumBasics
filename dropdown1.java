package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown1 
{
	public static void main (String args[])
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https:\\www.amazon.in");
driver.manage().window().maximize();
WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("Shoes");
e1.sendKeys(Keys.ENTER);
WebElement e2 = driver.findElement(By.className("a-section a-spacing-base a-text-center"));
e2.click();
//Select s1= new Select(e1);

	}
}
