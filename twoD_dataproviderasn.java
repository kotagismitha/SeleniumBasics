//Login to Amazon using 4 set of data
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class twoD_dataproviderasn 
{
	@Test(dataProvider="LoginDetails")
	public void Testcase1(String un,String pw) throws InterruptedException
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https:\\www.amazon.in");
		 driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(2000);
		 w1.sendKeys(Keys.ENTER);
		 w1.click();
		 WebElement w2 = driver.findElement(By.id("ap_email_login"));
		 w2.sendKeys(un);
		 WebElement w3 = driver.findElement(By.className("a-button-input"));
		 w3.click();
		 Thread.sleep(3000);
		 WebElement w4 = driver.findElement(By.id("ap_password"));
		 w4.sendKeys(pw);
		 WebElement w5 = driver.findElement(By.id("signInSubmit"));
		 w5.click();
		 driver.quit();
	}
@DataProvider(name="LoginDetails")
	public Object[][]method1()
	{
		Object[][] data = new Object [4][2];
		//set1
		data[0][0] = "smithabvb@gmail.com";
		data[0][1] = "aMaze_1711"; 
		//set2
		data[1][0] = "+918149692711";
		data[1][1] = "aMaze_1711";	
	    //set3
		data[2][0] = "00918149692711";
		data[2][1] = "aMaze_1711";
		//set4
		data[3][0] = "8149692711";
		data[3][1] = "aMaze_1711";
		return data;
	}
}

