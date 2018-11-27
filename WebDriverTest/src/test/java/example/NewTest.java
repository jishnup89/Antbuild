package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver ;
	@Test
	public void test() throws InterruptedException
	{
//		String expected ="SEM Webpage";
		driver.get("http://18.223.101.200:8080/hello/");
		driver.findElement(By.linkText("Se-Mentor")).click();
	}	
  @BeforeTest
	public void init() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		Thread.sleep(3000);
	}

  @AfterTest
  public void aft()
  {
	   //driver.quit();
	   driver.close();
  }

}
