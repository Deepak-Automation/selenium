package makemytripSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		//String s= driver.findElement(By.id("u_0_l")).getAttribute("input");
		//System.out.println(s);
				
		
//		WebElement radioButtonFemale = driver.findElement(By.name("sex"));
//		if (radioButtonFemale.isEnabled()){
//			if (radioButtonFemale.isSelected()){
//				System.out.println("radio button is seleted");
//			}
//			else{
//				radioButtonFemale.click();
//				Thread.sleep(20000);
//				System.out.println("radio button now selected");
//			}
//		}
//		else{
//		System.out.println("radio button is not enable");
//		}
		
		List<WebElement> allElements = driver.findElements(By.name("sex"));
		
		for (int i =0; i<=allElements.size()-1;i++){
			
			
			WebElement current_text= allElements.get(i);
			System.out.println(current_text);
			Thread.sleep(2000);
			current_text.click();
			String a=current_text.getText();
			System.out.println(a);
			Thread.sleep(2000);
			//String textvalue = current_text.getAttribute("name");
			//System.out.println(textvalue);
		}
		
		//driver.findElement(By.xpath("//*[@id='u_0_9']")).click();
		
		
		driver.quit();
	}

}
