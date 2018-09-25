package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtest {
	public WebDriver driver ;
	@BeforeTest
	public void init() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		 driver=new ChromeDriver();
		//Thread.sleep(3000);
		
		
	}
	@Test
	public void test() throws InterruptedException
	{
		String expected ="SEM Webpage";
		driver.get("http://18.217.126.56:8080/hello/");
		String actual=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/h1")).getText();
	if(actual.contentEquals(expected))
		{
			System.out.println("SEM WEBPAGE exsist");
		}
		else
		{
			System.out.println("SEM WEBPAGE does not exsist");
		}
	       WebElement li=driver.findElement(By.xpath("/html/body/ul/li/a"));
	       if(li.isDisplayed() && li.isEnabled())
	       {
	    	   li.click();
	    	   Thread.sleep(2000);
//	    	  Boolean bo=driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div/div[1]/a/img")).isDisplayed();
//	          if(bo.toString()=="True")
//	          {
//	        	  System.out.println("Image exist");
//	          }
//	          else
//	          {
//	        	  System.out.println("Image does not exist");
//	          }
      }
	       
	} 
	       @AfterTest
	       public void aft()
	       {
	    	   //driver.quit();
	    	   driver.close();
	       }
	       
	
	
	
	

}
