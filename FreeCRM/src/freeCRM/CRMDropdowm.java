package freeCRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class CRMDropdowm extends Launch{
  @Test
  public void moveToCRM() {
	  Actions action=new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'CRM')]/parent::li[@class='rd-navbar--has-dropdown rd-navbar-submenu']"))).build().perform();
	  action.moveToElement(driver.findElement(By.xpath("//li/a[contains(text(),'Dental CRM')]"))).click().build().perform();
	  //Select select=new Select(driver.findElement(By.xpath("//*[contains(text(),'CRM')]/parent::li[@class='rd-navbar--has-dropdown rd-navbar-submenu']")));
	  //select.selectByVisibleText("Dental CRM");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  WebElement element=driver.findElement(By.xpath("//p[@class='offset-top-35 offset-md-top-57'] /parent::div[@class='cell-md-4 inset-md-left-38 inset-md-right-38']"));
	  js.executeScript("arguments[0].scrollIntoView(true);",element);
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  System.out.println(driver.getCurrentUrl());
	  
  }
  @BeforeTest
  public void beforeTest() {
	  CRMDropdowm dp=new CRMDropdowm();
	  dp.hitUrl();	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
