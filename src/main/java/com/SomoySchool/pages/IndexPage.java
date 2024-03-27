package com.SomoySchool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SomoySchool.base.BaseClass;

public class IndexPage extends BaseClass{
	
	
	//set element as variable at the class level using @FindBy annotation
		
		@FindBy(xpath="/html/body/div/div/div[1]/div[1]/nav/a/div/div/img")
		WebElement logo;
		
		@FindBy(xpath="//button[@class='sm:w-[120px] sm:h-[44px] w-[95px] h-[36px] rounded-md text-white sm:text-tsm-bold text-caption bg-primary hover:bg-primaryHover']")
		WebElement loginBtn;
		
	//@FindBy(xpath = "//input[@id='email']")WebElement userEmailId;
		
		
		public IndexPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public boolean validateLogo() {
			logo.isDisplayed();
			return true;
		}
		
		public LoginPage clickOnLoginBtn() {
			loginBtn.click();
			//userEmailId.sendKeys("mife");
			return new LoginPage(driver);
		}

}
