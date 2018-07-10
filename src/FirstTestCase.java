import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;


public class FirstTestCase {
@Test
	
	public void site_header_is_on_home_page() {

	System.setProperty("webdriver.gecko.driver", "C:\\geckoDriver\\geckodriver.exe");
    WebDriver browser = new FirefoxDriver();

    //Firefox's proxy driver executable is in a folder already
    //  on the host system's PATH environment variable.
    browser.get("http://google.com");
    WebElement header = browser.findElement(By.id("hplogo"));
    assertTrue((header.isDisplayed()));

    browser.close();        
   }
}