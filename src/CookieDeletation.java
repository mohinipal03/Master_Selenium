import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDeletation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// deleting all cookies
		driver.manage().deleteAllCookies();
		
		// deleting specific cookies
		driver.manage().deleteCookieNamed("Session Name");
		
		// add cookies
		driver.manage().addCookie(null);
		
		
		driver.get("https://www.google.com/");
	}

}
