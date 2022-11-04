package com.Grid;

import org.openqa.selenium.WebDriver;

public class OrangeHRMapplication {
WebDriver driver;
String apllicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
System.setproperty("webdriver.chrome.driver" , "D:\\drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get(applicationUrlAddress);
driver.manage().window().maximize();
}
public void Login()
{
}

