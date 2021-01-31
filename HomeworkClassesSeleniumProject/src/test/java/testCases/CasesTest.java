package testCases;

import java.text.ParseException;

import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.HomePage;
import Pages.MacbookDetailPage;
import Pages.MacbookPage;
import Pages.PasajPage;
import Pages.SearchResults;
import TestBase.TestBase;

public class CasesTest extends TestBase {

	@Test
	public void firstCaseTest() {
		HomePage homePage = new HomePage(driver);
		SearchResults searchResult = new SearchResults(driver);

		homePage.clickSearch();
		homePage.setTxtField();
		homePage.clickTxtSearchBtn();
		searchResult.clickDevicesTab();
		searchResult.isDisplayedSearchPhone();
	}

	@Test
	public void secondCaseTest() {
		HomePage homePage = new HomePage(driver);
		PasajPage pasajPage = new PasajPage(driver);

		homePage.clickPasajBtn();
		pasajPage.clickCartButton();
		pasajPage.isDisplayedEmptyCartMessage();
	}

	@Test
	public void thirdCaseTest() throws ParseException {
		HomePage homePage = new HomePage(driver);
		PasajPage pasajPage = new PasajPage(driver);
		MacbookPage macbookPage = new MacbookPage(driver);
		MacbookDetailPage macbookDetailPage = new MacbookDetailPage(driver);

		homePage.clickPasajBtn();
		BasePage.goToBottomOfPage();
		pasajPage.clickMacbookButton();
		macbookPage.clickMacbookDetail();
		macbookDetailPage.CheckPriceForMacbook();
	}
}
