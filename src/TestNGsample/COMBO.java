package TestNGsample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class COMBO {
	WebDriver d;
		  @Test
  public void Name() throws InterruptedException {
			  Thread.sleep(2000);
			  d.findElement(By.id("u_0_i")).sendKeys("Joseph");
		  
		  
  }
  @BeforeMethod
  public void BeforeMethod(){
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  
	  d = new ChromeDriver();
	  d.get("https://www.facebook.com/");
	  
	    }

  
  @AfterMethod
  public void afterMethod() {

  }

  @BeforeClass
  public void BeforeClass() {
  }
  @AfterClass
  public void ac() {

  }

}
