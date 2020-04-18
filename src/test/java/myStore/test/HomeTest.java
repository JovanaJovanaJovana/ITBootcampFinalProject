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

public class HomeTest {

	WebDriver driver;
	Home home;
	WebDriverWait wait;
	
	@Test(priority = 1)
	public void testWomenSubmenu() {
		driver.get(Home.HOME_URL);
		home = new Home();
		home.clickWomenSubmenu(driver);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?id_category=11&controller=category";
	
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test(priority = 2)
	public void testDressesSubmenu() {
		home.clickDressesSubmenu(driver);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?id_category=11&controller=category";
	}
	
	@Test(priority = 3)
	public void testFinalUrl() {
		driver.navigate().to(Home.HOME_URL);
		String WomenSummerDressesUrl = home.clickWomenSubmenu(driver);
		
		driver.navigate().to(Home.HOME_URL);
		String DressesSummerDressesUrl = home.clickDressesSubmenu(driver);
		
		Assert.assertEquals(WomenSummerDressesUrl, DressesSummerDressesUrl);
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
