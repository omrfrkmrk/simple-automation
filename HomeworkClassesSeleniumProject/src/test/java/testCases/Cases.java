package testCases;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.HomePage;
import Pages.MacbookDetailPage;
import Pages.MacbookPage;
import Pages.PasajPage;
import Pages.SearchResults;

public class Cases {

	static String url = "https:\\turkcell.com.tr";
	
	public static void main(String[] args) throws ParseException {
		firstCase();
		secondCase();
		thirdCase();
	}
	
	public static void firstCase() {
		
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
	
	public static void secondCase() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omer_\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		HomePage home = new HomePage(driver);
		home.clickPasajBtn();
		
		
		PasajPage psj = new PasajPage(driver);
		
		psj.clickCartButton();
		psj.isDisplayedEmptyCartMessage();
		
		driver.quit();
	}

	public static void thirdCase() throws ParseException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omer_\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		HomePage home = new HomePage(driver);
		PasajPage psj = new PasajPage(driver);
		
		
		home.clickPasajBtn();
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		psj.clickMacbookButton();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"all-devices-section\"]/div[26]/a/div[1]/div/div[1]/div/div[1]/figure/img")));
		
		MacbookPage mb = new MacbookPage(driver);
		MacbookDetailPage mdp = new MacbookDetailPage(driver);
		
		mb.clickMacbookDetail();
		mdp.checkInstallmentAmount();
		mdp.compareSixandNineMonths();
		
		driver.quit();
	}
}
