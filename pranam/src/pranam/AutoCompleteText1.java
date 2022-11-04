package pranam;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AutoCompleteText1 {
	public static void main(String[] args) throws InterruptedException {
String url="http://www.google.com";
WebDriverMethods obj=new WebDriverMethods();
obj.launchBrowser();
obj.openURL(url);;
WebElement googleSearchBox=obj.SetTextinGoogleSearchbox("Selenium");
List<String> SuggestedListValues=obj.getSuggestedList();
boolean status=obj.verifySuggestedListContainsSearchText(SuggestedListValues, "Selenium");
Assert.assertTrue(status);
int pos=obj.selectSpecificValueInSuggestedListAndHitEnterKey(SuggestedListValues, "Selenium dev");
obj.selectThirdOptionAndHitEnterKey(googleSearchBox, pos);
obj.closeBrowser();
	}

}
