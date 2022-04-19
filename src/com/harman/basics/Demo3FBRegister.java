package com.harman.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("prasanth");
		driver.findElement(By.name("lastname")).sendKeys("arjilli");
		driver.findElement(By.name("reg_email__")).sendKeys("prasanth@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("prasanth@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("prasanth@123");
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("29");
		
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		
		Select selectYear = new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		Select selectPronoun = new Select(driver.findElement(By.name("preferred_pronoun")));
		selectPronoun.selectByVisibleText("They: \"Wish them a happy birthday!\"");
		
		
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
