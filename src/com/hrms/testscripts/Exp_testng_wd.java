package com.hrms.testscripts;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_testng_wd {
	WebDriver driver;
	@BeforeClass
	public void startup() {
		driver = new FirefoxDriver();
	}
@AfterClass
public void teardown() {
	driver.quit();
	System.out.println("close application");
	Reporter.log("close application");
}
@Test
public void tc001() throws Throwable {
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("application opened");
	Reporter.log("application opened");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");    
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	Reporter.log("login completed");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
}
}
