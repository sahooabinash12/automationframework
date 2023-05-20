package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC_001 {
    
	@Test
	public void TC001() {
		
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
       
	}
	

}
