package pranam;     

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class friend {
	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress = "https://www.osmania.ac.in/";
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
driver.manage().window().maximize();
WebElement DropdownLanguages=driver.findElement(By.id(""));
 List <WebElement> dropDownLanguages=((By) dropDownLanguages).findElements(By.tagName("option"));
	int dropdownListLength=dropDownLanguages.size();
	System.out.println("The number of languages in the dropdown are:"+dropdownListLength);
	for(int i=0;i<dropdownListLength;i++)
	{
		String dropDownLanguage=dropDownLanguages.get(i).getText();
		System.out.println(i+" "+dropDownLanguage);
	}
	driver.quit();
	}
	

}
