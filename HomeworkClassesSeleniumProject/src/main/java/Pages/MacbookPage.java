package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacbookPage {
	
	WebDriver driver;
	private static final Logger logger = LogManager.getLogger(MacbookPage.class);
	
	public MacbookPage(WebDriver driver) {
		logger.info("Creating MacbookPage object..");
		this.driver = driver;
	}
		
	By macbookPro = By.xpath("//*[@id=\"all-devices-section\"]/div[27]");
	
	public void clickMacbookDetail() {
		logger.info("Clicking Macbok detail...");
		driver.findElement(macbookPro).click();
	}
}
