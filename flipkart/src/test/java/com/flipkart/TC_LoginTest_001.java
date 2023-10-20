package com.flipkart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginTest_001 {
	public String baseURL = "https://www.flipkart.com/";
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
@Test
public void loginTest() throws Exception {
	driver.get(baseURL);
	driver.manage().window().maximize();

	driver.findElement(By.className("_18u87m")).sendKeys("9478165889");
	driver.findElement(By.xpath("//button[text()=\"Request OTP\"]")).click();
	Thread.sleep(100000);
	
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
		Assert.assertTrue(true);
	} else {
		Assert.assertTrue(false);
		
	}
}
}