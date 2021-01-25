package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage extends BasePage {
	
	private static final Logger logger = LogManager.getLogger(HomePage.class);
	public String phoneName ="iPhone 12 Pro Max 512 GB";
	WebDriver driver;
	
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		logger.info("HomePage constructor is created..");
		init(driver);
	}
	
	//WebElement searchBox = driver.findElement(By.className("icon-search"));
	By searchButton = By.className("icon-search");
	
	
	//WebElement searchBox1 = driver.findElement(By.name("qx"));
	By txtSearchField = By.name("qx");
	
	//WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"header-search\"]/div[1]/div/div/form/div/button/i"));
	By txtSearchButton = By.xpath("//*[@id=\"header-search\"]/div[1]/div/div/form/div/button/i");
	
	By buttonPasaj = By.xpath("/html/body/header/div[2]/div/nav/a[1]");

	
	public void clickSearch() {
		logger.info("Clicking search button..");
	//	driver.findElement(searchButton).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
	//	getElement(searchButton).click();
		clickElement(searchButton);
	}
	
	public void setTxtField() {
		logger.info("Setting text field with product..");
		//driver.findElement(txtSearchField).sendKeys(phoneName);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(txtSearchField)).sendKeys(phoneName);
		getElement(txtSearchField).sendKeys(phoneName);
	}
	
	public void clickTxtSearchBtn() {
		logger.info("Clicking search button..");
	//	driver.findElement(txtSearchButton).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(txtSearchButton)).click();
	//	getElement(txtSearchButton).click();
		clickElement(txtSearchButton);
	}
	
	public void clickPasajBtn() {
		logger.info("Clicking pasaj button..");
	//	driver.findElement(buttonPasaj).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(buttonPasaj)).click();
	//	getElement(buttonPasaj).click();
		clickElement(buttonPasaj);
	}
}
