package com.harman.multipletabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.medibuddy.in/");
		
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.linkText("For Employer")).click();
		
		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(2));
		
		driver.findElement(By.id("getInTouchMobile")).sendKeys("12345");
		driver.findElement(By.xpath("//button[text()='Get in Touch']")).click();

	}

}
