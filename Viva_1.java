package FirstDemo;
import java.awt.Window;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Viva_1 
{
@SuppressWarnings("unchecked")
public static void main (String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
	driver.manage().window().maximize();
    SearchBox.sendKeys("Decor");
    SearchBox.sendKeys(Keys.ENTER);
String parentwindow = driver.getWindowHandle();
String TitleHomePage = driver.getTitle();
System.out.println(parentwindow);
WebElement AddToCart = driver.findElement(By.xpath("//span[@class='a-button a-button-primary a-button-icon'][1]"));
AddToCart.click();
WebElement ClickItemOne = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][1]"));
ClickItemOne.click();
Thread.sleep(5000);
Set<String> s1 = driver.getWindowHandles();
Iterator<String> i1=s1.iterator();
String Parentwin = i1.next();
String Childwin = i1.next();
driver.switchTo().window(Childwin);
WebElement WishlistItem = driver.findElement(By.cssSelector("[id='wishListMainButton']"));
WishlistItem.click();
}
}
