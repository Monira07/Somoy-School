package com.SomoySchool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SomoySchool.base.BaseClass;

public class AfterLoginHomePage extends BaseClass{
	
	@FindBy(xpath = "//img[@src='/assets/images/course_details/avatar.svg']")
	WebElement profilePic;
	
	@FindBy(xpath = "//*[@id=\"navbar\"]/div[1]/nav/div/div[2]/div[2]/div[3]/a/div")
	WebElement myProfile;
	
	@FindBy(xpath = "//*[@id=\"navbar\"]/div[1]/nav/div/div[2]/div[2]/div[1]/a/div")
	WebElement myCourses;
	
	@FindBy(xpath = "//*[@id=\"navbar\"]/div[1]/nav/div/div[2]/div[2]/div[2]/a/div")
	WebElement myCertificats;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/div[1]/a/div")
	WebElement allCourses;
	
	public AfterLoginHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Menu
	public AllCoursesPage clickOnMyCourses() {
		profilePic.click();
		myCourses.click();
		return new AllCoursesPage(driver);
	}
	
	public MyProfilePage clickOnMyProfile() {
		profilePic.click();
		myProfile.click();
		return new MyProfilePage(driver);
	}
	
	public void clickOnMyCertificats() {
		profilePic.click();
		myCertificats.click();
		//return new AllCoursesPage(driver);
	}
	
	//Landing page
	public AllCoursesPage clickOnAllCourses() {
		allCourses.click();
		return new AllCoursesPage(driver);
	}
	
	public void choolePages(String page) {
		String pages=page;
		if(pages=="myAllCourses") {
			clickOnMyCourses();
		}
		else if(pages=="myProfilePage") {
			clickOnMyProfile();
		}
		
		else if(pages=="myCertificats") {
			clickOnMyCertificats();
		}
		
		else if(pages=="allCourses") {
			clickOnAllCourses();
		}
	}

}
