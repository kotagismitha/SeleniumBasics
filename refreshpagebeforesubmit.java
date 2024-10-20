/*Launch the grotechminds/registration page and automate the registration process (Skip the choose file as of now), click refresh before submit  
(https://grotechminds.com/registration/)*/
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class refreshpagebeforesubmit  
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://grotechminds.com/registration/");
	    //driver.findElement(By.xpath("//*[@class='elementor-item']")).sendKeys(Keys.ENTER);
	    //driver.findElement(By.xpath("//ul[@id='menu-2-d345ee3']")).sendKeys(Keys.ENTER);
	    //System.out.println(driver.getWindowHandles());
	    //System.out.println(driver.getWindowHandle());
	    System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
	    WebElement e1= driver.findElement(By.id("fname"));
	    e1.sendKeys("Smitha");
	    WebElement e2= driver.findElement(By.id("lname"));
	    e2.sendKeys("Kotagi");
	    WebElement e3= driver.findElement(By.id("email"));
	    e3.sendKeys("smithabvb@gmail.com");
	    WebElement e4= driver.findElement(By.id("password"));
	    e4.sendKeys("gRoww_123");
	    WebElement e5= driver.findElement(By.id("Female"));
	    e5.click();
	    WebElement e6= driver.findElement(By.id("Skills"));
	    e6.click();
	    e6.sendKeys("Technical Skills");
	    e6.sendKeys(Keys.ENTER);
	    WebElement e7= driver.findElement(By.name("technicalskills c-s"));
	    e7.click();
	    e7.sendKeys("Selenium");
	    e7.sendKeys(Keys.ENTER);
	    WebElement e8= driver.findElement(By.name("Country"));
	    e8.click();
	    e8.sendKeys("India");
	    e8.sendKeys(Keys.ENTER);
	    WebElement e9= driver.findElement(By.id("Present-Address"));
	    e9.click();
	    e9.sendKeys("Banashankari, Bangalore");
	    WebElement e10= driver.findElement(By.id("Permanent-Address"));
	    e10.click();
	    e10.sendKeys("Banashankari, Bangalore");
	    WebElement e11= driver.findElement(By.id("Pincode"));
	    e11.click();
	    e11.sendKeys("560078");
	    WebElement e12= driver.findElement(By.id("Relegion"));
	    e12.click();
	    e12.sendKeys("Hindu");
	    e12.sendKeys(Keys.ENTER);
	      driver.navigate().refresh();
	}

}
