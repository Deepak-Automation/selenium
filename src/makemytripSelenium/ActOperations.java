package makemytripSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActOperations {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		try{
			driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > button")).click();
		}
		catch(Throwable e){
			System.out.println("No actions needed");
		}
		// created actions class
		Actions act = new Actions(driver);
		//performing mouse operation
		act.moveToElement(
				driver.findElement(By
						.cssSelector("#container > div > div.zi6sUf > div > ul > li:nth-child(1) > span")))
				.perform();
		Thread.sleep(2000);
		
		WebElement wbm = driver.findElement(
				By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[6]/a"));
		//act.moveToElement(wbm).perform();
		Thread.sleep(10000);
		wbm.click();
		
		
		Thread.sleep(10000);
		
		driver.quit();
	}

}
