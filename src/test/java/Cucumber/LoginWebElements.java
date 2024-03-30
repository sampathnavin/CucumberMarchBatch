package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebElements extends TestBase{
	
	
	@FindBy(id = "user-name")
	public static WebElement username ;
	
	@FindBy(name = "password")
	public static WebElement password;
	
	
	@FindBy(id = "login-button")
	public static WebElement login ;
	
	 
	 @FindBy(xpath= "//div[text() = 'Swag Labs']")
	 public static WebElement check ;
	
	
	public LoginWebElements()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public static void validcredentials()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
	}
	
	public static void loginclick()
	{
		login.click();
	}
	
	public static void teardown()
	{
		driver.close();
	}
	
	 public static void checkingstatus()
	 {
		 String p = check.getText();
		 if(p.equals("Swag Labs"))
		 {
			 System.out.println("Test is passed");
		 }
		 else
		 {
			 System.out.println("Test is failed");
		 }
	 }
	
	
	

	

	
}
