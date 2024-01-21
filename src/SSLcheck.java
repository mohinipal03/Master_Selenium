
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

		// setting proxy
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("Ipaddress:4444");
		options.setCapability("proxy", proxy);

		// Block popup windows
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

		// Set download directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);

		
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}


// how to handle HTTP certification in automated browser