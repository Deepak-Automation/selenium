package makemytripSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbElementVerification {

	public static void main(String[] args) throws InterruptedException {
		String expectedMsg = "Couldn't find your Google Account";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		//driver.findElement(By
				//.xpath("//*[@id='view_container']/div/div/div[2]/div/div/div/form/span/section/div/span/div/div/ul/li[4]/div"));
		driver.findElement(By.id("identifierId")).sendKeys("jakddbsj");
		String wbm= driver.findElement(By.id("identifierId")).getAttribute("input");
		driver.findElement(By.cssSelector("#identifierNext > span")).click();
		Thread.sleep(2000);
		String actualMsg = driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > span > div.cDSmF > div > div.LXRPh > div.dEOOab.RxsGPe > div")).getText();
		
		String actualMsg1 = driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > span > div.cDSmF > div > div.LXRPh > div.dEOOab.RxsGPe > div")).getAttribute("span");
		
		
		if (actualMsg.equals(expectedMsg)){
			System.out.println("true");
			System.out.println(wbm);
		}
		else{
			System.out.println("False");
		}
		driver.quit();
	}
	

}
