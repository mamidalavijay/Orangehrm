package pranam;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {


	private static final File Screenshot = null;
	private static final String dropDownLanguage = null;

	public static void main(String[] args) throws IOException {
	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";
	System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
File osmaniawebpage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Files.copy(Screenshot , new File("./Screenshots/"+dropDownLanguage+".png"));
driver.quit();
}

	}


