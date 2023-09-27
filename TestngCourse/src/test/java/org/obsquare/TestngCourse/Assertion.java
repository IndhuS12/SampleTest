package org.obsquare.TestngCourse;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base{
	@Test
	public void verifySingleInputField() 
	{
		
		String input = "hello";
		WebElement Entermessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Entermessage.sendKeys(input);
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourmessageText = yourmessage.getText();
		String expectedMessage="Your Message : "+input;
		assertEquals(expectedMessage,yourmessageText,"The expected message is"+expectedMessage+"not available"); 
	}
	
	@Test
	public void assertIsSelected()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement clickonthischeckbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickonthischeckbox.click();
		boolean ischeckboxbuttonselected = clickonthischeckbox.isSelected();
		//assertTrue(condition,negativemessage)
		assertTrue(ischeckboxbuttonselected,"The checkbox is not selected");
	}
	@Test
	public void assertFalseSample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement clickonthischeckbox = driver.findElement(By.xpath("//label[@for='gridCheck']"));
		clickonthischeckbox.click();
		boolean ischeckboxbuttonselectedbeforeclick = clickonthischeckbox.isSelected();
		assertFalse(ischeckboxbuttonselectedbeforeclick,"The single checkbox is selected before click");
		
	}
	@Test
	public void showMessagebuttonbelowSingleInputField()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement singleinputbutton = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		int locationofshowmessagebutton=showmessagebutton.getLocation().getY();
		int locationofsingleinputbutton=singleinputbutton.getLocation().getY();
		boolean ButtonIsDisplayed=locationofshowmessagebutton>locationofsingleinputbutton;
		//WebElement ButtonIsDisplayedbelowsingleInputField=driver.findElement(By.xpath("//form[@method='POST']"));
		assertTrue(ButtonIsDisplayed,"The button is displayed below single input field");
	}

	@Test
	public void gettotalButtonText()
	{
		String textofgettotal="Get Total";
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement gettotal=driver.findElement(By.xpath("//button[text()='Get Total']"));
		String output=gettotal.getText();
		assertEquals(output,textofgettotal,"The expected message is not shown");
		
	}
	
	
	@Test
	public void gettextShowButton() {
		String textofgettotal="Show Messages";
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement gettotal=driver.findElement(By.xpath("//button[@id='button-one']"));
		String outputDisplay=gettotal.getText();
		boolean compare=textofgettotal.equals(outputDisplay);
		assertFalse(compare,"The text of gettextbutton is wrong");
		}
	
	
	
	
	}

