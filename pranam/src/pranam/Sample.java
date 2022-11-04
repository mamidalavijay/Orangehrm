package pranam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Sample {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
System.setProperty("webdriver.edge.driver ", "\\driverfiles\\msedgedriver.exe");
driver.get("https://www.amazon.com");
	}
}




































