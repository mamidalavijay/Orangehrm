package pranam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_writeoperation {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		String appllicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","D:\\jayam\\pranam\\driverfiles\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(appllicationUrlAddress);
		driver.manage().window().maximize();
	FileInputStream file=new FileInputStream("D:\\jayam\\pranam\\Excel sheets\\workbook_sheet.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	 Row row=sheet.createRow(2);
	 Cell cell=row.createCell(3);
	 cell.setCellValue("techlive");
	 FileOutputStream file1=new FileOutputStream("D:\\jayam\\pranam\\Excel sheets\\workbook_sheet.xlsx");
	 workbook.write(file1);
	
	}

}
