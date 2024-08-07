package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;

public class TestBase {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;
	
	
	public void LoadConfigProperties() {

//Reading the Properties File	
		
	try {
		  System.out.println("Loading Config Properties File InProgress------------");
			 prop= new Properties();
			 FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\LIS\\src\\main\\java\\com\\utils\\config.properties");
			 prop.load(ip);
			 System.out.println("Properties Files Read Successfully-----------");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
			
	}
	
	
	public void LaucnhAPP() throws IOException {
				
		String Browser_name=prop.getProperty("browser");
		if(Browser_name.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if(Browser_name.equalsIgnoreCase("firefox")) {
		     driver= new FirefoxDriver();
		}else if(Browser_name.equalsIgnoreCase("IE")) {
			driver= new InternetExplorerDriver();
		}else {
			System.out.println("Browser Name Not Provided");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
	}
	
	public void teardown() {
		
		driver.quit();
	}
	
}
