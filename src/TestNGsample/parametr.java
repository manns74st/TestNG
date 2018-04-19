package TestNGsample;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class parametr {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	System.out.println(n);
	System.out.println(s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Joseph" },
      new Object[] { 2, "kanaga" },
      new Object[] { 3, "Jenisha" },
      new Object[] { 4, "Johann" },
    };
  }
}
