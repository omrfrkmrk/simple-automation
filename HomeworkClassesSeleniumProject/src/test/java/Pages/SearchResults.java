package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResults {
	
	WebDriver driver;
	
	public SearchResults(WebDriver driver) {
		this.driver = driver;
	}
	
			
	By devicesTabBtn = By.xpath("//*[@id=\"search-results\"]/div/div[3]/div[1]/div/div[1]/div/div[2]/a");
	
	By lblPhoneName = By.xpath("//span[contains(@class,'m-p-pc__title') and contains(text(),'iPhone 12 Pro Max')]");
	
	
	public void clickDevicesTab() {
		driver.findElement(devicesTabBtn).click();
	}
	
	public void isDisplayedSearchPhone() {
		
		if(driver.findElement(lblPhoneName) != null) {
			System.out.println("Phone is displayed");
		}else {
			System.out.println("Phone is not displayed");
		}
	}
}
