package pranam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TimeandDate_FirstRowofFirstCellData {
	@Test
	public void CapturingFirstRowofFirstCellData( ) {
		WebDriver driver;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.edge.driver", "D:\\jayam\\pranam\\driverfiles\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		WebElement FirstRowofFirstCell_Element=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
		String FirstRowofCell_Data=FirstRowofFirstCell_Element.getText();
		System.out.println("The text of the first row of first cell value is:" +FirstRowofCell_Data);
	driver.quit();
	}
}
