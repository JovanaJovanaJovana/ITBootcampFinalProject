package myStore.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import MyStorePageObject.AddToCart;
import MyStorePageObject.SummerDresses;

public class AddToCartTest {

	WebDriver driver;
	AddToCart addToCart;
	WebDriverWait wait;

	@Test(priority = 1)
	public void testAddToCart() throws InterruptedException {

		driver.navigate().to(AddToCart.AddToCart_Url);
		addToCart = new AddToCart();
		addToCart.addToCart(driver, "M");

		Thread.sleep(3000);
		
		String printedSummerDress = driver.findElement(By.id("layer_cart_product_title")).getText();
		String blueM = driver.findElement(By.id("layer_cart_product_attributes")).getText();
		String quantity = driver.findElement(By.id("layer_cart_product_quantity")).getText();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(printedSummerDress, "Printed Summer Dress");
		sa.assertEquals(blueM, "Blue, M");
		sa.assertEquals(quantity, "2");
		
		sa.assertAll();
	}
	
	@Test(priority = 2)
	public void testProceedToCheckoutBtn() {
		addToCart.proceedToCheckout(driver);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl ="http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0";
		
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void closeDriver() {
		driver.quit();
	}
	

}
