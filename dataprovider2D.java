//Register in to Amazon using six set of data having name, phone num and pwd
package FirstDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class dataprovider2D 
{
	@Test(dataProvider="LoginDetails")
	public void Testcase1(String un, String num, String pw) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex");
		 driver.manage().window().maximize();
		WebElement w1 = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(3000);
		 w1.sendKeys(Keys.ENTER);
		 w1.click();
		 Thread.sleep(3000);
		 WebElement w2 = driver.findElement(By.id("ap_customer_name"));
		 w2.sendKeys(un);
		 WebElement w3 = driver.findElement(By.id("ap_phone_number"));
		 w3.sendKeys(num);
		 Thread.sleep(3000);
		 WebElement w4 = driver.findElement(By.id("ap_password"));
		 w4.sendKeys(pw);
		 WebElement w5 = driver.findElement(By.id("continue"));
		 w5.click();
		 driver.quit();
	}
@DataProvider(name="LoginDetails")
	public Object[][]method1()
	{
		Object[][] data = new Object [6][3];
		//set1
		data[0][0] = "Sapna";
		data[0][1] = "88787871921";
		data[0][2]=  "aMaze_1711";
		//set2
		data[1][0] = "Namitha";
		data[1][1] = "67563512091";	
		data[1][2] = "aMaze_1711";
	    //set3
		data[2][0] = "Amitha";
		data[2][1] = "8197458772";
		data[2][2] = "aMaze_1711";	
		//set4
		data[3][0] = "Pinky";
		data[3][1] = "1769843434";
		data[3][2] = "aMaze_09123";
		//set5
		data[4][0] = "Priya";
		data[4][1] = "1769843434";
		data[4][2] = "aMaze_09123";
		//set6
		data[5][0] = "Pushpa";
		data[5][1] = "1769843434";
		data[5][2] = "aMaze_09123";
		return data;
	}
}

