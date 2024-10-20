package FirstDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToBankingWebsite 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https:\\www.hdfc.com");
	    System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
	    System.out.println(driver.getWindowHandles());
	    System.out.println(driver.getWindowHandle());
	    WebElement w1 = driver.findElement(By.id("ec-link"));
	    w1.click();


	}

}
