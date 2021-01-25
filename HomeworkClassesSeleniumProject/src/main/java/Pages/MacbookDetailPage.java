package Pages;

import java.text.NumberFormat;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacbookDetailPage extends BasePage {
	
	private static final Logger logger = LogManager.getLogger(MacbookDetailPage.class);
	WebDriver driver;
	
	public MacbookDetailPage(WebDriver driver) {
		logger.info("Creating MacbookDetailPage object..");
		this.driver = driver;
		init(driver);
	}
	
	By installmentAmount = By.xpath("//*[@id=\"product-detail\"]/div[1]/div/div/div[2]/form/div[2]/label/div[1]/span[2]/span");
	
	By installmentSixMonths = By.xpath("//*[@id=\"product-detail\"]/div[1]/div/div/div[2]/form/div[2]/label/div[2]/a[1]");
										
	By installmentNineMonths = By.xpath("//*[@id=\"product-detail\"]/div[1]/div/div/div[2]/form/div[2]/label/div[2]/a[2]");
	
	By price = By.xpath("//*[@id=\"product-detail\"]/div[1]/div/div/div[2]/form/div[2]/label/div[1]/span[2]/span");
	
	
	public void checkInstallmentAmount() {		
		int installmentAmountInt=0;
		try {
			logger.info("Trying to get installmentAmount from screen with using findElement...");
			String installmentAmountStr = driver.findElement(installmentAmount).getAttribute("innerHTML");
			
			logger.info("Trying to convert installmentAmount to integer value...");
			installmentAmountInt = (int)Math.round((Double) NumberFormat.getInstance().parse(installmentAmountStr));
		} catch (ParseException e) {
			logger.error("Error during parsing and round installement amount...");
		}
		
		logger.info("Comparing installment amount with 1000...");
		if(installmentAmountInt > 1000) {
			System.out.println("Installment Amount is bigger than 1000");
		}else {
			System.out.println("Installment Amount is not bigger than 1000");
		}
	}
	
	public void compareSixandNineMonths(){		
		int priceSix=0;
		int priceNine=0;
		
		try {
			logger.info("Trying to get installmentSixMonths from screen with using findElement...");
			String sixMonthsPrice = driver.findElement(installmentSixMonths).getAttribute("data-price");
			
			logger.info("Trying to convert sixMonthsPrice to integer value...");
			priceSix = (int)Math.round((Double) NumberFormat.getInstance().parse(sixMonthsPrice));
		} catch (ParseException e) {
			logger.fatal("Error during parsing and round sixMonthsPrice...");
		}
		
		try {
			logger.info("Trying to get installmentNineMonths from screen with using findElement...");
			String nineMonthsPrice = driver.findElement(installmentNineMonths).getAttribute("data-price");
			
			logger.info("Trying to convert nineMonthsPrice to integer value...");
			priceNine = (int)Math.round((Double) NumberFormat.getInstance().parse(nineMonthsPrice));
		} catch (ParseException e) {
			logger.error("Error during parsing and round nineMonthsPrice...");
		}
		
		logger.info("Comparing sixMonthsPrice and installmentNineMonths...");
		if(priceSix > priceNine) {
			System.out.println("Installment Amount with six months is bigger than nine");
		}else {
			System.out.println("Installment Amount with six months is not bigger than nine");
		}
	}
	
	public void CheckPriceForMacbook() {
		String priceStr = getElement(price).getAttribute("innerHTML");
		int priceInt = Integer.parseInt(priceStr.replace(".", ""));
		
		if(priceInt > 10000) {
			System.out.println("Price is bigger than 10000");
		}
	}
	
	
	
	
	
	
	
}
