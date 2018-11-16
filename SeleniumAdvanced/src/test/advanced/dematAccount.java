package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dematAccount {
	ChromeDriver driver;
  @Test
  public void f() {
	  //driver.findElement(By.linkText("Products")).click();
  }
  @BeforeTest
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\Selenium folder\\chromedriver.exe");
	  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
  }
  @AfterTest
  {
	  
  }
}
