package org.obsquare.TestngCourse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
@BeforeMethod
	public void InitializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Superadmin\\Documents\\GitHub\\SampleTest\\TestngCourse\\src\\main\\java\\com\\obsquare\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
@AfterMethod
	public void driverClose() {
		driver.quit();
	}

	public static void main(String args[]) {
		Base base = new Base();
		base.InitializeBrowser();
		base.driverClose();
	}

}


