package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class Steps {

	WebDriver driver;
	LoginPage lp;
	
	
	org.apache.logging.log4j.Logger logger;
	
	@Before
	public void setUp()
	{
		//logger = LogManager.getLogger(this.getClass());
		logger= LogManager.getLogger(this.getClass());
		
	}
	
	@After
	public void tearDown()
	{
		
	}

	@Given("User Launch browser")
	public void user_launch_browser() {
		driver = new ChromeDriver();
		logger.info("Browser launched");
	}

	@And("opens URL {string}")
	public void opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		logger.info("Application is launched");
	}

	@When("User navigate to MyAccount menu")
	public void user_navigate_to_my_account_menu() {
		driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/a")).click();
		
		logger.info("Clicked on MyAccount Menu");

	}

	@And("click on Login")
	public void click_on_login() {
		driver.findElement(By.linkText("Login")).click();
		
		logger.info("Clicked on login");

	}

	@And("Email {string} and password {string}")
	public void email_and_password(String userName, String password) {
		//driver.findElement(By.xpath("//*[@id=\'input-email\']")).sendKeys(userName);
		//driver.findElement(By.xpath("//*[@id=\'input-password']")).sendKeys(password);
		lp.txtusername(driver).sendKeys(userName);
		lp.txtpass(driver).sendKeys(password);
		
		logger.info("Entered email and password");


	}

	@And("Click on Login button")
	public void click_on_login_button() {
		//driver.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input")).click();
		lp.buttonLogin(driver).click();
		
		logger.info("Clicked on login button");

	}

	@Then("User navigates to MyAccount Page")
	public void user_navigates_to_my_account_page() {
		
		//String exUrl = driver.getTitle();
		//String aclUrl = "My Account";
		//Assert.assertEquals(exUrl, aclUrl);
	
	  MyAccountPage myAccountPage = new MyAccountPage(driver);
	  
	  boolean b =   myAccountPage.isMyAccountPageExists();
	
     //  Assert.assertTrue(b);
		   if(b)
		   {
			   Assert.assertTrue(true);
				logger.info("login successful");

		   }
		   else
		   {
			   Assert.assertTrue(false);
				logger.info("login failed");

		   }
		   
		   
	}
	
		
		



	}


