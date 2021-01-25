package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchResults extends BasePage{
	
	private static final Logger logger = LogManager.getLogger(SearchResults.class);
	WebDriver driver;
	
	public SearchResults(WebDriver driver) {
		logger.info("Creating SearchResults object..");
		this.driver = driver;
		init(driver);
	}
	
	By devicesTabBtn = By.xpath("//*[@id=\"search-results\"]/div/div[3]/div[1]/div/div[1]/div/div[2]/a");
	
	By lblPhoneName = By.xpath("//span[contains(@class,'m-p-pc__title') and contains(text(),'iPhone 12 Pro Max')]");
	
	
	public void clickDevicesTab() {
		logger.info("Clicking devices tab..");
	//	driver.findElement(devicesTabBtn).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(devicesTabBtn)).click();
	//	getElement(devicesTabBtn).click();
		clickElement(devicesTabBtn);
	}
	
	public void isDisplayedSearchPhone() {
		//Assert is essential !!!
		logger.info("Checking phone names are equal..");
		if(getElement(devicesTabBtn).getAttribute("innerHTML").contains("iPhone 12 Pro Max 512 GB")) {
			System.out.println("Phone is displayed");
			
		}else {
			System.out.println("Phone is not displayed");
		}
	}
}
