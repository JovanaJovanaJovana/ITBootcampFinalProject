package MyStorePageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	
	public static final String AddToCart_Url = "http://automationpractice.com/index.php?id_product=5&controller=product";

	WebDriverWait wait;
	
	By quantity_btn = By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']");;
	By size_field = By.id("group_1");
	By m_size = By.xpath("//option[contains(text(),'M')]");
	By blue_color = By.id("color_14");
	By add_to_cart_btn = By.name("Submit");
	By proceed_btn = By.cssSelector("a[title='Proceed to checkout']");
	
	public void addToCart(WebDriver driver, String Msize) {
		WebElement quantityButtonUp = driver.findElement(quantity_btn);
		quantityButtonUp.click();
		Select size_list = new Select (driver.findElement(size_field));
		size_list.selectByValue("2");
		WebElement blueColor = driver.findElement(blue_color);
		blueColor.click();
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(add_to_cart_btn));
		WebElement addToCartBtn = driver.findElement(add_to_cart_btn);
		addToCartBtn.click();
	}
	
	public void proceedToCheckout(WebDriver driver) {
		WebElement proceedBtn = driver.findElement(proceed_btn);
		proceedBtn.click(); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")));
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
	}
	
	public void waitQuantityFiled(WebDriver driver) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(quantity_btn));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
