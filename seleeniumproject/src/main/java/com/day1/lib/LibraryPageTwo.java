package com.day1.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LibraryPageTwo {
	 WebDriver wd;
	    By usernm = By.name("username");
	    By passwd = By.name("password");
	    By signinbutton = By.name("signon");




	    public void DriverInit2(WebDriver wd) {
	        this.wd = wd;
	    }



	   public void EnterUserName() {
	        if (wd.findElement(usernm).isDisplayed()) {
	            wd.findElement(usernm).clear();
	            wd.findElement(usernm).sendKeys("testuser1");
	        } else {
	            System.out.println("The element user name is not present");
	        }
	    }



	   public void EnterPassword() {
	        if (wd.findElement(passwd).isDisplayed()) {
	            wd.findElement(passwd).clear();
	            wd.findElement(passwd).sendKeys("1234");
	        } else {
	            System.out.println("The element password does not exist");
	        }
	    }



	   public void ClickSignOn() {
	        if (wd.findElement(signinbutton).isDisplayed()) {
	            wd.findElement(signinbutton).click();
	        } else {
	            System.out.println("The element Signin does not exist");
	        }



	   }
}
