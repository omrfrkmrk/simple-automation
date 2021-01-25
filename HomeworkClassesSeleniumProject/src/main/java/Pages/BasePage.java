package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private final int DEFAULT_WAIT = 20;
	public WebDriverWait wait;
	
	public void init(WebDriver driver) {
		wait = new WebDriverWait(driver, DEFAULT_WAIT);
	}
	
	public WebElement getElement(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void clickElement(By by) {
		getElement(by).click();
	}
	
}
