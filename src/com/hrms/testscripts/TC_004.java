package com.hrms.testscripts;
import com.hrms.lib.General;
public class TC_004 {

	public static void main(String[] args) {
		
		General obj = new General();
		
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.deleteEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();

	}

}
