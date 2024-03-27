package com.SomoySchool.testcases;

import org.testng.annotations.Test;

import com.SomoySchool.base.BaseClass;
import com.SomoySchool.pages.AfterLoginHomePage;
import com.SomoySchool.pages.AllCoursesPage;
import com.SomoySchool.pages.CourseDetailsPage;
import com.SomoySchool.pages.LoginPage;

public class CourseDetailsPageTest extends BaseClass{
	
	AfterLoginHomePage afterLoginHomePage;
	LoginPage loginPage;
	AllCoursesPage allCoursesPage;
	
	CourseDetailsPage courseDetailsPage;
	
	@Test
	public void clickOnFirstCoursesToBuyTest() throws InterruptedException {
		Thread.sleep(2000);
		loginPage=indexPage.clickOnLoginBtn();
		System.out.println("1.Go to index page for click on login Btn");
		Thread.sleep(2000);
		afterLoginHomePage=loginPage.login();
		Thread.sleep(2000);
		allCoursesPage=afterLoginHomePage.clickOnAllCourses();
		Thread.sleep(2000);
		courseDetailsPage=allCoursesPage.clickOnFirstCourses();
		Thread.sleep(2000);
		
		courseDetailsPage.buyCourses();
	}

}
