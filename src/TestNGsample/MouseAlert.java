package TestNGsample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class MouseAlert {
	WebDriver d;
	  @Test 
  public void Mouse() {
		  d.get("https://jqueryui.com/draggable/");
		  
		  d.switchTo().frame(0);
		  WebElement drag = d.findElement(By.id("draggable")); 
		  
		  Actions act = new Actions(d);
		  act.dragAndDropBy(drag, 300, 0).build().perform();
		  		  
		  
  }
	  
	  @Test (enabled = false)
	  public void Alert() throws InterruptedException{
		   d.get("https://www.irctc.co.in/");
		  d.findElement(By.id("loginbutton")).click();
		  
	  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  d = new ChromeDriver();
  }
  @AfterClass
  public void afterClass() {
	  
	  
  }

}
