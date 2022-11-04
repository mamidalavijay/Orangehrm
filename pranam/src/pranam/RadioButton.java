package pranam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
WebElement radioButtonsBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
List <WebElement> group2RadioButtons=(List<WebElement>) radioButtonsBlock.findElement(By.name("group2"));
	int group2RadioButtonsLength= group2RadioButtons.size();
	System.out.println("Number of Radio Buttons in Group1 are:"+group2RadioButtonsLength);
	for(int i=0;i<group2RadioButtonsLength;i++)
	{
		group2RadioButtons.get(i).click();
		Thread.sleep(2000);
	}
	for(int j=0;j<group2RadioButtonsLength;j++)
	{
		System.out.println(group2RadioButtons.get(j).getAttribute("value"));
	}
	System.out.println();
	driver.quit();
	}
	
	
	

}
