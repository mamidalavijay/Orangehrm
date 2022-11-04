package pranam;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Dynamicwebtable_extends_applicationLaunch {

@Test
public void CapturingDynamicWebTableData()
{
	WebDriver driver = null;
	WebElement WebTable=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
	 List <WebElement> rows=WebTable.findElements(By.tagName("tr"));
	 int rowscount=rows.size();
	 System.out.println("the number of rows of the webtable are:" +rowscount);
	 for(int i=0;i<rowscount;i++)
		 {
		 List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
		 int cellscount=cells.size();
		 for(int j=0;j<cellscount;j++)
		 {
			 String data=cells.get(j).getText();
			 System.out.println(data+" ");
		 }
		 System.out.println();
		 }
}
}
