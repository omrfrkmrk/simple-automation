package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasajPage {
	
	String emptyCartMessage ="Sepetinizde ürün bulunmamaktadır.";
	WebDriver driver;
	
	public PasajPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By cartButton = By.xpath("/html/body/header/div[1]/div[2]/a");
	
	By lblEmptyCart = By.xpath("//*[@id=\"basket\"]/div/div/form/div[1]/div/div/h3");
	
	By macbookButton = By.xpath("/html/body/footer/div[1]/div/nav/div/div[3]/ul/li[11]/a");
	
	
	public void clickCartButton() {
		driver.findElement(cartButton).click();
	}
	
	public void clickMacbookButton() {
		driver.findElement(macbookButton).click();
	}
	
	public void isDisplayedEmptyCartMessage() {
		if(driver.findElement(lblEmptyCart).getAttribute("innerHTML").contains(emptyCartMessage)) {
			System.out.println("Empty Cart Message is displayed");
		}else {
			System.out.println("Empty Cart Message is not displayed");
		}
	}
}
