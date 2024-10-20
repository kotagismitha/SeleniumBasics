/*135.Launch the Amazon direct click on the Sign in button and using name Locator add UserName,
Continue and Password */
package FirstDemo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonLogin{
	public static void main (String args[]) throws InterruptedException
	{
 ChromeDriver driver = new ChromeDriver();
 driver.get("https:\\www.amazon.in");
 driver.manage().window().maximize();
WebElement w1 = driver.findElement(By.id("nav-link-accountList"));
 w1.sendKeys(Keys.ENTER);
 w1.click();
 WebElement w2 = driver.findElement(By.id("ap_email_login"));
 w2.sendKeys("8149692711");
 WebElement w3 = driver.findElement(By.className("a-button-input"));
 w3.click();
 Thread.sleep(3000);
 WebElement w4 = driver.findElement(By.id("ap_password"));
 w4.sendKeys("aMaze_1711");
 WebElement w5 = driver.findElement(By.id("signInSubmit"));
 w5.click();
 driver.quit();
}
}


