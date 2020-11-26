package freeCRM;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class SignUp extends Launch {
	@Test
  public void NewUser() {
	  SignUp sn= new SignUp();
	  sn.hitUrl();
	  driver.findElement(By.xpath("//a[contains (text(),'Sign Up')]")).click();
	  System.out.println(driver.getCurrentUrl());
		 Assert.assertEquals(driver.getCurrentUrl(), "https://register.freecrm.com/register/","Invalid Page");
		 
	  	   }
	
  @AfterTest
  public void TearDowm() {
	 //for( String currentwindowHandle:driver.getWindowHandles()) {
	//	 driver.switchTo().window(currentwindowHandle);
		  driver.close();
 
	// }
	   }
}
