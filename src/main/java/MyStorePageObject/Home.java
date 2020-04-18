package MyStorePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

	public static final String HOME_URL = "http://automationpractice.com/index.php";
	
	WebDriverWait wait;
	
	By women_nav = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");
	By women_submenu_summer_dresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a");
	
	By dresses_nav = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	By dresses_submenu_summer_dresses = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]");
	
	public String clickWomenSubmenu(WebDriver driver) {
		Actions actions = new Actions(driver);
		
		WebElement women_link = driver.findElement(women_nav);
		actions.moveToElement(women_link).perform();
		
		WebElement WomenSubmenu_summer_dresses = driver.findElement(women_submenu_summer_dresses);
		WomenSubmenu_summer_dresses.click();
		return driver.getCurrentUrl();
	}
	
	public String clickDressesSubmenu(WebDriver driver) {
		Actions actions = new Actions(driver);
		
		WebElement dresses_link = driver.findElement(dresses_nav);
		actions.moveToElement(dresses_link).perform();
		
		WebElement DressesSubmenu_summer_dresses = driver.findElement(dresses_submenu_summer_dresses);
		DressesSubmenu_summer_dresses.click();
		return driver.getCurrentUrl();
	}
	
	public void waitWomenLink(WebDriver driver) {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(women_nav)); 
	}
}
