package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//******TestData    
	    //   DT  Var       V V
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String afn = "nishant";
	public String aln = "mirkale";
	public String editfn = "abinash";
	public String editln = "sahoo";


	//******Objects/Elements
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login     = "Submit";
	public String link_logout   = "Logout";
	public String txt_afn       = "txtEmpFirstName";
	public String txt_aln       = "txtEmpLastName";
	public String frame_empinfo = "rightMenu";
	public String btn_Add       = "//input[@value='Add']";
	public String btn_Save      = "btnEdit";
	public String link_mouseOvr = "PIM";
	public String empList       = "Employee List";
	public String txt_searchBy  = "loc_code";
	public String txt_searchFor = "loc_name";
	public String btn_search    = "//*[@id=\"standardView\"]/div[2]/input[2]";
	public String link_name     = "//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a";
	public String btn_edit      = "EditMain";
	public String txt_editedFN  = "txtEmpFirstName";
	public String txt_editedLN  = "txtEmpLastName";
	public String btn_save      = "EditMain";
	public String btn_Delete    = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";

}
