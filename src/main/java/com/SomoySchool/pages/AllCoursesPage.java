package com.SomoySchool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SomoySchool.base.BaseClass;

public class AllCoursesPage extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div[3]/div[2]/div[1]/div")
	WebElement firstCourse;
	
	
	public AllCoursesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public CourseDetailsPage clickOnFirstCourses() {
		firstCourse.click();
		return new CourseDetailsPage(driver);
	}

}
