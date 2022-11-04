 package operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlanguageinExcel {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		String applicationUrlAddress="https://jqueryui.com/droppable/";
		System.setProperty("webdriver.chrome.driver","D:\\jayam\\pranam\\driverfiles\\msedgedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
		WebElement SelectLanguagesDropDown=driver.findElement(By.id("gtranslate_selector"));
List <WebElement> SelectLanguagesDropDown1=(List<WebElement>) driver.findElement(By.tagName("option"));
int dropDownListLength=SelectLanguagesDropDown1.size();
System.out.println("The Number of Languages in the Dropdown are :"+dropDownListLength);
FileInputStream file=new FileInputStream("D:\\jayam\\pranam\\Excel sheets\\workbook_sheet.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	for(int i=0;i<dropDownListLength;i++)
	{
		String dropDownLanguages=SelectLanguagesDropDown.get(i).getText();
		System.out.println(i+""+dropDownLanguages);
		Row row=sheet.createRow(i);
		Cell cell=row.createCell(0);
		Select Selection=new Select(SelectLanguagesDropDown);
		Selection.selectByIndex(i);
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, null;
		
		
	}
	}

}
