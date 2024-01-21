import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); // [parent id,child id]
		
		// switching window
		Iterator<String> it=windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.className("red")).getText());
		String emailID = driver.findElement(By.className("red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(emailID);
	}
	

}
