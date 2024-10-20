package FirstDemo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchAllBrowsers 
{
public static void main(String args[])
{
	ChromeDriver driver = new ChromeDriver();
	EdgeDriver driver1 = new EdgeDriver();
	FirefoxDriver driver2 = new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.getTitle();
	driver.close();
	driver1.get("https://www.amazon.in");
	driver1.getTitle();
	driver1.close();
	driver2.get("https://www.search.com");
	driver2.getTitle();
	driver2.close();
}
}
