package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("prash@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("prash@123");

		driver.findElement(By.name("login")).click();
		
		
	}

}
