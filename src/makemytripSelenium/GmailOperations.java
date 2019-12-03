package makemytripSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailOperations {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		Boolean image =driver.findElement(By.xpath("//*[@id='logo']")).isDisplayed();
		if(image){
			System.out.print("image is available");
			
		}
		else{
			System.out.print("Image not available");
		}
		driver.quit();

	}

}
