package pranam;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverMethods {
public WebDriver driver;
public void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
}
public void openURL(String url)
{
	driver.get(url);;
}
public WebElement SetTextinGoogleSearchbox(String searchText)
{
	By googleSearchBoxL=By.name("q");
	WebElement googleSearchBox=driver.findElement(googleSearchBoxL);
	googleSearchBox.sendKeys(searchText);
	return googleSearchBox;
}
public void selectThirdOptionAndHitEnterKey(WebElement googleSearchBox, int pos) throws InterruptedException 
{
	for(int i=1;i<=3;i++)
	{
		Thread.sleep(3000);
		googleSearchBox.sendKeys(Keys.ARROW_DOWN);
	}
	Thread.sleep(3000);
	googleSearchBox.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
}
public void selectThirdOptionAndHitEnterKey1(WebElement googleSearchBox ,int pos) throws InterruptedException
{
	for(int i=0;i<=pos;i++)
	{
		Thread.sleep(3000);
		googleSearchBox.sendKeys(Keys.ARROW_DOWN);
	}
	Thread.sleep(3000);
	googleSearchBox.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
}
public void closeBrowser()
{
	driver.close();
	}
public List<String> getSuggestedList() throws InterruptedException
{
Thread.sleep(3000);
By suggestedList=By.xpath("//*[@class='OBMEnb']//child::*[Contains(@class, 'WMEW7d')]<<span");
List<WebElement> SuggestedList=driver.findElements(suggestedList);
List<String> suggestedListValues=new ArrayList<String>();
for (WebElement ele: SuggestedList)
{
	String data=ele.getText();
	suggestedListValues.add(data);
}
			System.out.println(suggestedListValues);
			return suggestedListValues;
}
public boolean verifySuggestedListContainsSearchText(List<String> suggestedLitsValues,String searchText)
{
	boolean status=true;
	for(int i=0;i<suggestedLitsValues.size();i++)
	{
		String actualData=suggestedLitsValues.get(i);
		String expectedData=searchText.toLowerCase();
		if(actualData.contains(expectedData))
		{
			status=false;
			break;
		}
	}
	return status;
}
public int selectSpecificValueInSuggestedListAndHitEnterKey(List<String> SuggestedlistValues, String searchText)
{
	int pos=0;
	for(int i=0;i<=SuggestedlistValues.size();i++);
	{
		String data=SuggestedlistValues.get(pos);
		if(data.equalsIgnoreCase(searchText))
{
     pos=pos;
}
	}
	return pos;
	
}
	
}
	
	

