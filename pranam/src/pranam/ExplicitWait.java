package pranam;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {
	private static Object duration;

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\drivers\\waitExample.html\\");
	By alertBtnL=By.xpath("/html/body/button");
	WebElement alertBtn=driver.findElement(alertBtnL);
	alertBtn.click();
	{
		
	WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(30));
	
	wait.until(ExpectedConditions.alertIsPresent());
	
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	driver.close();

	}
	

}

	private static Object seconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}