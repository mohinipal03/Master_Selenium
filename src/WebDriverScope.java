import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// link count on page
		// every link on HTML page have <a
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Limiting webDriver scope
		WebElement FooterDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());

		// limiting more
		WebElement subChildDriver = FooterDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(subChildDriver.findElements(By.tagName("a")).size());

		// clicking on each link in coloum and check if page is opening or links are
		// working
		for (int i = 1; i < subChildDriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			subChildDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}

		// get title of each page
		Set<String> titles = driver.getWindowHandles();
		Iterator<String> it = titles.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
