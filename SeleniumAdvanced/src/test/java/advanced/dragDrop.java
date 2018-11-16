package advanced;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class dragDrop {
	ChromeDriver driver;
	  public void f() throws InterruptedException {
//		  driver.findElement(By.linkText("Products"));
//		  Actions act = new Actions(driver);
//		  act.moveToElement(driver.findElement(By.cssSelector("a[href='/personal/products']"))).perform();
//		  Thread.sleep(5000);
//		  act.moveToElement(driver.findElement(By.cssSelector("a[href='/personal/products/demat']"))).perform();
//		  driver.findElement(By.cssSelector("a[href='/personal/products/demat/demat-account']")).click();
	  }
	  @Test
	  public void beforeTest()
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\Selenium folder\\chromedriver.exe");
		  driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
            WebElement from=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_RadTreeView1']/ul/li/ul/li[3]/ul/li[1]/div/div/span"));	
            WebElement to=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1"));	  
	  
            Actions act = new Actions(driver);
            act.clickAndHold(from).release(to).perform();
            WebDriverWait wait = new WebDriverWait(driver ,20);
            wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("ctl00_ContentPlaceholder1_Label1"), "Drop a package here to check price"));
         String price= driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();	 
         System.out.println(price);
	  }
	  
	}
