package makemytripSelenium;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalanders {

	public static void selectDate(WebElement calendar, String year,
			String monthName, String day, WebDriver driver)
			throws ParseException {
		// Clicking on calendar to open calendar widget
		calendar.click();

		// Retrieving current year value
		String currentYear = driver
				.findElement(
						By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"))
				.getText();

		// Click on Next arrow till we get desired year
		if (!currentYear.equals(year)) {
			do {
				driver.findElement(By.xpath("(//span[text()='Next'])[1]"))
						.click();
			} while (!driver
					.findElement(
							By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"))
					.getText().equals(year));

		}

		// Select desired month after selecting desired year

		String currentMonth = driver
				.findElement(
						By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]"))
				.getText();
		if (!currentMonth.equalsIgnoreCase(monthName)) {
			do {
				driver.findElement(By.xpath("(//span[text()='Next'])[1]"))
						.click();
			} while (!driver
					.findElement(
							By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]"))
					.getText().trim().equalsIgnoreCase(monthName));

		}
		// get java month number for desired month

		int javaMonthInt = WorkingWithCalanders.getMonthJavaInt(monthName);

		// Find dates of desired month only

		List<WebElement> allDateOfDesiredMonth = driver
				.findElements(By
						.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table/tbody[1]//td[(@class=' ' or @class=' ui-datepicker-week-end ' ) and @data-month='"
								+ javaMonthInt + "']"));
		for (WebElement d : allDateOfDesiredMonth) {
			if (d.getText().trim().equals(day)) {
				d.click();
				break;
			}
		}

	}

	// Code to get java month number
	public static int getMonthJavaInt(String monthName) throws ParseException {

		Date date = new SimpleDateFormat("MMMM").parse(monthName);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MONTH);
	}

	public static void main(String[] args) throws ParseException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d5kumar\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.makemytrip.com");

		// Locating departure date calendar
		WebElement departCal = driver.findElement(By.className("lbl_input latoBold appendBottom10"));
		WorkingWithCalanders.selectDate(departCal, "2017", "September", "22",
				driver);

	}
}
