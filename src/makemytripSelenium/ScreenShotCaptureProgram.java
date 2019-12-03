package makemytripSelenium;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShotCaptureProgram {

	
	public static void main(String[] args) throws IOException, AWTException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String uRl="'https://www.flipkart.com'";
	String fullUrl= "window.location ="+uRl;
	js.executeScript(fullUrl);
//	TakesScreenshot ts = (TakesScreenshot) driver;
//	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	String path=System.getProperty("user.dir")+"/ScreenCapturesPNG/"+System.currentTimeMillis()+".png";
//	File destFile= new File(path);
//	FileUtils.copyFile(sourceFile, destFile);
	
	Robot r= new Robot();
	Rectangle ScreenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	BufferedImage tempFile= r.createScreenCapture(ScreenSize);
	//String path= System.getProperty("user.dir")+"/ScreenCpatureRobotPNG/"+System.currentTimeMillis()+".PNG";
	ImageIO.write(tempFile, "png", new File(path));
	driver.quit();
	
	
	
}
}