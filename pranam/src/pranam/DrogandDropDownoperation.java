package pranam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogandDropDownoperation {
public static void main(String[] args) {
WebDriver driver;
String applicationUrlAddress="https://jqueryui.com/droppable/";
System.setProperty("webdriver.edge.driver ","D:\\jayam\\pranam\\driverfiles\\msedgedriver.exe" );
driver=new EdgeDriver();
driver.get(applicationUrlAddress);
driver.manage().window().maximize();
 WebElement frameofDrogandDropElements=driver.findElement(By.className("demo_free"));
 driver.switchTo().frame(frameofDrogandDropElements);
 WebElement drogmetoMyTargetElement=driver.findElement(By.id("draggable"));
 System.out.println("drogmetomytargetElement is identified");
  WebElement drophereElement=driver.findElement(By.id("droppable"));
  Actions action=new Actions(driver);
  action.dragAndDrop( drogmetoMyTargetElement,drophereElement).perform();
  driver.switchTo().defaultContent();
  WebElement resizable=driver.findElement(By.linkText("Resizable"));
  resizable.click();
 
}
}
