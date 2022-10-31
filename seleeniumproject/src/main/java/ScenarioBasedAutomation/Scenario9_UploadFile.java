package ScenarioBasedAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario9_UploadFile {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");



	       WebDriver wd = new FirefoxDriver();



	       wd.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	        Thread.sleep(2000);
	        wd.findElement(By.xpath("/html//input[@id='myFile']"))
	                .sendKeys("C:\\Users\\Hemant.Singh1\\CollegeService\\seleeniumproject\\FileUp\\UpdatedPhoto.jpg");



//	        wd.findElement(By.cssSelector("span:nth-child(2)")).sendKeys("C:\\Users\\Hemant.Singh1\\CollegeService\\seleeniumproject\\FileUp\\UpdatedPhoto.jpg");




	        Thread.sleep(2000);
	        wd.quit();
	}

}
