package freeCRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

@Test
public class GroupVideo extends Launch {
  public void Video() {
	  driver.findElement(By.xpath("//*[contains(text(),'Group Video')]")).click();
	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	 for( String ChildWindowHandle:driver.getWindowHandles()) {
		 driver.switchTo().window(ChildWindowHandle);
		 String GroupVideo= driver.getCurrentUrl();	
		 SoftAssert SoftAssert=new SoftAssert();
		 SoftAssert.assertEquals(GroupVideo,"https://zoom.cogmento.com/");
		 SoftAssert.assertAll();
	 }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  GroupVideo gv= new GroupVideo();
	  gv.hitUrl();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
