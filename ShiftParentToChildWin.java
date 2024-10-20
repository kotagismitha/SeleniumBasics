package FirstDemo;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ShiftParentToChildWin
{
public static void main (String[] args) throws InterruptedException
{
 ChromeDriver driver = new ChromeDriver();
 driver.get("https://www.myntra.com/");
 driver.manage().window().maximize();
 WebDriverWait wait = new WebDriverWait (driver, (Duration.ofSeconds(3)));
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("desktop-searchBar")));
WebElement searchField= driver.findElement(By.className("desktop-searchBar"));
searchField.sendKeys("Pajamas");
searchField.sendKeys(Keys.ENTER);
Thread.sleep(20000);
WebElement searchedRes= driver.findElement(By.cssSelector("[id='16009256']"));
searchedRes.sendKeys(Keys.ENTER);
Set<String> s1 = driver.getWindowHandles();
Iterator<String> i1 = s1.iterator();
	String mainwindow = (String) i1.next();
	String childwindow = (String) i1.next();
driver.switchTo().window(childwindow);
}
}
