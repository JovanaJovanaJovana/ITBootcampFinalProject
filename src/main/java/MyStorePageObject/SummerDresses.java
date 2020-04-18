package MyStorePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummerDresses {
	
	public static final String SUMMER_DRESSES_URL = "http://automationpractice.com/index.php?id_category=11&controller=category";

	WebDriverWait wait;
	
	By first_dress = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]");
	
	public void chooseFirstDress(WebDriver driver) {
		WebElement firstDress = driver.findElement(first_dress);
		firstDress.click();
	}
	
	public void waitFirstSummerDress(WebDriver driver) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(first_dress));
	}

}
