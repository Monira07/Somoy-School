package com.SomoySchool.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SomoySchool.pages.IndexPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public 	WebDriver driver;
	//public Properties prop;
	public IndexPage indexPage;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		//readConfig();//to load the configuration need to call the method
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		String browserName = prop.getProperty("browser");
//		if(browserName.contains("Chrome")){
//			driver = new ChromeDriver();
//		}
//		else if(browserName.contains("FireFox")){
//			driver = new FirefoxDriver();
//		}
//		else if(browserName.contains("IE")){
//			driver = new InternetExplorerDriver();
//		}
		
		System.out.println("1.Browser is Launched Base class");
		driver.manage().window().maximize();
		
		//indexPage=new IndexPage(driver);
		indexPage=new IndexPage(driver);
		
		driver.get("https://beta-mb.somoyinfo.com");
		//driver.get("https://beta-mb.somoyinfo.com/auth");
		//driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
		System.out.println("2.Open Website Base class");
	}

//	public void readConfig() {
//		try {
//			prop=new Properties();
//			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+
//					"/Configuration/Config.properties");
//			prop.load(fs);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	@AfterMethod
//	public void tearDoen() {
//		driver.close();
//	}

}
