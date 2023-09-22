package org.obsquare.TestngCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;

	public void InitializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adminuser\\git\\SampleTest\\AutomationTesting\\src\\main\\java\\com\\obsquare\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	public void loadBrowser() {
		
	}

	public void driverClose() {
		driver.quit();
	}

	public static void main(String args[]) {
		Base base = new Base();
		base.InitializeBrowser();
		base.driverClose();
	}

}


