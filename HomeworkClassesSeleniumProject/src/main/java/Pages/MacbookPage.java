package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MacbookPage extends BasePage {

	WebDriver driver;
	private static final Logger logger = LogManager.getLogger(MacbookPage.class);

	public MacbookPage(WebDriver driver) {
		logger.info("Creating MacbookPage object..");
		this.driver = driver;
		init(driver);
	}

	By macbookPro = By.xpath("//*[@id=\"all-devices-section\"]/div[45]/a");

	public void clickMacbookDetail() {
		logger.info("Clicking Macbok detail...");
		actions.clickElement(macbookPro);
	}
}
