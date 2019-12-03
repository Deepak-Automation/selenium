package makemytripSelenium;

import java.awt.RenderingHints.Key;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActKeyboardOperation extends ActOperations {

	public static void main(String[] args) throws  IOException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		try{
			driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > button")).click();
		}
		catch(Throwable e){
			System.out.println("No actions needed");
			
		//FileWriter fw = new FileWriter("C:\\Users\\d5kumar\\Documents\\All Profiles\\new1");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		

	}

	}
}
