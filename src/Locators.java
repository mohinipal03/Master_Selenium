import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		/* 
		 *  Implicit Wait-  An implicit wait is a global setting that applies to all elements in a Selenium script. ...
		 *  Explicit Wait. An explicit wait is a more flexible wait that allows us to wait for a specific condition to be met before continuing test execution. ...
		 *  Fluent Wait. */
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohini/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// Finding element by ID
		driver.findElement(By.id("inputUsername")).sendKeys("Mohini");
		
		//name
		driver.findElement(By.name("inputPassword")).sendKeys("Mohini");
		
		//class
		driver.findElement(By.className("signInBtn")).click();
		
		/* driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
		 * driver.close(); 
		 * if space in HTML i.e. "submit signInBtn" meaning it contains two classes
		 * proceed with only one not both i.e. submit or signInBtn */
		
		/*
		 * css selector
		 * by class - tagname.classname
		 * by id - tagname#id
		 * by attribute - tagname[arrtibute='value']
		 * console > $('p.error') > enter
		 */
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		/*
		 * Link text - pass text of link 
		 * to use HTML tag shall have Tag name < a
		 * 
		 */
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(500); // to wait untill transition happens
		
		/* X path
		 * //Tagname[@attribute='attribute value']
		 * console > $x('input[@placeholder="Phone Number"]') > enter
		 * */
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mohini");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@gmail.com");
		/*
		 * when xpath have similar parameter or matches are mpre than one then [2] or [3] can be used where it indicates resprective number of path
		 * e.g. //input[@type='text'][3] here it will choose 3rd match
		 * */
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		//driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9876543210");
		/*
		 * finding x path parent child relation
		 * '//' for finding inside whole page
		 *  '/' for finding x path inside the given parent which was initally defined by '//'
		 *  e.g. //form/h2
		 */
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		
		Thread.sleep(500);
		driver.findElement(By.id("inputUsername")).sendKeys("Mohini");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //dynamic element
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		driver.close();
		
		
		
		
	}

}
