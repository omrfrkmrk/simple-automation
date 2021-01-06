package testCases;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	private static final Logger logger = LogManager.getLogger(Cases.class);
	
	
	public static void main(String[] args) throws ParseException {
		
		firstCase();
		secondCase();
		thirdCase();
	}
	
	public static void firstCase() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omer_\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		logger.info("Chrome is opening(firstCase)...");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("Chrome is maximized(firstCase)...");
		
		//Created object of home page
		HomePage home = new HomePage(driver);
		logger.info("MainPage object created(firstCase)...");
		
		//Created object of search results page
		SearchResults res = new SearchResults(driver);
		logger.info("SearchResult object created(firstCase)...");
		
		home.clickSearch();
		logger.info("Clicked search button in mainpage successfully(firstCase)...");
		
		home.setTxtField();
		logger.info("Set mobile phone name on txtField(firstCase)...");
		
		home.clickTxtSearchBtn();
		logger.info("Successfully clicked search button(firstCase)...");
		
		res.clickDevicesTab();
		logger.info("Clicked devices tab on searchresults(firstCase)...");
		
		res.isDisplayedSearchPhone();
		logger.info("Checked searched phone is same with listed one(firstCase)...");
		
		driver.quit();
		logger.info("Chrome was closed successfully(firstCase)..");
	}
	
	public static void secondCase() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omer_\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		logger.info("Chrome is opening(secondCase)...");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("Chrome is maximized(secondCase)...");
		
		HomePage home = new HomePage(driver);
		logger.info("MainPage object created(secondCase)...");
		
		home.clickPasajBtn();
		logger.info("Clicked pasaj button(secondCase)...");
		
		PasajPage psj = new PasajPage(driver);
		logger.info("Created PasajPage object(secondCase)...");
		
		psj.clickCartButton();
		logger.info("Clicked cart button(secondCase)..");
		
		psj.isDisplayedEmptyCartMessage();
		logger.info("Shown empty cart message on screen(secondCase)..");
		
		driver.quit();
		logger.info("Chrome was closed successfully(secondCase)..");
	}

	public static void thirdCase() throws ParseException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omer_\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		logger.info("Created wait object(thirdCase)...");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		logger.info("JavascriptExecuter is created to go bottom of the page(thirdCase)...");
		
		logger.info("Chrome is opening(thirdCase)...");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		logger.info("Chrome is maximized(thirdCase)...");
		
		HomePage home = new HomePage(driver);
		logger.info("MainPage object created(thirdCase)...");
		
		PasajPage psj = new PasajPage(driver);
		logger.info("Created PasajPage object(thirdCase)...");
		
		home.clickPasajBtn();
		logger.info("Clicked pasaj button(thirdCase)...");
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		logger.info("Accessed bottom of the page(thirdCase)...");
		
		psj.clickMacbookButton();
		logger.info("Clicked Apple Macbook under Popüler Markalar title(thirdCase)...");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"all-devices-section\"]/div[26]/a/div[1]/div/div[1]/div/div[1]/figure/img")));
		logger.info("Displayed product Macbook pro(thirdCase)...");
		
		MacbookPage mb = new MacbookPage(driver);
		logger.info("MacbookPage object is created(thirdCase)...");
		
		MacbookDetailPage mdp = new MacbookDetailPage(driver);
		logger.info("MacbookDetailPage object is created(thirdCase)...");
		
		mb.clickMacbookDetail();
		logger.info("Successfully clicked Macbook product(thirdCase)...");
		
		mdp.checkInstallmentAmount();
		logger.info("Successfully Checked installmentAmount(thirdCase)...");
		
		mdp.compareSixandNineMonths();
		logger.info("Successfully compared six months installment and nine months installment(thirdCase)...");
		
		driver.quit();
		logger.info("Chrome was closed successfully(thirdCase)..");
	}
}
