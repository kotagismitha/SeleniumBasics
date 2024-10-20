package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class dragnDrop 
{
public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.grotechminds.com/drag-and-drop");
		    System.out.println(driver.getTitle());
		    driver.manage().window().maximize();
		    webElement drag = driver.findElement(By.xpath("//div[@id='container-6']"));
		    webElement drop = driver.findElement(By.xpath("//div[@id='container-6']"));
}
}
