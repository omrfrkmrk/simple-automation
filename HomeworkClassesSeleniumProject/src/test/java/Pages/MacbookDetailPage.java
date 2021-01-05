package Pages;

import java.text.NumberFormat;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MacbookDetailPage {
	
	WebDriver driver;
	
	public MacbookDetailPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By installmentAmount = By.xpath("//*[@id=\"product-detail\"]/div[1]/div/div/div[2]/form/div[2]/label/div[1]/span[2]/span");
	
	By installmentSixMonths = By.xpath("//*[@id=\"product-detail\"]/div[1]/div/div/div[2]/form/div[2]/label/div[2]/a[1]");
										
	By installmentNineMonths = By.xpath("//*[@id=\"product-detail\"]/div[1]/div/div/div[2]/form/div[2]/label/div[2]/a[2]");
	
	
	public void checkInstallmentAmount() throws ParseException {
		String installmentAmountStr = driver.findElement(installmentAmount).getAttribute("innerHTML");
		int installmentAmountInt = (int)Math.round((Double) NumberFormat.getInstance().parse(installmentAmountStr));
		
		if(installmentAmountInt > 1000) {
			System.out.println("Installment Amount is bigger than 1000");
		}else {
			System.out.println("Installment Amount is not bigger than 1000");
		}
	}
	
	public void compareSixandNineMonths() throws ParseException {
		Double i=(double) 0;
		String sixMonthsPrice = driver.findElement(installmentSixMonths).getAttribute("data-price");
		int priceSix = (int)Math.round((Double) NumberFormat.getInstance().parse(sixMonthsPrice));
		//int priceSix = (int)Math.round(i);
		
		String nineMonthsPrice = driver.findElement(installmentNineMonths).getAttribute("data-price");
		int priceNine = (int)Math.round((Double) NumberFormat.getInstance().parse(nineMonthsPrice));
		
		//int sixMonthsPrice = Math.round(Integer.parseInt(driver.findElement(installmentSixMonths).getAttribute("data-price")));
		//int nineMonthsPrice = Math.round(Integer.parseInt(driver.findElement(installmentNineMonths).getAttribute("data-price")));
		
		if(priceSix > priceNine) {
			System.out.println("Installment Amount with six months is bigger than nine");
		}else {
			System.out.println("Installment Amount with six months is not bigger than nine");
		}
	}
}
