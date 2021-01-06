package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchResults {
	
	private static final Logger logger = LogManager.getLogger(SearchResults.class);
	WebDriver driver;
	
	public SearchResults(WebDriver driver) {
		logger.info("Creating SearchResults object..");
		this.driver = driver;
	}
	
	By devicesTabBtn = By.xpath("//*[@id=\"search-results\"]/div/div[3]/div[1]/div/div[1]/div/div[2]/a");
	
	By lblPhoneName = By.xpath("//span[contains(@class,'m-p-pc__title') and contains(text(),'iPhone 12 Pro Max')]");
	
	
	public void clickDevicesTab() {
		logger.info("Clicking devices tab..");
		driver.findElement(devicesTabBtn).click();
	}
	
	public void isDisplayedSearchPhone() {
		
		logger.info("Checking phone names are equal..");
		if(driver.findElement(lblPhoneName).getAttribute("innerHTML").contains("iPhone 12 Pro Max 512 GB")) {
			System.out.println("Phone is displayed");
			
		}else {
			System.out.println("Phone is not displayed");
		}
	}
}
