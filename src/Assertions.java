import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//Assertions
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		//Assert.assertFalse(true);
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		// to check if selected oor not use method is selected
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//count the number of checkboxs ( find out the comman locator)
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();
	}

}
