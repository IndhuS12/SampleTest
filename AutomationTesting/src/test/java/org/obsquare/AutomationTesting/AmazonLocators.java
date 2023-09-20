package org.obsquare.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLocators extends Base

{

	public void WebamazonLocators() {
		// by id
		WebElement showmessagebutton = driver.findElement(By.id("button-one"));
		WebElement getTotal = driver.findElement(By.id("button-two"));
		WebElement Entermessage = driver.findElement(By.id("single-input-field"));
		WebElement entervalue = driver.findElement(By.id("value-a"));
		WebElement entervalueB = driver.findElement(By.id("value-b"));

		// by class
		WebElement message = driver.findElement(By.className("form-control"));
		WebElement imputform = driver.findElement(By.className("nav-link"));
		WebElement header = driver.findElement(By.className("card-header"));
		WebElement display = driver.findElement(By.className("my-2"));

		driver.navigate().to("https://toolsqa.com/");
		// by cssSelector tag.className
		WebElement tutorials = driver.findElement(By.cssSelector("span.navbar__tutorial-menu--text"));
		WebElement articles = driver.findElement(By.cssSelector("div.heading__articles"));
		WebElement email = driver.findElement(By.cssSelector("input.subscribe__email"));
		WebElement read = driver.findElement(By.cssSelector("a.new-training__read-more"));
		WebElement learner = driver.findElement(By.className("learner"));

		driver.navigate().back();
		// by cssselector tag#id
		WebElement bar = driver.findElement(By.cssSelector("a#progress-bars"));
		WebElement button = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement shmessage = driver.findElement(By.cssSelector("button#button-one"));
		WebElement valuebutton = driver.findElement(By.cssSelector("input#value-b"));
		WebElement getvalue = driver.findElement(By.cssSelector("button#button-two"));

		driver.navigate().to("https://www.google.com/");
		// by CssSelector tag[attribute=value]
		WebElement syntax = driver.findElement(By.cssSelector("img[class=lnXdpd]"));
		WebElement target = driver.findElement(By.cssSelector("a[target=_top]"));
		WebElement signin = driver.findElement(By.cssSelector("span[class=gb_Dd]"));
		WebElement googleapps = driver.findElement(By.cssSelector("a[aria-expanded=false]"));
		WebElement displayed = driver.findElement(By.cssSelector("li[id=mitGyb]"));

		driver.navigate().back();

		// by partiallinktext
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");

		WebElement SimpleFormDemo = driver.findElement(By.partialLinkText("Simple"));
		WebElement CheckboxDemo = driver.findElement(By.partialLinkText("Check"));
		WebElement SelectInput = driver.findElement(By.partialLinkText("Select"));

		// by linktext
		WebElement table = driver.findElement(By.linkText("Simple Form Demo"));
		WebElement checkbox = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement radiobuttons = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement selectelement = driver.findElement(By.linkText("Select Input"));
		WebElement form = driver.findElement(By.linkText("Form Submit"));

		// by name
		driver.navigate().to("https://www.orangehrm.com/");
		WebElement name = driver.findElement(By.name("EmailHomePage"));
		WebElement free = driver.findElement(By.name("action_request"));

		driver.navigate().to("https://toolsqa.com/");
		// by xpath
		WebElement tools = driver.findElement(By.xpath("//img[@class='tools-qa-header__logo']"));
		WebElement test = driver.findElement(By.xpath("//a[@class='navbar__tutorial-menu']"));
		WebElement hamburger = driver.findElement(By.xpath("//div[@class='hamburger-menu-overlay']"));

		driver.navigate().to("https://demo.guru99.com/insurance/v1/index.php");
		// by contains
		WebElement names = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		WebElement login = driver.findElement(By.xpath("//input[contains(@name,'submit')]"));

		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		// by starts with
		WebElement starts = driver.findElement(By.xpath("//a[starts-with(text(),'Simple')]"));
		WebElement Startswith = driver.findElement(By.xpath("//li[starts-with(@class,'list')]"));
		WebElement start = driver.findElement(By.xpath("//div[starts-with(@class,'container')]"));
		WebElement startsw = driver.findElement(By.xpath("//script[starts-with(@type,'text')]"));

		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		// by Xpath with and
		WebElement username = driver.findElement(By.xpath("//input[@name='userName' and @type='text']"));
		WebElement passwords = driver.findElement(By.xpath("//input[@name='password' and @type='password']"));
		WebElement link = driver.findElement(By.xpath("//a[contains(@href,'https://www.guru99.com/') and @title='Home']"));
		WebElement register = driver.findElement(By.xpath("//a[contains(@href,'register.php')and text()='REGISTER']"));

		// by xpath with OR
		WebElement submiit = driver.findElement(By.xpath("//input[@type='submit' or @value='1']"));
		WebElement or = driver.findElement(By.xpath("//a[contains(text(),'Flights') or @name='name']"));

	}

	public void driverClose() {
		driver.close();
	}

	public static void main(String args[]) {
		AmazonLocators alocator = new AmazonLocators();
		alocator.InitializeBrowser();
		alocator.WebamazonLocators();
		alocator.driverClose();

	}
}
