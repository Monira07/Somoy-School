package com.SomoySchool.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SomoySchool.base.BaseClass;

public class ProfileEditPage extends BaseClass{
	//WebElement fileInput;
	//
	@FindBy(xpath = "//input[@class='w-full border border-grey1 appearance-none focus-none outline-none focus:border-paragraph rounded p-3 mt-2 text-caption border-grey2']")
	WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div[3]/div/div/div[1]/div/button")
	WebElement userPic;
	
	@FindBy(xpath = "//button[@class='bg-primary hover:text-primary hover:bg-white hover:border-primary w-full text-white hover:border-2 text-tbase-bold px-4 py-2 sm:px-6 sm:py-4 rounded flex justify-center gap-x-2 items-center']")
	WebElement updateBtn;
	
	public ProfileEditPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void updateUserProfile(String userNmae) {
		userName.clear();
		userName.sendKeys(userNmae);
		//userPic.click();
		//userPic.sendKeys("/home/sayburgh-pc-8/Downloads/instructor Mridula.png");
		userPic.sendKeys("/src/test/resources/TestData/instructor Mridula.png");
		//File uploadFile = new File("/src/test/resources/TestData/instructor Mridula.png");
		//userPic.sendKeys(uploadFile.getAbsolutePath());
		System.out.println("Upload the file");
		updateBtn.click();
	}

}
