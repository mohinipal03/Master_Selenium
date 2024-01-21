import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Intro {

	public static void main(String[] args) {
		// Invoking browser
		//Interface -- so that all browser can use comman methods
		// chrome browser -- chromeDriver - methods
		//chromeDriver.exe --> invoking chrome browser
		/* Path 1: Step to invoke chrome browser
		 * Path 2: selenium manager ( no headache of writing step to invoke browser) */
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		/*ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");*/
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		
		//Firefox launch
		//geckodriver
		/*System.setProperty("webdriver.gecko.driver", "/Users/mohini/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();*/
		
		
		//edge launch
		/*System.setProperty("webdriver.edge.driver", "/Users/mohini/Documents/msedgedriver");
		WebDriver driver = new EdgeDriver();*/
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
