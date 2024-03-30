package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNgRefresh {
	
	// We have written all our codes in methods 
	
	// Methods is a action that needs to be performed 
	
	public static WebDriver driver ;
	
	public static void browsersetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\CucucmberMarchBatch\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}


	public static void puturl()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	public static void validenterusernameandpassword()
	{
		WebElement username = driver.findElement(By.id("user-name"));
		
		WebElement password = driver.findElement(By.name("password"));

		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
	}
	
	public static void click()
	{
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}
	
	public static void teardown()
	{
		driver.quit();
	}
	
	
	
}
