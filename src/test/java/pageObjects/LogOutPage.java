package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {
	
	static WebElement ele =null;
	
	
	public static WebElement buttonMyAccount(WebDriver driver)
	{
		return ele = driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/a"));
	}
	
	public static WebElement buttonLogOut(WebDriver driver)
	{
		return ele = driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[5]/a"));
	}


}
