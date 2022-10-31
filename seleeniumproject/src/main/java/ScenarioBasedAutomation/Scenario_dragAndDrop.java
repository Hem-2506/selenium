package ScenarioBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_dragAndDrop {

	public static void main(String[] args) {
		   //Step-1
        //Set the driver path
        System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");  
        
        //Step - 2
        //Crate the instance for FireFox Browser
        WebDriver wd = new FirefoxDriver();
         wd.get("https://jqueryui.com/droppable/");
         
         wd.switchTo().frame(0);
         
         Actions act = new Actions(wd);
WebElement src =wd.findElement(By.xpath("//div[@id='draggable']"));
WebElement dest =wd.findElement(By.xpath("//div[@id='droppable']"));

act.clickAndHold(src).moveToElement(dest).release().build().perform();	

	}

}
