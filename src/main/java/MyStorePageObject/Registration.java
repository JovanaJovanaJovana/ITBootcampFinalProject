package MyStorePageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration {

	public static final String REG_URL = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0#account-creation";
	
	WebDriverWait wait;
	
	By createAccountEmail = By.id("email_create");
	By createAccountBtn = By.id("SubmitCreate");

	public void goToRegPage(WebDriver driver, String create_account_email) {
		WebElement createAnAccountEmail = driver.findElement(createAccountEmail);
		createAnAccountEmail.clear();
		createAnAccountEmail.sendKeys(create_account_email);
		WebElement createAnAccountBtn = driver.findElement(createAccountBtn);
		createAnAccountBtn.click();
	}

	static By first_name = By.id("customer_firstname");
	static By last_name = By.id("customer_lastname");
	static By e_mail = By.id("email");
	static By pass = By.id("passwd");
	static By addr = By.id("address1");
	static By cityy = By.id("city");
	static By statee = By.id("id_state");
	static By zip = By.id("postcode");
	static By countryy = By.id("id_country");
	static By phone = By.id("phone_mobile");
	static By addressAlias = By.id("alias");
	static By reg_button = By.id("submitAccount");

	public static void inputFirstName(WebDriver driver, String firstName) {
		WebElement firstNameField = driver.findElement(first_name);
		firstNameField.sendKeys(firstName);
	}

	public static void inputLastName(WebDriver driver, String lastName) {
		WebElement lastNameField = driver.findElement(last_name);
		lastNameField.sendKeys(lastName);
	}

	public static void inputEmail(WebDriver driver, String email) {
		WebElement emailField = driver.findElement(e_mail);
		emailField.clear();
		emailField.sendKeys(email);
	}

	public static void inputPassword(WebDriver driver, String password) {
		WebElement passwordField = driver.findElement(pass);
		passwordField.sendKeys(password);
	}

	public static void inputAddress(WebDriver driver, String address) {
		WebElement addressField = driver.findElement(addr);
		addressField.sendKeys(address);
	}

	public static void inputCity(WebDriver driver, String city) {
		WebElement cityField = driver.findElement(cityy);
		cityField.sendKeys(city);
	}

	public static void inputState(WebDriver driver, String state) {
		Select state_list = new Select(driver.findElement(statee));
		state_list.selectByVisibleText(state);
	}

	public static void inputZipCode(WebDriver driver, String zip_code) {
		WebElement zipCodeField = driver.findElement(zip);
		zipCodeField.sendKeys(zip_code);
	}

	public static void inputCountry(WebDriver driver, String country) {
		Select country_list = new Select(driver.findElement(countryy));
		country_list.selectByValue(country);
	}

	public static void inputPhoneNumber(WebDriver driver, String phone_number) {
		WebElement phoneField = driver.findElement(phone);
		phoneField.sendKeys(phone_number);
	}

	public static void inputAddressAlias(WebDriver driver, String address_alias) {
		WebElement addressAliasField = driver.findElement(addressAlias);
		addressAliasField.sendKeys(address_alias);
	}

	public static void clickSubmit(WebDriver driver) {
		WebElement element = driver.findElement(reg_button);
		element.click();
	}
	
	public static void clickSignOut(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//a[@class='logout']"));
		element.click();
	}

	public void waitFirstnameField(WebDriver driver) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(first_name));
	}
}
