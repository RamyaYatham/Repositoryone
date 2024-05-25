package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class General extends Global {
	// maintains all the reusable functions related to project
//            	
	public void openApplication() {
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		}
		public void closeApplication() {
		driver.quit();
		System.out.println("Application closed");
		}
		public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);    
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		}
		public void enterframe() {
		driver.switchTo().frame(frm_empinfo);
		System.out.println("entered into frame");
		}
		public void Exitframe() {
			driver.switchTo().defaultContent();
			System.out.println("exit from frame");
			}
		public void Addemp() {
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		driver.findElement(By.className(btn_save)).click();	
		}
		
		public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");

}
}
