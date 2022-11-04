package pranam;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Datepicker{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		driver.manage().window().maximize(); //maximize window
		By examplesL=By.xpath("//*[text()='Examples']");
		WebElement examples=driver.findElement(examplesL);
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0]",examples);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		                                             
		By datePickerTxtboxL=By.cssSelector("input#datepicker[class='hasDatepicker']");
		WebElement datepickerTxtbox=driver.findElement(datePickerTxtboxL);
	Actions action=new Actions(driver);
	action.click(datepickerTxtbox).build().perform();
	Thread.sleep(2000);
	 By nextBtnL=By.xpath("//*[normalize-space()='next']");
	 WebElement nextBtn=driver.findElement(nextBtnL);
	 for(int i=1;i<=4;i++)
	 {
		 action.click(nextBtn).build().perform();
		 Thread.sleep(1000);
	 }
	}
}
