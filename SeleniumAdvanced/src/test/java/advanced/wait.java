package advanced;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class wait {
	ChromeDriver driver;
@Test
public void t() throws InterruptedException
	  {
//		  driver.findElement(By.linkText("Log in")).click();
//			driver.findElement(By.id("Email")).sendKeys("tirzaholivia14@gmail.com");
//			driver.findElement(By.id("Password")).sendKeys("3zagts14");
//			driver.findElement(By.cssSelector("input[value='Log in']")).click();
//			driver.findElement(By.partialLinkText("Shopping cart")).click();
		    driver.findElement(By.name("discountcouponcode")).sendKeys("AutomationDiscount");
		    Thread.sleep(3000);
			driver.findElement(By.name("applydiscountcouponcode")).click();
			WebDriverWait w= new WebDriverWait(driver,20);
			w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("message")));
			String value= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[1]/div[4]")).getText();	 
	         System.out.println(value);
	  }
	  @BeforeClass
	  public void beforeClass()
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\Selenium folder\\chromedriver.exe");
		  driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("tirzaholivia14@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("3zagts14");
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			driver.findElement(By.partialLinkText("Shopping cart")).click();
       
	  }
	
} 
	
