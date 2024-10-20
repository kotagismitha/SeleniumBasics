package FirstDemo;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class brokenlinks {
	public static void main(String[] args) throws Throwable 
		{
           ChromeDriver driver = new ChromeDriver();
		    //driver.get("https://www.amazon.in/");
		    driver.get("https://www.google.in/");
		    driver.manage().window().minimize();
		    List<WebElement> l1= driver.findElements(By.tagName("a"));
		    int count =l1.size();
		    System.out.println(count);
		    for (int i=0;i<count;i++)
		    {
		    WebElement e1= l1.get(i);
		    String url=e1.getAttribute("href");
		    System.out.println(url);
		    verify_each_link(url);
		    }
		}
static void verify_each_link(String url) throws Exception
{
	URL u1=new URL(url);
	HttpURLConnection h1=(HttpURLConnection) u1.openConnection();
	if(h1.getResponseCode()==200)
	{
		System.out.println("Not a broken link");
	}
	else
	{
		System.out.println("It is a broken link");
	}
			}
}


/*package package1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Broken_link {

	public static void main(String[] args) throws MalformedURLException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().minimize();
		List<WebElement> l1=	driver.findElements(By.tagName("a"));
		int count=	l1.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement e1=			l1.get(i);
			String url=					e1.getAttribute("href");
			System.out.println(url );
			verify_each_links(url);
		}
	}
	
	static void verify_each_links(String url) throws IOException
	{
		URL u1=new URL(url);
		HttpURLConnection h1		=(HttpURLConnection) u1.openConnection();
	
		
		
		
		
	}
	
	
	
	
	
	

}*/