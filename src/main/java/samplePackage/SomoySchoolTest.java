package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SomoySchoolTest {
	
WebDriver driver = null;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Browser is Launched");
		driver.manage().window().maximize();
	}
	
	@Test
	public void launchApp() throws InterruptedException {
		driver.get("https://beta-mb.somoyinfo.com");
		Thread.sleep(2000);
		System.out.println("Open Website");
	}
	@Test
	public void login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement
		(By.xpath("//button[@class='sm:w-[120px] sm:h-[44px] w-[95px] h-[36px] rounded-md text-white sm:text-tsm-bold text-caption bg-primary hover:bg-primaryHover']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("monira.azad07@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void otp() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/input[1]")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/input[2]")).sendKeys("5");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/input[3]")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/input[4]")).sendKeys("3");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
