package pranam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Capturing_SecondRowofsecondCellData {
	@Test
	public void CapturingSecondRowofSecondCellData( ) {
		WebDriver driver;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.edge.driver", "D:\\jayam\\pranam\\driverfiles\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		WebElement SecondRowofSecondCell_Element=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[3]"));
		String SecondRowofCell_Data=SecondRowofSecondCell_Element.getText();
		System.out.println("The text of the Second row of second cell value is:" +SecondRowofCell_Data);
	driver.quit();
}
}
