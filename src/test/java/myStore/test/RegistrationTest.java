package myStore.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

import MyStorePageObject.ReadCustomersData;
import MyStorePageObject.Registration;

public class RegistrationTest {

	WebDriver driver;
	Registration registration;
	WebDriverWait wait;

	@Test(priority = 1)
	public void testGoToRegPage() {
		driver.navigate().to(Registration.REG_URL);
		registration = new Registration();
		registration.goToRegPage(driver, "kkkkukuuuuk@gmail.com");

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0#account-creation";

		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Test(priority = 2)
	public void testCustomerRegistration() throws InterruptedException {
		driver.navigate().to(Registration.REG_URL);
		registration = new Registration();
		registration.inputFirstName(driver, "Kazimir");
		registration.inputLastName(driver, "Malevich");
		registration.inputEmail(driver, "belikvadratnabelom@gmail.com");
		registration.inputPassword(driver, "suprematism");
		registration.inputAddress(driver, "Tverskaya Street, 18");
		registration.inputCity(driver, "Moscow");
		registration.inputState(driver, "Alaska");
		registration.inputZipCode(driver, "99503");
		registration.inputCountry(driver, "21");
		registration.inputPhoneNumber(driver, "+381655555555");
		registration.inputAddressAlias(driver, "Tverskaya Street, 18");
		registration.clickSubmit(driver);

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?controller=order&step=1&multi-shipping=0";

		Thread.sleep(5000);
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Test(priority = 4)
	public void registrationTestGroup30() throws FileNotFoundException, IOException, InterruptedException {

		
		try (FileInputStream fi = new FileInputStream("customers.xlsx"); 
				XSSFWorkbook wb = new XSSFWorkbook(fi)) {

			for (int i = 1; i <= 30; i++) {

				driver.navigate().to(Registration.REG_URL);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				registration = new Registration();
				registration.clickSignOut(driver);
				
				WebElement createAnAccountEmail = driver.findElement(By.id("email_create"));
				createAnAccountEmail.clear();
				createAnAccountEmail.sendKeys(ReadCustomersData.getEmail(i));
				WebElement createAnAccountBtn = driver.findElement(By.id("SubmitCreate"));
				createAnAccountBtn.click();

				Thread.sleep(1000);

				while (driver.findElement(By.id("create_account_error")).isDisplayed()) {
					Thread.sleep(1000);
					driver.findElement(By.id("email_create")).click();
					driver.findElement(By.id("email_create")).clear();
					Random randomGenerator = new Random();
					int randomInt = randomGenerator.nextInt(1000);
					driver.findElement(By.id("email_create")).sendKeys("plsplsradi" + randomInt + "@gmail.com");
					WebElement submitBtn = driver.findElement(By.id("SubmitCreate"));
					Thread.sleep(1000);
					submitBtn.click();
				}

				Thread.sleep(3000);

				registration.inputFirstName(driver, ReadCustomersData.getFirstname(i));
				registration.inputLastName(driver, ReadCustomersData.getLastname(i));
				registration.inputPassword(driver, ReadCustomersData.getPassword(i));
				registration.inputAddress(driver, ReadCustomersData.getAddress(i));
				registration.inputCity(driver, ReadCustomersData.getCity(i));
				registration.inputState(driver, ReadCustomersData.getStateXpath(i));
				registration.inputZipCode(driver, ReadCustomersData.getZipCode(i));
				registration.inputPhoneNumber(driver, ReadCustomersData.getPhone(i));
				registration.inputAddressAlias(driver, ReadCustomersData.getAlias(i));
				registration.clickSubmit(driver);

				Thread.sleep(3000);

				String actualTitle = driver.getTitle();

				String expectedTitle = "My account - My Store";

				Assert.assertEquals(actualTitle, expectedTitle);
			}
		}
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
