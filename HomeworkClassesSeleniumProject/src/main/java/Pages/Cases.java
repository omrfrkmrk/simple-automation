package Pages;

import java.text.ParseException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

// ************************************************************UNUSED PAGE !!!!!!!!!!!!!!!!!!!!  *****************************************
public class Cases extends BasePage {

	private static final Logger logger = LogManager.getLogger(Cases.class);

	public static void firstCase(WebDriver driver) {

		// Created object of home page
		HomePage home = new HomePage(driver);
		logger.info("MainPage object created(firstCase)...");

		// Created object of search results page
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

	}

	public static void secondCase(WebDriver driver) {

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

	}

	public static void thirdCase(WebDriver driver) throws ParseException {

		HomePage home = new HomePage(driver);
		logger.info("MainPage object created(thirdCase)...");

		PasajPage psj = new PasajPage(driver);
		logger.info("Created PasajPage object(thirdCase)...");

		home.clickPasajBtn();
		logger.info("Clicked pasaj button(thirdCase)...");

		goToBottomOfPage();

		psj.clickMacbookButton();
		logger.info("Clicked Apple Macbook under Popüler Markalar title(thirdCase)...");

		MacbookPage mb = new MacbookPage(driver);
		logger.info("MacbookPage object is created(thirdCase)...");

		MacbookDetailPage mdp = new MacbookDetailPage(driver);
		logger.info("MacbookDetailPage object is created(thirdCase)...");

		mb.clickMacbookDetail();
		logger.info("Successfully clicked Macbook product(thirdCase)...");

		mdp.CheckPriceForMacbook();

	}
}
