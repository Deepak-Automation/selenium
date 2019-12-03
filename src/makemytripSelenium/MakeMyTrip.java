package selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actualValue = driver.getTitle();
		
		String expectedValue = "Facebook – log in or sign up";
		
		
		if (expectedValue.equals(actualValue)){
			System.out.println("Conditions matching");
		}
		
		else{
			System.out.println("Title Not matching");
		}
		
		
		
		
		
		//driver.findElement(By.id("email")).sendKeys("deepakkumargiridih@gmail.com");
		
		//driver.findElement(By.id("pass")).sendKeys("abcd");
		
		//driver.findElement(By.xpath("//*[@id='u_0_8']")).click();
		
		driver.quit();
		

	}
}
