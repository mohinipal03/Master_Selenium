import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingItemsToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] veggies = {"Cucumber", "Brocolli", "Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait w = new WebDriverWait(driver,5);

		additems(driver,veggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		//Explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		}
	
	
	
	public static void additems(WebDriver driver, String[]veggies) {
		
		int j=0;
		List<WebElement> allProoducts = driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i =0; i<allProoducts.size(); i++) {
			String[] productName = allProoducts.get(i).getText().split("-");
			String trimmedname = productName[0].trim();
			List al = Arrays.asList(veggies);
	
			if(al.contains(trimmedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==3)
					break;
			}
			
		}
	}
	
	

}
