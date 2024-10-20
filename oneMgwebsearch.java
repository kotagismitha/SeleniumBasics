package FirstDemo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class oneMgwebsearch {
public static void main(String[] args)throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.1mg.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(9000);
	   WebElement e1= driver.findElement(By.id("srchBarShwInfo"));
	    e1.sendKeys("Cholesterol");
	 List<WebElement> e2=driver.findElements(By.xpath("//*[@class='styles__brand___2MoiR']/div"));
	 int count= e2.size();
	 System.out.println(count);
	 e2.get(3).click();
	 
	}
}