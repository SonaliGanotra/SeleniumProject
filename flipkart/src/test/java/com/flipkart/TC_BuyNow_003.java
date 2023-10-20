package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_BuyNow_003 {
	
	public static WebDriver driver;
	public static String url;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	/*@AfterClass
	public void teardown() {
		driver.quit();
	}*/
	
	@Test
	public void BuyNow() throws Exception {
		TC_SearchforProduct_002 search = new TC_SearchforProduct_002();
		search.setup();
		search.SearchforProduct();
	driver.get(search.url);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("9989747757");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(5000);
	boolean text = driver.findElement(By.className("_2sKwjB")).isDisplayed();
	
	Assert.assertEquals(text, true);
	Thread.sleep(10000);
	
	}
	
}