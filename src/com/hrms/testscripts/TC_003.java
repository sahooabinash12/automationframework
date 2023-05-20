package com.hrms.testscripts;
 import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC_003 {
    
	@Test
	public void TC003() {
		
		General obj = new General();
		
		obj.openApplication();
		obj.login();
		obj.mouseOvr();
		obj.enterFrame();
		obj.editEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();

	}

}
