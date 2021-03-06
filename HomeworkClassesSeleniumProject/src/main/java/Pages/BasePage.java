package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public static WebDriver driver;
	private static final Logger logger = LogManager.getLogger(Cases.class);
	public Actions actions;
	public Validations validations;
	public ElementService elementService;
	public WebDriverWait wait;

	public void init(WebDriver driver) {
		this.driver = driver;
		actions = new Actions();
		validations = new Validations();
		elementService = new ElementService();
	}

	public static void goToBottomOfPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		logger.info("JavascriptExecuter is created to go bottom of the page(thirdCase)...");

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		logger.info("Accessed bottom of the page(thirdCase)...");
	}

}
