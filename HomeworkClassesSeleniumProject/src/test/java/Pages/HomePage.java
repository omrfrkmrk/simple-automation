package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	public String phoneName ="iPhone 12 Pro Max 512 GB";
	WebDriver driver;
	
	//Constructor
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	//WebElement searchBox = driver.findElement(By.className("icon-search"));
	By searchButton = By.className("icon-search");
	
	//WebElement searchBox1 = driver.findElement(By.name("qx"));
	By txtSearchField = By.name("qx");
	
	//WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"header-search\"]/div[1]/div/div/form/div/button/i"));
	By txtSearchButton = By.xpath("//*[@id=\"header-search\"]/div[1]/div/div/form/div/button/i");
	
	By buttonPasaj = By.xpath("/html/body/header/div[2]/div/nav/a[1]");
	
	
	public void clickSearch() {
		driver.findElement(searchButton).click();
	}
	
	public void setTxtField() {
		driver.findElement(txtSearchField).sendKeys(phoneName);
	}
	
	public void clickTxtSearchBtn() {
		driver.findElement(txtSearchButton).click();
	}
	
	public void clickPasajBtn() {
		driver.findElement(buttonPasaj).click();
	}
}
