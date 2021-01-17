package TestBase;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Pages.Cases;

public class TestBase {
	
	String url = "https:\\turkcell.com.tr";
	public static WebDriver driver;
	private static final Logger logger = LogManager.getLogger(Cases.class);
	
	@BeforeSuite	
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
	}
	  
	@AfterSuite	
	public void afterSuite() {
		System.out.println("After suite");
	}
	  
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	  
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	  
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	  
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	  
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		logger.info("Chrome is opening...");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	  
	@AfterMethod
	public void afterMethod() {
		driver.quit();
		logger.info("Chrome was closed successfully..");
	}
}
