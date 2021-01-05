package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.SearchResults;

public class firstCase {

	
	public static void main(String[] args) {
		
		String url = "https:\\turkcell.com.tr";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omer_\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Created object of home page
		HomePage home = new HomePage(driver);
		
		//Created object of search results page
		SearchResults res = new SearchResults(driver);
		
		home.clickSearch();
		home.setTxtField();
		home.clickTxtSearchBtn();
		
		res.clickDevicesTab();
		
		res.isDisplayedSearchPhone();
		
		driver.quit();
	}

}
