package org.obsquare.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators  extends Base
{
	public void webLocators()
	{
		//locating using id
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		WebElement getTotal=driver.findElement(By.id("button-two"));
		WebElement Entermessage=driver.findElement(By.id("single-input-field"));
		WebElement entervalue=driver.findElement(By.id("value-a"));
		WebElement entervalueB=driver.findElement(By.id("value-b"));
		//locating using classname
		WebElement inputform=driver.findElement(By.className("navbar-toggler"));
		//locating using Css selector -tag#id
		WebElement showmessage=driver.findElement(By.cssSelector("button#button-one"));
		//locating using Css selector-tag.className
		WebElement Clearfix=driver.findElement(By.cssSelector("section.clearfix"));
		//locating using css selector -tag[attribute=value]
		WebElement showmessageAttribute =driver.findElement(By.cssSelector("button[id=button-one]"));
		
		
	}
	public static void main(String args[])
	{
		Locators locator=new Locators();
		locator.InitializeBrowser();
		locator.webLocators();
		locator.driverClose();
	}
}
