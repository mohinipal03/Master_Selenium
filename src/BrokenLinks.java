import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// java methods to call URL and get status code
		// step -1 get all url
		

		// Broken link
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li']a"));
		for(WebElement link : links) {
		String url1 = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

		HttpURLConnection connection1 = (HttpURLConnection) new URL(url1).openConnection();
		connection1.setRequestMethod("HEAD");
		connection1.connect();
		int response1 = connection1.getResponseCode();
		System.out.println(response1);
		
		if (response1>400) {
			System.out.println("the link with text" + link.getText() + "is broken with code" + response1);
			Assert.assertTrue(false);
		}
		
		}
	}

}
