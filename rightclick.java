//launch google and do right click on gmail
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class rightclick {
	public static void main(String[] args) throws InterruptedException 
	{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement e1= driver.findElement(By.linkText("Gmail"));
			Actions a1=new Actions(driver);
			a1.contextClick(e1).perform();
}
}


/*package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement Gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions a1=new Actions(driver);
		a1.contextClick(Gmail).perform();

	}

}*/