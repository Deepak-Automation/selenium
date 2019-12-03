package selenium;

public class SelectClassOperation {
	
	package MakeSeleniumEasy;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class HandleBoxOfOptions {

		
		
		public static void selectMenuSubmenu(WebDriver driver, WebElement menu, WebElement submenu, String ActionType) throws InterruptedException
		{
			// if submenu opens on click on menu
			if(ActionType.equalsIgnoreCase("Click"))
			{
				menu.click();
				submenu.click();
			}
			// if sub menu opens on hover on menu
			else
			{
				Actions action= new Actions(driver);
				action.moveToElement(menu).build().perform();
				Thread.sleep(3000);
				submenu.click();
			}
		}
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("file:///C:/Users/amodm/Desktop/DDTB.html");
			
			// handling select drop down
			
			
			WebElement selectmenu= LocatorClass.getLocatorClass(driver).getSelectTagMenu();
			WebElement selectSubmenu= LocatorClass.getLocatorClass(driver).getSelectTagAudiSubMenu();
			HandleBoxOfOptions.selectMenuSubmenu(driver, selectmenu, selectSubmenu, "Click");
			Thread.sleep(10000);
			
			
			// handling click able drop down
			WebElement clickablemenu= LocatorClass.getLocatorClass(driver).getClickableMenu();
			WebElement clickableSubmenu= LocatorClass.getLocatorClass(driver).getClickableSubMenu();
			HandleBoxOfOptions.selectMenuSubmenu(driver, clickablemenu, clickableSubmenu, "Click");
			Thread.sleep(10000);
			
			// handling click able drop down
			driver.navigate().back();
			Thread.sleep(5000);
			WebElement hoverablemenu= LocatorClass.getLocatorClass(driver).getHoverableMenu();
			WebElement hoverableSubmenu= LocatorClass.getLocatorClass(driver).getHoverableSubMenu();
			HandleBoxOfOptions.selectMenuSubmenu(driver, hoverablemenu, hoverableSubmenu, "Hover");
			Thread.sleep(10000);
			
			driver.quit();
		}
	}

}
