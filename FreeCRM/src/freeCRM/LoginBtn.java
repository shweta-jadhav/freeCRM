package freeCRM;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginBtn extends Launch{
	@ BeforeTest
	public void BeforeTest() {
		LoginBtn lb=new LoginBtn();
		lb.hitUrl();
	}
	
	@ Test
	public void Login(){
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("D:\\shweta_workbook"));
		}
	
	@AfterTest
	public void AfterTest() {
		driver.close();
	}
	

}
