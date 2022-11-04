package pranam;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookApplication {
@Test
public void handingcookies()
{
	WebDriver driver;
	String applicationUrlAddress="http://facebook.com";
	System.setProperty("webdriver.chrome.driver","D:\\jayam\\pranam\\driverfiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	Set <Cookie> facebookcookies=driver.manage().getCookies();
	int cookiescount=facebookcookies.size();
	System.out.println("no of cookies on the facebook homepage are: "+cookiescount);
	Iterator <Cookie> it=facebookcookies.iterator();
	While(it.hasNext());
	{
		Cookie c=it.next();
		System.out.println("the name of the cookie is:"+c.getDomain()+""+c.getName());
		driver.manage().deleteAllCookies();
		facebookcookies=driver.manage().getCookies();
		facebookcookies.size();
		System.out.println("no of cookies on facebook homepage are:"+cookiescount);
	driver.quit();
	}
	
	
}

private void While(boolean hasNext) {
	// TODO Auto-generated method stub
	
}
}
