package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase02 {
  @Test
  public void FindAllLinks() {
	  System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"C:\\Users\\user\\Desktop\\CogniwiseAssignments\\SeleniumDependancys\\Logfile.txt");
		
		WebDriver driver=new FirefoxDriver(); 
		
		driver.navigate().to("http://cogniwize.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("printing Liks......................");
		
		
		System.out.println("Total lnks are : "+links.size());
		
  }
}
