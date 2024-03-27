package com.SomoySchool.testcases;

import org.testng.annotations.Test;

import com.SomoySchool.base.BaseClass;
//import com.SomoySchool.pages.IndexPage;
import com.SomoySchool.pages.LoginPage;

import junit.framework.Assert;

public class IndexPageTest extends BaseClass{
	
	//IndexPage indexPage;
	public LoginPage loginPage;
	
	@Test (priority = 1)
	public void verifyLogoTest() {
		boolean flag = indexPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test (priority = 2)
	public void clickLoginBtnTest() throws InterruptedException {
		Thread.sleep(2000);
		loginPage=indexPage.clickOnLoginBtn();
		//String expectedURL = "https://beta-mb.somoyinfo.com/auth";
		//String currentlURL= driver.getCurrentUrl();
		//Assert.assertEquals(currentlURL, expectedURL);
		
	}

}
