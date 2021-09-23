package sampleproj.batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\selenium\\src\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("janhvijaware11@gmail.com");
     driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("janhvi123");
  }
}
