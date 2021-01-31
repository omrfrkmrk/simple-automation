package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Actions extends ElementService {

	private static final Logger logger = LogManager.getLogger(Cases.class);
	public static WebDriver driver;

	public void clickElement(By by) {
		getElement(by).click();
	}

	public void setTextToElement(By by, String text) {
		getElement(by).sendKeys(text);
	}

	public static void goToBottomOfPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		logger.info("JavascriptExecuter is created to go bottom of the page(thirdCase)...");

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		logger.info("Accessed bottom of the page(thirdCase)...");
	}
}
