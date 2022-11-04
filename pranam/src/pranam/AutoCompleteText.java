package pranam;

import org.openqa.selenium.WebElement;

public class AutoCompleteText {

public static void main(String[] args) throws InterruptedException {
String url="http://google.com";
WebDriverMethods obj=new WebDriverMethods();
obj.launchBrowser();
obj.openURL(url);
WebElement googleSearchBox=obj.SetTextinGoogleSearchbox("Selenium");
obj.selectThirdOptionAndHitEnterKey(googleSearchBox,0);
obj.closeBrowser();
	}

}
