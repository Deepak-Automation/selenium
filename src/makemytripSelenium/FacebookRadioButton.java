package makemytripSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		
		Boolean button = driver.findElement(By.xpath("//*[@id='u_0_5']")).isEnabled();
		
		//WebElement wbm = driver.findElement(By.xpath("//*[@id='u_0_5']"));
		
		Actions act = new Actions(driver);
		
			
	    //boolean button1 = wbm.isSelected();
		
		if (button){
			
			System.out.println("it is already selected");
		}
		else{
			
			//act.moveToElement(wbm).perform();
			//wbm.click();

		}
		Thread.sleep(100);
		
		driver.quit();
		
		}
		
	}

