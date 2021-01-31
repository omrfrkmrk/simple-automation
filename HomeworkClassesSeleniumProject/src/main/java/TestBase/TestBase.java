package TestBase;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Pages.Cases;

public class TestBase {

	String url = "https:\\turkcell.com.tr";
	public static WebDriver driver;
	private static final Logger logger = LogManager.getLogger(Cases.class);

	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
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
