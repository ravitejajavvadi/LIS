package com.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.TestBase;


public class LoginPage extends TestBase {

	WebDriver driver;
	 
//	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
//	
//    @FindBy(id="username")
//    public static WebElement login_Usename;
//	
//	@FindBy(id="password")
//	public static WebElement login_Password;
//	
//	@FindBy(className = "login_button")
//	public static WebElement login_SubmitButton;
//	
//	@FindBy(xpath="//img[@src=\"img/AdactIn_logo.png\"]")
//	public static WebElement login_APPLogo;
	
	By login_Usename= By.id("username");
	By login_Password = By.id("password");
	By login_SubmitButton = By.className("login_button");
	By login_APPLogo = By.xpath("//img[@class=\"logo\"]");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
//		PageFactory.initElements(driver , this);
	}   
	
	
	
	public boolean VerifyAppllicationLogo() {
		boolean res= driver.findElement(login_APPLogo).isDisplayed();
		return res;
		
	}
	
	public void VerifyLogin() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(login_Usename)).sendKeys("raviteja1994");
		wait.until(ExpectedConditions.visibilityOfElementLocated(login_Password)).sendKeys("Abc@12345");

	}
	
	public void Submit() {
		boolean btn=driver.findElement(login_SubmitButton).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(login_SubmitButton)).click();
	
	}
	
	
	public String VerifyLoginPageTitle() {
		String title= driver.getTitle();
		System.out.println("Login Page Titile ::"+title);
		return title;
	}
	
	public String VerifyLaunchURL() {
		String Launch_URl= driver.getCurrentUrl();
		System.out.println("Login Page URL ::"+Launch_URl);
		return Launch_URl;
		
	}
	
	public String VerifyHomePageTitle() {
		String homepage_title=driver.getTitle();
		System.out.println("Home Page Title ::"+homepage_title);

		return homepage_title;
		
	}
}
