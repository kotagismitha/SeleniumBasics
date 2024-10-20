package FirstDemo;
import org.testng.annotations.Test;
public class fivetests 
{
@Test(groups={"smoke", "Regression"})
public void testone()
{
	System.out.println("Test one");
}
@Test(groups="smoke")
public void testtwo()
{
	System.out.println("Test two");
}
@Test(groups="sanity")
public void testhree()
{
	System.out.println("Test three");
}
@Test(groups={"sanity", "Smoke"})
public void testfour()
{
	System.out.println("Test four");
}
@Test
public void testfive()
{
	System.out.println("Test five");
}

}
