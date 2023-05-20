package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class General extends Global {
	
	//standard rule: To provide all methods for whole application
		public  void openApplication() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		}
		public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		}
		public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");
		}
		public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		}
		public void enterFrame(){
		driver.switchTo().frame(frame_empinfo);
		System.out.println("entered into frame");
		}
		public void exitFrame() {
			driver.switchTo().defaultContent();
			System.out.println("exit from frame");
		}
		public void addNewEmp() {
			driver.findElement(By.xpath(btn_Add)).click();
			driver.findElement(By.name(txt_afn)).sendKeys(afn);
			driver.findElement(By.name(txt_aln)).sendKeys(aln);
			driver.findElement(By.id(btn_Save)).click();
			System.out.println("emp name added");
		}

		    public void mouseOvr(){
			
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(By.linkText(link_mouseOvr))).perform();
			System.out.println("Mouseover completed");
			
			driver.findElement(By.linkText(empList)).click();
			System.out.println("clicked on the emp list");
			
		    }
			
			
			public void editEmp() {
			
			Select st = new Select(driver.findElement(By.name(txt_searchBy)));
			st.selectByIndex(2);
			System.out.println("element found");
			
			driver.findElement(By.name(txt_searchFor)).sendKeys(afn);
			System.out.println("emp first name entered");
			
			driver.findElement(By.xpath(btn_search)).click();
			System.out.println("search btn entered");
			
			driver.findElement(By.xpath(link_name)).click();
			System.out.println("clicked on name link");
			
			driver.findElement(By.name(btn_edit)).click();
			
			WebElement wf=driver.findElement(By.name("txtEmpFirstName"));
			wf.clear();
			System.out.println("existed first name cleared");
			
			driver.findElement(By.name(txt_editedFN)).sendKeys(editfn);
			System.out.println("edited first name entered");
			
			WebElement wl=driver.findElement(By.name("txtEmpLastName"));
			wl.clear();
			System.out.println("existed last name cleared");
			
			driver.findElement(By.name(txt_editedLN)).sendKeys(editln);
			System.out.println("edited last name entered");
			
			driver.findElement(By.name(btn_save)).click();
			System.out.println("save btn clicked");
			
		
			
		}
		
		public void deleteEmp() {

			
			Select st1 = new Select(driver.findElement(By.name(txt_searchBy)));
			st1.selectByValue("1");
			System.out.println("element found");
			
			driver.findElement(By.name(txt_searchFor)).sendKeys(afn);
			System.out.println("First name entered");
			
			driver.findElement(By.xpath(btn_search)).click();
			System.out.println("Search btn clicked");
			
			driver.findElement(By.name("chkLocID[]")).click();
			System.out.println("checkbox clicked");
			
			driver.findElement(By.xpath(btn_Delete)).click();
			System.out.println("Existed name deleted");
		}

}
