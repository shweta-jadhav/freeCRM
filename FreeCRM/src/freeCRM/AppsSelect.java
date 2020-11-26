package freeCRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class AppsSelect extends Launch{
  @Test
  public void selectApps() {
	 // String  ChildUrl;
	  driver.findElement(By.xpath("//a[contains(text(),'Apps')]//..//following-sibling::li")).click();
	 
	  WebElement Android=driver.findElement(By.xpath("//a[contains(text(),'Android')]"));
	 
	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Actions action=new Actions(driver);
	  action.moveToElement(Android).click().build().perform();
	  
	  
	  
	  for(String ChildWindowHandle:driver.getWindowHandles()) {
		  driver.switchTo().window(ChildWindowHandle);
		  
		  System.out.println(driver.getCurrentUrl());
		  
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  //WebElement element=driver.findElement(By.xpath("//h2[contains(text(),'What’s new')]//..//div[@Class='W4P4ne ']"));
		  //js.executeScript("argument[0].ScrollIntoView(true);", element);
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	 
	 
  } 
  @BeforeTest
  public void beforeTest() {
	  AppsSelect as= new AppsSelect();
	  as.hitUrl();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
