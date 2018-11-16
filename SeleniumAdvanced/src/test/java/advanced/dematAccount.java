package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dematAccount {
	ChromeDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.linkText("Products"));
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.cssSelector("a[href='/personal/products']"))).perform();
	  Thread.sleep(5000);
	  act.moveToElement(driver.findElement(By.cssSelector("a[href='/personal/products/demat']"))).perform();
	  driver.findElement(By.cssSelector("a[href='/personal/products/demat/demat-account']")).click();
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\Selenium folder\\chromedriver.exe");
	  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
  }
  @AfterTest
  public void afterTest()
  {
	  
  }
}
