package com.day1.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TCS1 {

	public static void main(String[] args) {
      //Step :- 1
        
        // Set the driver path
        
        System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe ");
        
        // Step :- 2
        // Create a instance for Firefoxdriver
        
        WebDriver webdriver = new FirefoxDriver();
        
        // Step :-3
        // Invoke the application
        
        webdriver.get("https://www.solera.com/");
	}

}
