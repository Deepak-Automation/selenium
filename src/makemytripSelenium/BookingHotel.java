package makemytripSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class BookingHotel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com");

		driver.findElement(By.className("chNavText darkGreyText")).click();
		driver.findElement(
				By.cssSelector("#root > div > div:nth-child(2) > div > div.makeFlex > div > div.hsw_inner > div.hsw_inputBox.selectHtlCity > label"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div/input"))
				.sendKeys("chennai");
		
		

	}

}
