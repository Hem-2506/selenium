package ScenarioBasedAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario8_ScrollDown {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
        
        //Step - 2
        //Crate the instance for FireFox Browser
        WebDriver wd = new FirefoxDriver();

        wd.get("https://jquery.com/");
        
        Thread.sleep(3000);
         
((JavascriptExecutor)wd).executeScript("scroll(0,500)");
	}

}
