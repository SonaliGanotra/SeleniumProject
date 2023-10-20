package com.flipkart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_SearchforProduct_002 {
	public String baseURL = "https://www.flipkart.com/";
	public static WebDriver driver;
	public static String url;
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
	public void SearchforProduct() throws Exception {
	driver.get(baseURL);
	driver.manage().window().maximize();
	
	
	driver.findElement(By.className("_30XB9F")).click();
	driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("Traditonal Wear",Keys.ENTER);
	driver.findElement(By.xpath(("(//a[@class=\"IRpwTa _2-ICcC\"])[1]"))).click();
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> iterator = handles.iterator();
	iterator.next();
	String childwindow = iterator.next();
	driver.switchTo().window(childwindow);
	url = driver.getCurrentUrl();
	
	 
	

}
}