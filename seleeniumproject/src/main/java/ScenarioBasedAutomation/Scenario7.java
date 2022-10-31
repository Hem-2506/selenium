package ScenarioBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario7 {

	public static void main(String[] args) {
		   //Set the driver path
        System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
        
        //Step - 2
        //Crate the instance for FireFox Browser
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.spicejet.com/");  
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();  
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
  
driver.close();  	
	}

}
