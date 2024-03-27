package com.SomoySchool.pages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SomoySchool.base.BaseClass;

public class LoginPage extends BaseClass{
	
	//set element as variable at the class level using @FindBy annotation
		//@FindBy(id="email") WebElement email;
//		@FindBy(id="email")
//		WebElement mail;
		
		@FindBy(xpath = "//input[@id='email']")WebElement userEmailId;
		
		@FindBy(xpath="//button[@type='submit']") 
		WebElement otpBtn;
		
		//otp
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/input[1]")
		WebElement otpOne;
		//WebElement otpOne;
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/input[2]") 
		WebElement otpTwo;
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/input[3]") 
		WebElement otpThree;
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/input[4]") 
		WebElement otpFour;
		@FindBy(xpath = "//button[@type='submit']")
		WebElement otpSubmitBtn;
		
		public LoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//public AfterLoginHomePage login(String emailid)
		public AfterLoginHomePage login() throws InterruptedException {
			System.out.println("4.Login page to entry value Login Page");
			//userEmailId.sendKeys(emailid);
			userEmailId.sendKeys("autogmtest@gmail.com");
			System.out.println("5.Enter email address Login Page");
			otpBtn.click();
			System.out.println("6.Click on OTP Btn Login Page");
			
			//scan value from user
			System.out.println("First OTP Number :");
			Scanner obj = new Scanner(System.in);
			String OTP1 = obj.nextLine();
			
			System.out.println("Second OTP Number :");
			Scanner obj1 = new Scanner(System.in);
			String OTP2 = obj1.nextLine();
			
			System.out.println("Thired OTP Number :");
			Scanner obj2 = new Scanner(System.in);
			String OTP3 = obj2.nextLine();
			
			System.out.println("Forth OTP Number :");
			Scanner obj3 = new Scanner(System.in);
			String OTP4 = obj3.nextLine();
			
			//OTP
			Thread.sleep(2000);
			otpOne.sendKeys(OTP1);
			otpTwo.sendKeys(OTP2);
			otpThree.sendKeys(OTP3);
			otpFour.sendKeys(OTP4);
			otpSubmitBtn.click();
			return new AfterLoginHomePage(driver);
		}
}
