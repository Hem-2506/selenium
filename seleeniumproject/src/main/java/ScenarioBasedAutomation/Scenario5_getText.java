package ScenarioBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario5_getText {

	public static void main(String[] args) {
		   //Set the driver path
        System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
        
        //Step - 2
        //Crate the instance for FireFox Browser
        WebDriver wd = new FirefoxDriver();

        wd.get("https://www.bmw.in/en/index.html");
        
        WebElement el;
        
       el = wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[3]/div/div[2]/div[1]/a"));
        String str = el.getText();
        System.out.println(str);
	}

}
