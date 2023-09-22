package org.obsquare.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webCommands() 
	{

		WebElement Entermessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Entermessage.sendKeys("goodmorning");
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessageText = yourmessage.getText();

	}

	public void webcommands2()
	{
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showmesageButtonClassName = showmessagebutton.getAttribute("class");
		String showmessageButtonBackgroundcolor = showmessagebutton.getCssValue("background-color");
	}

	public void verifySingleInputField() 
	{
		String input = "goodEvening";
		WebElement Entermessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Entermessage.sendKeys(input);
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessageText = yourmessage.getText();
		if (yourmessageText.contains(input)) {
			System.out.println("the single input field is passed");
		} else {
			System.out.println("the single input field is failed");
		}

	}

	public void verifyfontColorofshowbutton() 
	{
		WebElement showmessagebuttonfontcolor = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showmessagebuttonfontcolourClassname = showmessagebuttonfontcolor.getAttribute("id");
		String showmessagebuttonfontcolour = showmessagebuttonfontcolor.getCssValue("color");
		if (showmessagebuttonfontcolour.equals("rgba(255, 255, 255, 1)")) {
			System.out.println("The font color is passed");
		} else {
			System.out.println("the font is failed");
		}
	}

	public void verifyfontWeightofGettotal()
	{
		WebElement gettotalbutton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String classnamefontweight = gettotalbutton.getAttribute("id");
		String fontweightofgettotalbutton = gettotalbutton.getCssValue("font-weight");
		if (fontweightofgettotalbutton.equals("400"))
		{
			System.out.println("the method is pass");
		} else 
		{
			System.out.println("the method is fail");
		}
	}

	public static void main(String[] args) {
		
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.InitializeBrowser();
		webelementcommands.webCommands();
		webelementcommands.webcommands2();
		webelementcommands.verifyfontColorofshowbutton();
		webelementcommands.verifySingleInputField();
		webelementcommands.verifyfontWeightofGettotal();
		webelementcommands.driverClose();

	}

}
