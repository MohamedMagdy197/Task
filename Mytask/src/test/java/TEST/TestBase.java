package TEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	 private static final String Helper = null;
	public  WebDriver driver;
	 
	 @BeforeSuite
	 public void startDriver() {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.demoblaze.com/index.html");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
	 }
	 @AfterSuite
	 public void stop() {
		// driver.quit();
	 }
	
}
