package pranam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingFirstRowofFirstCellData {
 WebDriver driver; //global variable
 @BeforeTest
public void applicationLaunch()
{
	 String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	 System.setProperty("webdriver.edge.driver", "D:\\jayam\\pranam\\driverfiles\\msedgedriver.exe");
	 driver=new EdgeDriver();
	 driver.get(applicationUrlAddress);
driver.manage().window().maximize();
}
 @AfterTest
 public void applicationclose()
 {
	 driver.close();
 }
 @Test
 public void CapturingFirstRowofFirstCellData()
 {
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	 
	 String part1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	 String part2="]/td[1]/a";
	 for(int i=1;i<=36;i++)
	 {
		 WebElement tableElement=driver.findElement(By.xpath(part1+i+part2));
		 String data=tableElement.getText();
		 System.out.println(data);
	 }
}
 
 
 

}
