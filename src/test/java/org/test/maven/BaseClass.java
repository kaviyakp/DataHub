package org.test.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
//Browser lanuch
	static WebDriver driver;
	public static void browserLaunch() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavi\\eclipse-workspace\\Kavi\\framework\\MavenFirst\\Driver\\chromedriver.exe");
			driver.new ChromeDriver;
			System.out.println("Browser Lanuched");
		}
		catch(Exception e){
			e.getMessage();
			System.out.println("Browser not lanuched");
		}
	}
	//LoadURL
	public static void loadURL(String value) {
		driver.get(value);
		//sendkeys
		public static void fill(WebElement ele , String value) {
			ele.sendKeys(value);
		}
		//Click
		public static void click(WebElement ele) {
			ele.click();
		}
		//To get value
		public static void getAttribute(WebElement ele , String value) {
			String attribute = ele.getAttribute(value);
			System.out.println(attribute);
		}
		
	}
}
