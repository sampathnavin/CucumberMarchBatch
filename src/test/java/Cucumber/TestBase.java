package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver ;
	
	public static void browserSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\CucucmberMarchBatch\\src\\test\\resources\\chromedriver123.exe");
		driver = new ChromeDriver();
	}
	
	public static void puturl()
	{
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

}
