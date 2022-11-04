package pranam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Capturing_TimeTabaleAllValues {
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
	 public void CapturingFirstRowofFirstCellData() throws IOException
	 {
		 ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		 ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		 
		 String xpathExpressionpart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		 String xpathExpressionpart2="]/td[";
		 String xpathExpressionpart3="]";
		 for(int i=1;i<=36;i++)
		 {
			 FileInputStream file=new FileInputStream("D:\\jayam\\pranam\\Excel sheets\\workbook_sheet.xlsx");
			 XSSFWorkbook workbook=new XSSFWorkbook(file);
			 XSSFSheet sheet=workbook.getSheet("Sheet1");
			 Row row=sheet.createRow(i-1);
			 for(int j=1;j<=8; j++)
			 {
	//WebElement WebTableElement=driver.findElement(By.xpath(xpathExpressionpart1+i+xpathExpressionpart2+j+xpathExpressionpart3));
	WebElement WebTableElement=driver.findElement(By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));

	
	String WebTableData=WebTableElement.getText();
	Cell cell=row.createCell(j-1);
	cell.setCellValue(WebTableData);
	
	FileOutputStream file1=new FileOutputStream("D:\\jayam\\pranam\\Excel sheets\\workbook_sheet.xlsx");
	workbook.write(file1);
	
	System.out.println(WebTableData+"  ");
}
		 }
	 }
	 
}
