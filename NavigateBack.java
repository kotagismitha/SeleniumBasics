package FirstDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack 
{
public static void main(String args[]) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("https:\\www.google.com");
	driver.manage().window().maximize();
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().refresh();
}

}
