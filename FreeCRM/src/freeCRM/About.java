package freeCRM;

import org.testng.annotations.Test;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class About extends Launch {
	
	@ BeforeTest
	public void CallLaunch() {
		About ab= new About();
		  ab.hitUrl();
	}
	
  @Test(priority=1)
  public void CheckAbout() {
	  driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
	  Assert.assertEquals(driver.getCurrentUrl(),"https://freecrm.co.in/about.html","Invalid page");
	  }
  
 @Test(priority=2)
 public void scrollDown() {
	 driver.navigate().back();
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	 //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//driver.wait(2000, nanos);
	WebElement element= driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(true);",element);
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
