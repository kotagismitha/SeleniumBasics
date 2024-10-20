package FirstDemo;

import org.testng.annotations.Test;

public class pririty 
{
@Test(priority=-1)
public void case1()
{
	System.out.println("This is testcase1");
}
@Test(priority=-2)
public void case2()
{
	System.out.println("This is testcase2");
}
@Test
public void case3()
{
	System.out.println("This is testcase3");
}
}
