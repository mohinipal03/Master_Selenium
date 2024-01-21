import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String s = "Mohini";
		driver.findElement(By.id("name")).sendKeys(s);
		driver.findElement(By.id("alertbtn")).click();

		// get text from alert
		System.out.println(driver.switchTo().alert().getText());

		// click ok on alert
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		// to not accept alert or cancel
		driver.switchTo().alert().dismiss();

		driver.close();
	}

}
