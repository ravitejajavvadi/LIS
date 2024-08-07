package stepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Base.TestBase;
import com.PageObjects.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends TestBase{

	LoginPage loginpage;
	TestBase testbase= new TestBase();

	
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() throws IOException {
		
		testbase.LoadConfigProperties();
		
		testbase.LaucnhAPP();
		loginpage= new LoginPage(TestBase.driver);
		String current_URL=loginpage.VerifyLaunchURL();
		Assert.assertEquals(current_URL, "https://adactinhotelapp.com/index.php");
		String Current_title=loginpage.VerifyLoginPageTitle();
		Assert.assertEquals(Current_title, "Adactin.com - Hotel Reservation System");
					   
	}
	
	
	@When("User Enters the UserName and Password")
	public void User_Enters_the_UserName_and_Password() {
		loginpage.VerifyLogin();
		
	}
	
	@And("User click on Login button")
	public void user_click_on_login_button() {
		loginpage.Submit();
	   
	}

	@Then("User see the homepage")
	public void user_see_the_homepage() {
	    String homepage_title=loginpage.VerifyHomePageTitle();
	    Assert.assertEquals(homepage_title, "Adactin.com - Search Hotel", "Home Page Title Not Matching");
	    
	}

	@Then("User see the Application Logo")
	public void user_see_the_application_logo() {
	   
		boolean res=loginpage.VerifyAppllicationLogo();
		Assert.assertTrue(res, "Application Logo Not Displayed");
	}

}
