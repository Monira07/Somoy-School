package com.SomoySchool.testcases;

import org.testng.annotations.Test;

import com.SomoySchool.base.BaseClass;
import com.SomoySchool.pages.AfterLoginHomePage;
import com.SomoySchool.pages.LoginPage;

public class AfterLoginHomePageTest extends BaseClass{
	
	AfterLoginHomePage afterLoginHomePage;
	LoginPage loginPage;
	
	@Test
	public void clickOnProfilePicAndMenuOrLandingManuTest() throws InterruptedException {
		Thread.sleep(2000);
		loginPage=indexPage.clickOnLoginBtn();
		System.out.println("1.Go to index page for click on login Btn");
		Thread.sleep(2000);
		afterLoginHomePage=loginPage.login();
		Thread.sleep(2000);
		System.out.println("2.Go to login page for login");
		//afterLoginHomePage.clickOnMyProfile();
		
		//Menu
		//afterLoginHomePage.choolePages("myAllCourses");
		//afterLoginHomePage.choolePages("myProfilePage");
		//afterLoginHomePage.choolePages("myCertificats");
		
		//Landing page
		afterLoginHomePage.choolePages("allCourses");
		
	}

}
