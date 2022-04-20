package com.harman.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.openemr.io/b/openemr");
		
		String tdata =  driver.findElement(By.partialLinkText("Licensing")).getText();
		System.out.println(tdata);
		
		String tdata3 =  driver.findElement(By.partialLinkText("Licensing")).getAttribute("href");
		System.out.println(tdata3);
		
		String tdat2 =  driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		System.out.println(tdat2);
	}

}
