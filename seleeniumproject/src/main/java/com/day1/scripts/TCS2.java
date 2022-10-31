package com.day1.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TCS2 {

	public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe ");
        
        // Step :- 2
        // Create a instance for Firefoxdriver
        
        WebDriver wd = new FirefoxDriver();
        
//        Maximize the browser window
        wd.manage().window().maximize();
        
// Invoke application under test
        wd.get("https://demo.opencart.com/");
        
        String expTitle = "Your Store";
        String actTitle = wd.getTitle();
        
        System.out.println("The page title is :" + actTitle);
        if(expTitle.equals(actTitle)) {
        	System.out.println("The application is invoked successfully");
        }
        else {
        	System.out.println("wrong url");
        }
        
   //   Thread.sleep(3000);
      
String value = wd.findElement(By.xpath("//span[contains(text(),\"My Account\")]")).getText();
        
        System.out.println(value);
        
	}
	


}
