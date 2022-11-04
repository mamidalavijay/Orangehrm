package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OHRM_LogInTest {
@Parameters("Browser")
@Test
public void login(String browsername) throws MalformedURLException
{
	System.out.println("The Browser name is:"+browsername);
	DesiredCapabilities cap=null;
	if(browsername.equalsIgnoreCase("chrome"))
			{
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("browser");
		cap.setPlatform(Platform.WINDOWS);
			}
	else
		if(browsername.equalsIgnoreCase("firfox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.26:4444/wd/hub"),cap);
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 WebElement Username=driver.findElement(By.id("txtUsername"));
	Username.clear();
	Username.sendKeys("Vijay");
	WebElement Password=driver.findElement(By.name("txtPassword"));
	Password.clear();
	Password.sendKeys("Jayam12@");
	 WebElement LogInButton=driver.findElement(By.className("button"));
	 LogInButton.click();
	WebElement  WelComeAdminElement=driver.findElement(By.linkText("WelCome Admin"));
	WelComeAdminElement.click();
	
}

}
