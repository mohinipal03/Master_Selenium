import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNaviagtion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//invoking browser
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// maximizing windows screen
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(1000);
		
		//navigate to another window
		driver.navigate().to("https://rahulshettyacademy.com");
		
		// navigation to previous page
		driver.navigate().back();
		
		// navigation to second page i.e. rahulsheetyacademy
		driver.navigate().forward();
		
		driver.close();
		
	}

}
