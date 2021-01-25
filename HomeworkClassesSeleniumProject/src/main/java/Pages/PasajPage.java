package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PasajPage extends BasePage {
	
	String emptyCartMessage ="Sepetinizde ürün bulunmamaktadır.";
	WebDriver driver;
	private static final Logger logger = LogManager.getLogger(PasajPage.class);
	
	public PasajPage(WebDriver driver) {
		logger.info("Creating PasajPage object..");
		this.driver = driver;
		init(driver);
	}
	
	By cartButton = By.xpath("/html/body/header/div[1]/div[2]/a");
	
	By lblEmptyCart = By.xpath("//*[@id=\"basket\"]/div/div/form/div[1]/div/div/h3");
	
	By macbookButton = By.xpath("/html/body/footer/div[1]/div/nav/div/div[3]/ul/li[11]/a");
	
	
	public void clickCartButton() {
		logger.info("Clicking cart button..");
	//	driver.findElement(cartButton).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(cartButton)).click();
	//	getElement(cartButton).click();
		clickElement(cartButton);
	}
	
	public void clickMacbookButton() {
		logger.info("Clicking Macbook button..");
	//	driver.findElement(macbookButton).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(macbookButton)).click();
	//	getElement(macbookButton).click();
		clickElement(macbookButton);
	}
	
	public void isDisplayedEmptyCartMessage() {
		//Assertion is essential !!!
		logger.info("Displaying emptyCart message...");
		if(getElement(lblEmptyCart).getAttribute("innerHTML").contains(emptyCartMessage)) {
			System.out.println("Empty Cart Message is displayed");
		}else {
			System.out.println("Empty Cart Message is not displayed");
		}
	}
}
