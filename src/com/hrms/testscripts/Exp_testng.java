package com.hrms.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_testng {
	@BeforeClass
public void login() {
	System.out.println("login completed");
}
	@AfterClass
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

