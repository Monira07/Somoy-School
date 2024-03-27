package com.SomoySchool.testcases;

import org.testng.annotations.Test;

import com.SomoySchool.base.BaseClass;
import com.SomoySchool.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends BaseClass{
	LoginPage loginPage;
	
	@Test
	public void loginTest() throws InterruptedException {
		loginPage=indexPage.clickOnLoginBtn();
		System.out.println("3.Click on login Btn Login Page Test");
		Thread.sleep(2000);
		//loginPage.login("autogmtest@gmail.com");
		loginPage.login();
		System.out.println("7Done Login Page Test");
		Thread.sleep(2000);
		
//		String expectedURL = "https://beta-mb.somoyinfo.com/auth";
//		String currentlURL= driver.getCurrentUrl();
//		Assert.assertEquals(currentlURL, expectedURL);
	}
	
}
