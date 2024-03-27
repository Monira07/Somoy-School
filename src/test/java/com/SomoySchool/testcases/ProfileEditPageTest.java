package com.SomoySchool.testcases;

import org.testng.annotations.Test;

import com.SomoySchool.base.BaseClass;
import com.SomoySchool.pages.AfterLoginHomePage;
import com.SomoySchool.pages.LoginPage;
import com.SomoySchool.pages.MyProfilePage;
import com.SomoySchool.pages.ProfileEditPage;

public class ProfileEditPageTest extends BaseClass{
	
	AfterLoginHomePage afterLoginHomePage;
	LoginPage loginPage;
	MyProfilePage myProfilePage;
	ProfileEditPage profileEditPage;//this page
	
	@Test
	public void profileUpdateTest() throws InterruptedException {
		Thread.sleep(2000);
		loginPage=indexPage.clickOnLoginBtn();
		System.out.println("1.Go to index page for click on login Btn");
		Thread.sleep(2000);
		afterLoginHomePage=loginPage.login();
		Thread.sleep(2000);
		myProfilePage=afterLoginHomePage.clickOnMyProfile();
		Thread.sleep(2000);
		profileEditPage=myProfilePage.clickOnProfileEdtBtn();
		Thread.sleep(2000);
		profileEditPage.updateUserProfile("Monira Azad");
	}

}
