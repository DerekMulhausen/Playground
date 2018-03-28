package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1 {

	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmulhausen\\workspace\\selenium jars\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://www.edureka.co");//gets the url
			searchCourse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//test
		}
		
	}
	public void searchCourse()
	{
		try {
			driver.findElement(By.id("search-inp1")).sendKeys("Java");
			Thread.sleep(3000);
			driver.findElement(By.id("search-button-bottom")).click();
			jse=(JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 800)");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//label[contains(text(), 'Weekend');")).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Day1 myObj=new Day1();
		myObj.invokeBrowser();
	}

}
