import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//input[@minlength='2']")).sendKeys("Test Test");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("testpswd");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement SelectDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(SelectDropdown);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("02/07/2000");
		driver.findElement(By.className("btn-success")).click();
		driver.close();
	}

}
