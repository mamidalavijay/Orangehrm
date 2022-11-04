package pranam;

import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","D:\\jayam\\pranam\\driverfiles\\msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
	System.out.println("http://facebook.com");
	driver.manage().window().maximize();
	}

}
