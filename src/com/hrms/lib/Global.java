package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
//maintains all the test data, variables and objects related to the project 
	
	// open the browser 
	public WebDriver driver;
	
	//        DT  var          VV
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
    public String efn= "Ramya";
    public String eln="Yatham";
//=======Objects/elements
			public String txt_loginname = "txtUserName";
			public String txt_password = "txtPassword";
			public String btn_login = "Submit";
			public String link_logout = "Logout";
			public String frm_empinfo="rightMenu";
			public String btn_add="//input[@value='Add']";
			public String txt_efn = "txtEmpFirstName";
			public String txt_eln = "txtEmpLastName";
			public String btn_save="savebutton";
			public String DD_searchby="loc_code";
			public String DD_empid="Emp. ID";
			
}
