package TestNGsample;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(String s, String s1) {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver d = new ChromeDriver();
	  d.get("https://www.google.co.in/");
	  
	  WebElement search = d.findElement(By.id("lst-ib"));
	  search.sendKeys(s);
	  search.sendKeys(s1);
	  search.sendKeys(Keys.ENTER);
	  d.close();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Selenium interview questions  ", "India" },
      new Object[] { "Webdriver commands  ", "Australai" },
      new Object[] { "Webdriver commonly used  ", "japan" },
      new Object[] { "Webdriver java commands  ", "China" },
      new Object[] { "Webdriver jar files  ", "USA" },
    };
  }
}
