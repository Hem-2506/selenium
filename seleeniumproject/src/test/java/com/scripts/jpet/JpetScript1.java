package com.scripts.jpet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.day1.lib.LibraryPageOne;
import com.day1.lib.LibraryPageTwo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;






public class JpetScript1 {
        // Page objects
        LibraryPageOne obj1 = new LibraryPageOne();
        LibraryPageTwo obj2=new LibraryPageTwo();
         static WebDriver wd;
         
         static ExtentTest test2;
         static ExtentReports rep2;
         
      @BeforeTest
      public void f() {
          System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
          wd = new FirefoxDriver();
          
          rep2= new ExtentReports(System.getProperty("user.dir") + "./Reports/newtours1.html");
          test2 = rep2.startTest("JpetScript1S");
          
      }
      
      @Test(priority=1)
      public void Fun_JpetInvoke() throws InterruptedException {
          obj1.init1(wd);
          obj1.Fun_LaunchJpetApp();
          test2.log(LogStatus.PASS, "User has successfully invoked the application");
          Thread.sleep(2000);
          
      }
      @Test(priority=2)
      public void Fun_JpetClickSignin() throws InterruptedException {
          obj1.Fun_ClickSignin();
          test2.log(LogStatus.PASS, "Signin Clicked");
          Thread.sleep(2000);
      }
      @Test(priority=3)
      public void Fun_Enter_UserName() throws InterruptedException {
          obj2.DriverInit2(wd);
          obj2.EnterUserName();
          test2.log(LogStatus.PASS, "Username is entered");
          Thread.sleep(2000);
      }
      @Test(priority=4)
      public void Fun_Enter_Password() throws InterruptedException {
          obj2.EnterPassword();
          test2.log(LogStatus.PASS, "Password has been entered");
          Thread.sleep(2000);
      }
      @Test(priority=5)
      public void Fun_Click_Signon() throws InterruptedException {
          obj2.ClickSignOn();
          test2.log(LogStatus.PASS, "Signon clicked");
          Thread.sleep(2000);      
      }
      @Test(priority=6)
      public void displayString() {
          System.out.println("Hello!");
          test2.log(LogStatus.PASS, "User is succesfully dispalyString application");
    }

      
      @AfterTest
      public void Fun_CloseBrowser() {
          wd.manage().deleteAllCookies();
          wd.close();
          rep2.endTest(test2);
          rep2.flush();
          rep2.close();
      }


}
