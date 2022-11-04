package pranam;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Annotations1 {
@BeforeMethod
public void applicationLaunch()			{
System.out.println("Gmail Application Launch Successfully");			}
//@Test
public void inBox()
			{
			System.out.println("Gmail Application InBox functionality Launch Successful");
			}
@Test
public void Composemile()
	{
	System.out.println("Gmail Application Composemile functionality Launch Successful");
	}
@Test(enabled=false)
public void Drafts()
	{
	System.out.println("Gmail Application Drafts functionality Launch Successfull");
	}
@AfterMethod
public void applicationclose()
{
	System.out.println("closing Gmail Application");
}
}
