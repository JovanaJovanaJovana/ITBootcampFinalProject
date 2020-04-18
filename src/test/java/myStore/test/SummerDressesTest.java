package myStore.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MyStorePageObject.Home;
import MyStorePageObject.SummerDresses;

public class SummerDressesTest {
	
	WebDriver driver;
	SummerDresses summerDresses;
	WebDriverWait wait;
	
	@Test
	public void testChoosingFirstDress() {
		driver.navigate().to(SummerDresses.SUMMER_DRESSES_URL);
		summerDresses = new SummerDresses();
		summerDresses.chooseFirstDress(driver);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl ="http://automationpractice.com/index.php?id_product=5&controller=product";
	
		Assert.assertEquals(actualUrl, expectedUrl);
	
	}
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/osx/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}

}
