package TestNGsample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Title {
	WebDriver d;
  @Test
  public void f() {
	  String ET = "Google";
	  String AT = d.getTitle();
	  
	  if(ET.equals(AT)) System.out.println("Pass");
	  else System.out.println("fail");
	  System.out.println(d.getTitle());
	  System.out.println(d.getCurrentUrl());
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://www.google.com/");
	  
  }

  @AfterClass
  public void afterClass() {
	  d.close();
  }

}
