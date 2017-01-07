package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
//			System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
//			WebDriver ffdriver = new FirefoxDriver();
			
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			WebDriver chdriver = new ChromeDriver();
			
			exec (chdriver);
			
//			exec (ffdriver);
			
	}
	
	private static void exec (WebDriver driver) throws InterruptedException{

		
		driver.get("http://www.google.com/xhtml");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		Thread.sleep(1000);
		searchBox.submit();
		Thread.sleep(5000);  // Let the user actually see something!
		driver.quit();
	}
	

}
