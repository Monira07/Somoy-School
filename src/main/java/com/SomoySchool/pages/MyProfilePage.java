package com.SomoySchool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SomoySchool.base.BaseClass;

public class MyProfilePage extends BaseClass{
	
	@FindBy(xpath = "//div[@class='w-full sm:w-[168px] border-2 border-primary hover:text-white group hover:bg-primary text-tbase-bold text-primary px-4 py-2 sm:px-6 sm:py-4 rounded flex justify-center gap-x-2 items-center cursor-pointer']")
	WebElement profileEdtBtn;
	
	public MyProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProfileEditPage clickOnProfileEdtBtn() {
		profileEdtBtn.click();
		System.out.println("Click on profile option From MYProfilePage");
		return new ProfileEditPage(driver);
	}

}
