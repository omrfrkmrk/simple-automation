package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MacbookPage {
	
	WebDriver driver;
	
	public MacbookPage(WebDriver driver) {
		this.driver = driver;
	}
		
	By macbookPro = By.xpath("//*[@id=\"all-devices-section\"]/div[26]");
	
	public void clickMacbookDetail() {
		driver.findElement(macbookPro).click();
	}
}
