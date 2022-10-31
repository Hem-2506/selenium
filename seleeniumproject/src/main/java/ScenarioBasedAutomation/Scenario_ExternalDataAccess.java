package ScenarioBasedAutomation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario_ExternalDataAccess {

	public static void main(String[] args) throws InterruptedException, IOException {
	     //Step-1
        //Set the driver path
        System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
        
        //Step - 2
        //Crate the instance for FireFox Browser
        WebDriver wd = new FirefoxDriver();
        
        FileReader fr = new FileReader(".//TestData//data.properties");
        
        Properties p = new Properties();
        p.load(fr);
        
        //Invoke login page
        wd.navigate().to(p.getProperty("baseurl"));
        wd.findElement(By.name("email")).sendKeys(p.getProperty("unm"));
        wd.findElement(By.name("password")).sendKeys(p.getProperty("pwd"));
        
        Thread.sleep(4000);
        wd.close();
	}

}
