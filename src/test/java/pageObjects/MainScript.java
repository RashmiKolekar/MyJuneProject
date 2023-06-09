package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        
        LoginPage.txtusername(driver).sendKeys("Rashmi.kolekar@citiustech.com");
        LoginPage.txtpass(driver).sendKeys("Qafox");
        LoginPage.buttonLogin(driver).click();
        
        LogOutPage.buttonMyAccount(driver).click();  
        LogOutPage.buttonLogOut(driver).click();
        
        
	}

}
