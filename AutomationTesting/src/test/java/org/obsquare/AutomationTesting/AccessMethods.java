package org.obsquare.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessMethods extends Base{
	
	public WebDriver driver;
	
	public void accessMethods()
	{
	//parent
	WebElement adani=driver.findElement(By.xpath("//a[contains(text(),'Adani Power Ltd')]/parent::td"));
	WebElement chola=driver.findElement(By.xpath("//a[contains(text(),'Cholamandalam Financ')]"));
	WebElement jaya=driver.findElement(By.xpath("//a[contains(text(),'Jaiprakash Power Ven')]/parent::td"));
	
	//child
	driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement form=driver.findElement(By.xpath("//nav[contains(@class,'navbar navbar-expand-md navbar-dark')]/child::a[@class='navbar-brand']"));
	WebElement jquery=driver.findElement(By.xpath("//li[@class='nav-item']/child::a[@id='progress-bars']"));
	WebElement jquery2=driver.findElement(By.xpath("//button[@type='button']/child::span[@class='navbar-toggler-icon']"));
	
	//ancestor
	WebElement align=driver.findElement(By.xpath("//a[@class='nav-link']/ancestor::ul[@class='navbar-nav']"));
	WebElement ment=driver.findElement(By.xpath("//button[@type='button']/ancestor::div[@class='mb-sec']"));
	WebElement navi=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']/ancestor::nav[contains(@class,'navbar navbar-expand-md navbar-dark')]"));
	
	//descendent
	WebElement home=driver.findElement(By.xpath("//ul[@class='navbar-nav']/descendant::a[contains(text(),'Home')]"));
	WebElement page=driver.findElement(By.xpath("//div[@class='row']/descendant::a[@class='navbar-brand']"));
	WebElement List=driver.findElement(By.xpath("//ul[@class='navbar-nav']/descendant::a[contains(text(),'List Box')]"));
	
	
	//following
	WebElement button=driver.findElement(By.xpath("//button[@id='button-one']/following::div[@id='message-one']"));
	WebElement idcard=driver.findElement(By.xpath("//button[@id='button-two']/following::div[@id='message-two']"));
	WebElement submit=driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]/following::a[contains(text(),'Select Input')]"));
	
	//presecending
	WebElement buton=driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]/preceding::div[@class='mb-sec']"));
	WebElement display=driver.findElement(By.xpath("//a[@class='navbar-brand']/preceding::div[@class='container']"));
	WebElement show=driver.findElement(By.xpath("//a[contains(text(),'Alerts and Modals')]/preceding::div[@class='container']"));
	
	//following-siblings
	WebElement hide=driver.findElement(By.xpath("//button[@id='button-one']/following-sibling::div[@id='message-one']"));
	WebElement shows=driver.findElement(By.xpath("//label[contains(text(),'Enter value A')]/following-sibling::input[@type='text']"));
	WebElement title=driver.findElement(By.xpath("//label[@for='inputEmail4']/following-sibling::input[@type='text']"));
	
	//preceding-siblings
	WebElement tool=driver.findElement(By.xpath("//input[@type='text']/preceding-sibling::label[contains(text(),'Enter Message')]"));
	WebElement drive=driver.findElement(By.xpath("//div[@class='form-group']/preceding-sibling::div[@class='form-group']"));
	WebElement gate=driver.findElement(By.xpath("//li[@class='nav-item']/preceding-sibling::li[@class='nav-item']"));
	}
	public void driverclose()
	{
		driver.close();
	}
	

	public static void main(String[] args) {
		AccessMethods accessmethods=new AccessMethods();
		accessmethods.InitializeBrowser();
		accessmethods.accessMethods();
		accessmethods.driverclose();

	}

}
