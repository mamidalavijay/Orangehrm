package com.WebPagesTestCases;

import org.testng.annotations.Test;


import com.BaseTest.TestBase;
import com.WebPages.LogInPage;

public class LogInPageTest extends TestBase{
	LogInPage lip;
	@Test(priority=1)
	public void logInTest()
	{
		lip=new LogInPage();
		lip.logIn("Vijay","Jayam12@");
	}
	@Test(priority=2)
	public void logInPageTitleValidationTest()
	{
		lip=new LogInPage();
		lip.logInPageTitleValidation();
	}
	@Test(priority=3)
	public void imageTest()
	{
		lip=new LogInPage();
		lip.image();
	}
	@Test(priority=4)
	public void logInPageUrlAddressValidationTest()
	{
		lip=new LogInPage();
		lip.logInPageUrlAddressValidation();
	}
	@Test(priority=5)
public void logoutTest()
{
		lip=new LogInPage();
		lip.logOut.click();
}
}