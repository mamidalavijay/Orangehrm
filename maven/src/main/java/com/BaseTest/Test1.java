package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test1 {
public WebDriver driver;
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
@BeforeTest
public void setup()
{
	System.setProperty("webdriver.edge.driver","D:\\drivers\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(applicationUrlAddress);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterTest
public void tearDown()
{
	driver.quit();
	
}
}
