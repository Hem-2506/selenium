package com.junit.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.day1.lib.Libraryone;

class TestCase1 {

Libraryone l1 = new Libraryone();
	
	@Test
	public void test() {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");

	    WebDriver wd = new FirefoxDriver();
	    
	    l1.initDriver(wd);
	    l1.launchOpencart();
	    l1.Click_On_MyAccount();
		System.out.println("Say Hi");
	}
	
	
	

}
