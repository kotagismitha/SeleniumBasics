package FirstDemo;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class flpkart
{
public static void main(String args[])throws InterruptedException, IOException 
{
ChromeDriver c1= new ChromeDriver();
c1.get("https://www.flipkart.com");
c1.manage().window().maximize();
c1.findElement(By.name("q")).sendKeys("mouse");
Thread.sleep(2000);
List<WebElement> autosuggestion = c1.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
int noofautosuggestion = autosuggestion.size();
System.out.println(noofautosuggestion);
Thread.sleep(6000);
// autosuggestion.get(noofautosuggestion).click();
// autosuggestion.get(noofautosuggestion-7).click();
//autosuggestion.get(noofautosuggestion-7).click();
}
}