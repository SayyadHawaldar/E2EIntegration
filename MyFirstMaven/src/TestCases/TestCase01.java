package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase01 {
  @Test
  public void ORMLogin () throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Users\\user\\Desktop\\CogniwiseAssignments\\SeleniumDependancys\\chromedriver_win32\\Logfile.txt");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(3000); //wait for home page to load
		
		//Logout
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);	
		
		driver.close();

  }
}
