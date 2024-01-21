import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSpecificDateAndMonth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day "));
		int count = driver.findElements(By.className("flatpickr-day ")).size();
		for (int i = 0; i< count; i++ ) {
			String text = driver.findElements(By.className("flatpickr-day ")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("flatpickr-day ")).get(i).click();
				break;
			}
			
		}
	}

}
