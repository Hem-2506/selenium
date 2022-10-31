package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd = new  FirefoxDriver();
		wd.get("https://www.saucedemo.com/");
		wd.findElement(By.cssSelector("#user-name")).sendKeys("Drivre");
		wd.findElement(By.cssSelector("#password")).sendKeys("Drivre");
		
		wd.findElement(By.cssSelector("#login-button")).click();
		wd.close();
	}

}
