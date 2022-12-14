package com.day1.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LibraryPageOne {
	  // Declaration of Webdriver
    WebDriver wd;



   // By variables for webelements
    By text1 = By.xpath("/html/body/div[2]/div[2]/div[1]/div/a[1]/img");
    By signinlink = By.xpath("//a[contains(text( ),\"Sign In\")]");



   // WebDriver initialization for page1



   public void init1(WebDriver wd) {
        this.wd = wd;
    }



   public void Fun_LaunchJpetApp() {
        wd.get("https://petstore.octoperf.com/actions/Catalog.action");
        if (wd.findElement(text1).isDisplayed()) {



           System.out.println("The application is launched");
        } else {
            System.out.println("Wrong url");
        }
        }



   public void Fun_ClickSignin() {
        if (wd.findElement(signinlink).isDisplayed()) {
            wd.findElement(signinlink).click();
        } else {
            System.out.println("The element signin is not present");
        }
        }
}
