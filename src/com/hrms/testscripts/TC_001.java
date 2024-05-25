package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001 {
	//public static void main(String[] args) {
	// framework advantages - reusablity, avoiding duplicate code, time saving, ease of maintenace, easy access
	@Test
	public void tc001() {
		
		//test steps 
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
		
		
	}
}
