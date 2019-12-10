package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefs {
	
	WebDriver driver = null; 
	
	   @Given("^OpenHRM WebPage$")
	   public void openBrowser() throws Exception
	   { 
		   System.setProperty("webdriver.chrome.driver", "D:\\QAplanet\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://apps.qaplanet.in/qahrm");
		   Thread.sleep(2000);
	   } 
	   
	   @Then("^User verified home page$")
		public void VerifyHomePage()
		{
			//Verify Home Page
					if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
					{
						System.out.println("Home page displayed");
					}		
		}
	   @Then("^verify user name$")
		public void VerifyUserName()
		{
			if(driver.findElement(By.name("txtUserName")).isDisplayed())
			{
				System.out.println("User name displayued");
			}
		}
	   
		@Then("^verify password$")
		public void VerfiyPassword()
		{
			if(driver.findElement(By.name("txtPassword")).isDisplayed())
			{
				System.out.println("password displayued");
			}
		}
		
		@When("^I Enter user name$")
		public void EnterUserName()
		{
			driver.findElement(By.name("txtUserName")).clear();
			driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		}
		
		@When("^Enter password$")
		public void EnterPassword()
		{
			driver.findElement(By.name("txtPassword")).clear();
			driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		}
		
		@When("^Click on login$")
		public void ClickonLogin()throws Exception
		{
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(2000);
		}
		
		@Then("^Check OrangeHRM Page$")
		public void VerifyOrangePage()
		{
			//Verify Home Page
			if(driver.getTitle().equals("OrangeHRM"))
			{
				System.out.println("OrangeHRM page displayed");
			}		
		}
		
		@Then("^Click on logout$")
		public void Signout()throws Exception
		{
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			driver.close();
			driver.quit();
		}
		


}
