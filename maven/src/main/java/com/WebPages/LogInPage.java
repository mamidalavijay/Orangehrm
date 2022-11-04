package com.WebPages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.TestBase;

public class LogInPage extends TestBase{

public LogInPage()
{
	PageFactory.initElements(driver,this);
}
//identification of element of the page
//"object Repository" class
//id="txtUserName"-UserName Element Property
//WebElement UserName=driver.findElement(By.id("txtUserName"));
@FindBy(id="txtUsername")
WebElement UserName;
@FindBy(name="txtPassword")
WebElement Password;
@FindBy(className="button")
WebElement logInButton;
@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
WebElement OrangeHRMImage;
@FindBy(id="welcome")
WebElement WelcomeAdmin;
public WebElement logOut;
public void logIn(String username,String password)
{
	UserName.sendKeys(username);
    Password.sendKeys(password);
	logInButton.click();
	WelcomeAdmin.click();
}
public void image()
{
	boolean flag=OrangeHRMImage.isDisplayed();
	Assert.assertTrue(flag,"OrangeHRM Logo not found");
}
public void logInPageTitleValidation()
{
String	actual_logInPageTitle=driver.getTitle();
String expected_Title="OrangeHRM";
Assert.assertEquals(actual_logInPageTitle,expected_Title ,"Title not matched");
}
public void logInPageUrlAddressValidation()
{
	String actual_logInPageUrlAddress=driver.getCurrentUrl();
	String expected_logInPageUrlAddress="orangehrm-4.2.0.1";
	Assert.assertTrue(actual_logInPageUrlAddress.contains(expected_logInPageUrlAddress));
}
public void logOut(String Username,String password)
{
	UserName.sendKeys(Username);
	Password.sendKeys(password);
	WelcomeAdmin.click();
	logOut.click();
}
}