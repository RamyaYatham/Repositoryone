package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	//public static void main(String[] args) {
	@Test
	public void tc002() {
		
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.enterframe();
		obj.Addemp();
		obj.Exitframe();
		obj.logout();
		obj.closeApplication();
	}

}
