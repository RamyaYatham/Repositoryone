package com.hrms.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exp_testng2 {
	@BeforeMethod
	public void login() {
		System.out.println("login completed");
	}
		@AfterMethod
	public void logut() {
		System.out.println("logout completed");
	}
		@Test(priority=2)
	public void Addemp() {
		System.out.println("add new emp");
	}
		@Test(priority=1)
	public void delemp() {
		System.out.println("delete employee");
	}
}
