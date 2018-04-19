package TestNGsample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class EX2 {
	WebDriver d;
  @Test
  public void TC1() {
	  d.findElement(By.linkText("Projects")).click();
	  System.out.println(d.getTitle());
  }
  @Test
  public void TC2(){
	  d.findElement(By.linkText("Download")).click();
	  System.out.println(d.getTitle());
  }
  @Test
  public void TC3() {
  	d.findElement(By.linkText("Documentation")).click();
  	System.out.println(d.getTitle());
  	
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(d.getTitle());
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  d.get("https://docs.seleniumhq.org/");
	  Thread.sleep(2000);
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://docs.seleniumhq.org/");
	  d.manage().window().maximize();
	  }

  @AfterClass
  public void afterClass() {
	 d.close();
  }

}
