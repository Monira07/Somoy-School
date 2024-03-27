package com.SomoySchool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SomoySchool.base.BaseClass;

public class CourseDetailsPage extends BaseClass{
	
	@FindBy(xpath = "//div[@class='py-4 px-6']")
	WebElement buyCourse;
	
	@FindBy(xpath = "//button[@class='-mt-6']")
	WebElement agreeCheckBtn;
	
	@FindBy(xpath = "//button[@id='beforepurchase-id']")
	//@FindBy(id="beforepurchase-id")
	WebElement makePaymentBtn;
	
	//@FindBy(xpath = "/html/body/div[1]/div/div/app-root/app-transaction/div/div[1]/div[1]/div/div[1]/app-tab-nav/div/ul/li[2]/a")
	@FindBy(xpath = "/html/body/div[1]/div/div/app-root/app-transaction/div/div[1]/div[1]/div/div[1]/app-tab-nav/div/ul/li[2]")
	WebElement paymentMediaBtn;
	
	@FindBy(xpath = "//*[@id=\"menu2\"]/ul/li[1]/a/img")
	WebElement clickOnBkashOption;
	
	@FindBy(xpath = "//*[@id=\"sections\"]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[1]/form[1]/input[5]")
	WebElement clickOnSuccessOption;
	
	public CourseDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void buyCourses() {
		buyCourse.click();
		System.out.println("Click on buy btn");
		agreeCheckBtn.click();
		System.out.println("Click on agree btn");
		makePaymentBtn.click();
		System.out.println("Click on payment btn");
		paymentMediaBtn.click();
		System.out.println("Click on paymentMethod btn");
		clickOnBkashOption.click();
		System.out.println("Click on Bkash btn");
		clickOnSuccessOption.click();
		System.out.println("Click on Success btn");
	}

}
