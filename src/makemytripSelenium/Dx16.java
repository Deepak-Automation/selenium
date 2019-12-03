package makemytripSelenium;

import java.awt.List;
import java.util.*;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dx16 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\d5kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://135.249.28.191");
	driver.findElement(By.xpath("//span[@class= 'caret']")).click();
	driver.findElement(By.xpath("//a[@id= 'langEn']")).click();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("Admin@123");
	driver.findElement(By.id("loginBtn")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//td[@id='activeSw']")).getText();
	 java.util.List<WebElement> l = driver.findElements(By.xpath("//table[@id='UserPorts']/thead/tr/th"));
	 
	 
	 {
		 java.util.List<String> l1= driver.findElements(By.xpath("//table[@id=\"UserPorts\"]/tbody/tr/td[i]")).getText();
		 
		}	
	
	
	//boolean language= driver.findElement(By.xpath("//a/span[@lang ='en']")).isDisplayed();
	//if(language=true){
//		System.out.println("it is enable");
//	}
//	else{
//		System.out.println("not available");
//	}
//	Thread.sleep(20);
	//driver.quit();
	

}
}